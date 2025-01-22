import java.util.Scanner;
public class A2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter array size: ");
		n = sc.nextInt();
		int []arr = new int[n];
		for (int i=0; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		float avg = (float)sum/n;
		System.out.println("Average: "+avg);
	}
}