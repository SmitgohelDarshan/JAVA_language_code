//Write a Java program to create an interface Shape with the getArea() method.

import java.util.Scanner;

import javax.swing.text.html.CSS;

interface Shape{
    void getArea();
}

//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
//Implement the getArea() method for each of the three classes.
class Rectangle implements Shape{
    public void getArea(){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(l*b);
    }
    
}
class Circle implements Shape{
    public void getArea(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(Math.PI * r * r);
    }
}
class Triangle implements Shape{
    public void getArea(){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextInt();
        double b = sc.nextInt();
        System.out.println((0.5) * l *b);
    }
}

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        Triangle t1 = sc.nextInt();

        System.out.println("Enter 1-Rectangle, 2-Circle, 3-Triangle.");
        int choice = sc.nextInt();

        if (choice == 1) {
            r1.getArea();
        }
        else if (choice == 2) {
            c1.getArea();
        }
        else if (choice == 3) {
            t1.getArea();
        }
        
    }
}
