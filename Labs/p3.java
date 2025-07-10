class guest{
    public void read(){
        System.out.println("Read only");
    }
}

class developer extends guest{
    public void write(){
        System.out.println("Write also");
    }
}

class admin extends developer{
   
    public void arrange(){
        System.out.println("Arrange");
    }
    public void read(){
        System.out.println("printing read");
    }
}

public class p3 {

    
    public static void main(String[] args) {

        guest gst = new guest();
        developer dev = new developer();
        admin adm = new admin();
        System.out.println("Guest :- ");
        gst.read();
        System.out.println("Developer");
        dev.read();
        dev.write();
        System.out.println("Admin:- ");
  
        adm.write();
        adm.arrange();
        adm.read();

        
    }
    
}