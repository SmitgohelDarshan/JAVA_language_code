import java.util.Scanner;

public class B4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in Fahrenheit: ");

		float f= sc.nextFloat();	
		System.out.println("F ="+f);

		System.out.println("Celsius = "+((f-32*5/9)));

		// System.out.println("Enter temperature in Celsius");
		// float c= sc.nextFloat();	
		// System.out.println("C ="+c);

		// System.out.println("Fahrenheit = "+((c*9+32)/5));
	}
}	