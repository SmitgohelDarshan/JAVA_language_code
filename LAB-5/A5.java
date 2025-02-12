import java.util.Scanner;
public class A5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        for (int i=0; i< s.length(); i++) {
            for (int j=0; j<=i; j++) {
                char ch = s.charAt(j);
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}