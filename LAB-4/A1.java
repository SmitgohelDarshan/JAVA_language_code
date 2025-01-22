import java.util.Scanner;
public class A1{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.nextLine();
		int vcount=0,ccount=0;
		for (int i=0; i<s.length() ; i++) {
			char ch = s.charAt(i);
			if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vcount++;
			}
			else if(ch==' '){
			}
			else{
				ccount++;
			}
		}
		
		System.out.println("vowel character count = "+vcount);
		System.out.println("constant character count = "+ccount);

	}
}
