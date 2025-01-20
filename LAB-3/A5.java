import java.util.Scanner;
public class A5{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count=0,i,a;
		System.out.println("Enter number:");
		 a = sc.nextInt();
		for (i=1;i<=a;i++) {
			if(a%i==0){
				count++;
			}
		}
		if (count==2) {
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}