import java.util.Scanner;
public class A3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a size of array: ");
		n = sc.nextInt();
		int []arr = new int[n];
		for (int i=0; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=n-1; i>=0; i--) {
			System.out.println("Reverse order: " +arr[i]);
		}
	}
}