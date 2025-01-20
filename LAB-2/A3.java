import java.util.Scanner;

public class A3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length and breath: ");

		float l= sc.nextFloat();	
		System.out.println("L ="+l);
		float b= sc.nextFloat();	
		System.out.println("B ="+b);

		System.out.println("Area Of Rectangle = "+(l*b));
	}
}	