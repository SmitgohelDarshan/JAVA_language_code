import java.util.Scanner;
public class B6{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double year;
	System.out.println("Enter year:");
	year = sc.nextDouble();
	if((year % 4==0 && year %100!=0) || year %400==0){
		System.out.println("Leap year");
	}
	else{
		System.out.println("Not Leap year");
		}
	}	
}