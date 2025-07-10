class Worker {
    String name;
    double salary_R;

    Worker(String name, double salary_R) {
        this.name = name;
        this.salary_R = salary_R;
    }

    double computePay(int hours) {
        return 0; 
    }
}

class DailyWorker extends Worker {
    DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        int daysWorked = hours / 8; 
        return daysWorked * salary_R;
    }
}

class SalariedWorker extends Worker {
    SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        return salary_R * 40; 
    }
}

public class lab5_q3 {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("Ayush", 150);
        Worker salariedWorker = new SalariedWorker("Daksh", 500);

        System.out.println("Daily Worker Pay: " + dailyWorker.computePay(59)); 
        System.out.println("Salaried Worker Pay: " + salariedWorker.computePay(50)); 
    }
}