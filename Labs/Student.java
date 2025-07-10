public class Student {
    String name;
    int roll_no ;
    // public static void main(String[] arg){
    //     Student s1 = new Student();
    //     Student s2 = new Student();
    //     System.out.println(s1);
    //     System.out.println(s2);
    // }

    //paramatersied constructor
    Student(String name, int roll_no) {
        this.name = name; //here this keyword is used to refer to the current object
        this.roll_no = roll_no; // if we remove this keyword it'll go back to the base value which are null and 0 respectively
    }
    public static void main(String[] args) {
        Student s1 = new Student("xyz", 101);
        Student s2 = new Student("pqr", 102);
        System.out.println(s1.name + s1.roll_no);
        System.out.println(s2.name + s2.roll_no);
    }
}