import java.util.*;
public class lab5_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the duration of call: ");
        int duration = sc.nextInt();
        System.out.println("Enter the type of call: ");
        String type = sc.next();
        System.out.println("Enter the rate: ");
        double rate = sc.nextDouble();
        
        Ordinary o = new Ordinary();
        Urgent u = new Urgent();
        Lightning l = new Lightning();
    if(type.equalsIgnoreCase("Ordinary")){
        o.charge(rate,duration);
    }
    else if(type.equalsIgnoreCase("Urgent")){
        u.charge(rate,duration);
    }
    else if(type.equalsIgnoreCase("Lightning")){
        l.charge(rate,duration);
    }
    else{
        System.out.println("Invalid type");
    }
    }

static class trunkCall{
    int duration;
    
    void charge(double rate){
        System.out.println("Trunk call charge: "+duration*rate);
    }
}

static class Ordinary extends trunkCall{
    void charge(double rate,int duration){
        System.out.println("Ordinary call charge: "+duration*rate);
    }
}

static class Urgent extends trunkCall{
    void charge(double rate,int duration){
        System.out.println("Urgent call charge: "+duration*rate);
    }
}

static class Lightning extends trunkCall{
    void charge(double rate,int duration){
        System.out.println("Lightning call charge: "+duration*rate);
    }
}
}