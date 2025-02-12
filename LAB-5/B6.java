import java.util.Scanner;
public class B6{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

		for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n - 1 - i; j++) { //space print
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){   //star print
                if (j<=i) {
                    
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
        for (int i = n-2; i >= 0; i--) { 
            for (int j = 0; j < n - 1 - i; j++) { 
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                if (j<=i) {
                    
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
	}
}