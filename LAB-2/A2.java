import java.util.Scanner;

public class A2{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Two numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt(); 
		System.out.println("a = "+a+ "and b = "+b);
	
		sc.nextLine();
		System.out.println("Choose Operation: 1=Addition,2=Subtraction,3=Multiplication,4=Division");
		String s1= sc.nextLine();
		// if(s1.equals("+")){
		// 	System.out.println("Addition of A and B: "+(a+b));
		// }
		if(s1.equals("1")){
			System.out.println("Addition of A and B: "+(a+b));
		}
		else if(s1.equals("2")){
			System.out.println("Subtraction of A and B: "+(a-b));
		}
		else if(s1.equals("3")){
			System.out.println("Multiplication of A and B: "+(a*b));
		}
		else if(s1.equals("4")){
			System.out.println("Division of A and B: "+(a/b));
		}
		else
			System.out.println("Envalid");

		// String str="+";
		String str="1";
		if(str=="1")
			System.out.println(a+b);
	}
}