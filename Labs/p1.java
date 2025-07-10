import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two strings
        String s1 = "Hello";
        String s2 = "World";
        
        System.out.println(s1);
        System.out.println(s2);
        
        
        // Find the length of both strings

        System.out.println("Length of 1st String is "+s1.length());
        System.out.println("Length of 2nd String is "+s2.length());


        // Concatenate the strings
        String s3 = s1+" "+s2;
        System.out.println("Concatenated String is :- "+s3);


        // Input the index number and print the character at that index
        System.out.println("Enter the index number: ");
        int indx = sc.nextInt();
        System.out.println("Character at index "+indx+" is "+s3.charAt(indx));

        // Input the character and print the index
        System.out.println("Enter the Character to find its index: ");
        char c = sc.next().charAt(0);
        System.out.println("Index of character "+c+" is "+s3.indexOf(c));

        // Swap the first characters of both strings
        String Swap_s1 = s2.charAt(0)+s1.substring(1);
        String Swap_s2 = s1.charAt(0)+s2.substring(1);

        System.out.println("Swapped string 1 is :- "+Swap_s1);
        System.out.println("Swapped string 2 is :- "+Swap_s2);


        // Split the concatenated string at space
        String [] arr = s3.split(" ");
        System.out.println("Splitted strings are :-");
        for(String seprate : arr){
          System.out.println(seprate);
        }
        
        

        // Count repeated characters in a string
        int [] c_count = new int[150];
        System.out.println("Dublicate characters in string are: ");
        for(char s: s3.toCharArray())
        {
            c_count[s]++;
        }
        for(int i=0;i<c_count.length;i++)
        {
            if(c_count[i]>1){
                System.out.println((char) i+":"+ c_count[i]);
            }
        }



        // Reverse the string
        String r ="";
        for(int i = s3.length() - 1; i >= 0; i--){
          r = r + s3.charAt(i);
        }
        System.out.println("Reversed string is :- "+r);



        // Identify the vowels in the string
        System.out.println("Vowels in the string are :-");
        for(int i=0;i<s3.length();i++){
          char ch = s3.charAt(i);
          if("AEIOUaeiou".indexOf(ch)!=-1){
            System.out.println("Index"+i+"="+ch);
            }
        }
          





    }
}