import java.util.Scanner;
public class C8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the last number:");
        b = sc.nextInt();

        for (int num = a; num <= b; num++) {
            boolean isPrime = false; 
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                } else {
                    isPrime = true; 
                }
            }
            

            if (isPrime && num > 1) {
                System.out.println(num + " is Prime");
            }
        }
    }
}
