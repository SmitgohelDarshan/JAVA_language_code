
import java.util.Scanner;
public class A4{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c,d;
	System.out.println("Enter 3 Numbers:");
	System.out.println("Enter first number:");
	 a = sc.nextInt();
	System.out.println("Enter second number:");
	 b = sc.nextInt();
	System.out.println("Enter third Number:");
	 c = sc.nextInt();

	d=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
	System.out.println("Max number:"+d);	
    }
}
