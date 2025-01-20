import java.util.Scanner;

public class C5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Numbers: ");

		float a= sc.nextFloat();	
		System.out.println("A ="+a);
		float b= sc.nextFloat();	
		System.out.println("B ="+b);
		float c= sc.nextFloat();	
		System.out.println("C ="+c);
		
		if(a>b){
			if(a>c)
				System.out.println("A = "+a);
			else
				System.out.println("C = "+c);
		}
		else{
			if(b>c)
				System.out.println("B = "+b);
			else
				System.out.println("C = "+c);
		}
	}
}	