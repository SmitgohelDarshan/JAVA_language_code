import java.util.Scanner;

public class A4{
	public static void main(String[] args) {
		 int a = Integer.parseInt(args[0]);
		 System.out.println("a = "+a);

         int b = Integer.parseInt(args[1]);
		 System.out.println("b = "+b);

		 System.out.print("c = "+(a+b));
		 System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("x = "+x+" and y = "+y);

		System.out.println("z = "+(x+y));
	}
}