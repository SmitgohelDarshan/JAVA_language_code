import java.util.Scanner;

public class A3_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		System.out.println("a = "+a);

		sc.nextLine();
		System.out.println("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = sc.next();  //first whitespace print
		System.out.println("s1 ="+s1+" and s2 ="+s2);
	}
}