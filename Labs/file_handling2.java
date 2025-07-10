import java.io.File;
import java.io.IOException;

public class file_handling2 {
    public static void main(String[] args) throws IOException {
        File myObj = new File("filename2.txt");
        try{
            if(myObj.exists()){
                System.out.println("File exists");
                myObj.delete();
                System.out.println("File deleted");
            }
            else{
                System.out.println("File does not exist");
                myObj.createNewFile();
                System.out.println("File created");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
