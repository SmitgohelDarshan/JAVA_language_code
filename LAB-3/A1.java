import java.util.Scanner;

public class A1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum=0,per,mark=0;
		System.out.println("Enter Marks of Five Subject: ");
		for (int i=0;i<5;i++ ) {
			System.out.println("Enter Marks Of Subject "+(i+1)+":");
		    mark= sc.nextDouble();
		    sum += mark;
		}
		per = mark/5;
		    if (per<40) {
		    	System.out.println("Fail");
		    }
		    if (per>40 && per<49) {
		    	System.out.println("third division");
		    }
		    if (per>50 && per<59) {
		    	System.out.println("second division");
		    }
		    if (per>=60) {
		    	System.out.println("first division");
		    }
	}
}