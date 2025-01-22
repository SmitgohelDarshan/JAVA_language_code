import java.util.Scanner;
public class B4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int length = (s.length());
		System.out.println("Length of String: " +length);

			for (int i=length/2; i<length ; i++) {
				char ch = s.charAt(i);

				System.out.print(ch);
			}
	}
}