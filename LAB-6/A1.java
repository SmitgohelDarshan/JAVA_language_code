import java.util.Scanner;

class circle {
	double radius;
	
	public circle (double radius){
		this.radius = radius;
	}

	public void Area(){
		double area = Math.PI * radius*radius;
		System.out.println("Area of Circle = "+area);
	}
}
public class A1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius to find Area of Circle: ");
		double radius = sc.nextDouble();
		circle area1 = new circle(radius);

		area1.Area();
	}
}