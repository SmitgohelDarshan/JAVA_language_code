import java.util.Scanner;
public class B7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num= sc.nextInt();
		int sum=0,n=num;
		 while (num > 0) {
            int temp = num % 10;
            sum = sum * 10 + temp; 
            num /= 10;
        }
		if (sum==n) {
			System.out.println("Palindrome");
		}
	}
}