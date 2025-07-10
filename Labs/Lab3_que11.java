// Given an array containing N-1 unique numbers from 1 to N, write a Java program to find the missing number.
// Input: [1, 5, 6, 2, 4]  

public class Lab3_que11 {
    int[] n = {1,5,6,2,4};
    int a = n.length + 1;
    int ExpectedSum = a*(a+1)/2;
    int ActualSum = 0;
    
    for(int numbers:n){
        ActualSum+=numbers;
    }
    int missingNumber = ExpectedSum - ActualSum;
        System.out.println("The missing number is: " + missingNumber);
}
