import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    String id;
    private String name;
    private ArrayList<Double> scores;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.scores = new ArrayList<>();
    }

    public void addScore(double score) {
        scores.add(score);
    }

    public double calculateAverage() {
        if (scores.isEmpty()){
        return 0;
        }
        double sum = 0;
        for (double score : scores){
        sum += score;
        }
        return sum / scores.size();
    }

    public boolean hasPassed() {
        return calculateAverage() >= 60;
    }

    public void displayStudentInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Average Score: " + calculateAverage() + ", Status: " + (hasPassed() ? "Pass" : "Fail"));
    }
}

// Grade Manager
class GradeManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            s.displayStudentInfo();
            System.out.println("---------------------");
        }
    }

    public Student findStudentById(String id) {
        for (Student s : students) {
            if (s.id.equals(id)) return s;
        }
        return null;
    }
}

// Main class
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        while (true) {
            System.out.println("1. Add Student\n2. Add Test Scores\n3. View All Students\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    manager.addStudent(new Student(id, name));
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    String searchId = scanner.nextLine();
                    Student student = manager.findStudentById(searchId);
                    if (student != null) {
                        System.out.print("Enter score: ");
                        double score = scanner.nextDouble();
                        student.addScore(score);
                        System.out.println("Score added successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    manager.displayAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
