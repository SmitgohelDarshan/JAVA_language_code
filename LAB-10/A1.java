//Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds 
//Exception using try-catch block.

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Students: ");
        int n = sc.nextInt();

        int[] marks = new int[5];
        int total = 0;
        try{
            for (int i = 0; i < n; i++) {
                    System.out.println("Enter Marks of Student "+i+"");
                    marks[i] = sc.nextInt();
                    total += marks[i];
            }

            int avg = total / n;
            System.out.println("Average: "+avg);
        }
        catch(ArithmeticException ae){
            System.out.println("Enter Number Students at least 1");
        }
        
        catch(ArrayIndexOutOfBoundsException ae1){
            System.err.println("Max Size Of Marks is 5."); //err = in output red line so user see exception.
        }

        System.out.println("Byeeee");
    }
}
