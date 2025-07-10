public class Enquiry {
    Enquiry(String name, long mob_no, String email, String address) {
        System.out.println("Okay");
    }
    Enquiry(String name, String email, String address){
        System.out.println("Mobile number missing.");
    }
    public static void main(String[] args){
        Enquiry t1 = new Enquiry("xyz", 9104, "abc", "def");
        Enquiry t2 = new Enquiry("xyz", "abc", "def");
    }
}