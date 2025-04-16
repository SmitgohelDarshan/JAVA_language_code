import java.util.Scanner;

class ComplexNumber {
    int real;
    int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // public ComplexNumber() { //method overloading  
    //     this.real = 0;
    //     this.imaginary = 0;
    // }


    public void addition(ComplexNumber obj2) {
        this.real += obj2.real;
        this.imaginary += obj2.imaginary;
    }


    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real part of first complex number:");
        int real1 = sc.nextInt();
        System.out.println("Enter imaginary part of first complex number:");
        int imaginary1 = sc.nextInt();

        System.out.println("Enter real part of second complex number:");
        int real2 = sc.nextInt();
        System.out.println("Enter imaginary part of second complex number:");
        int imaginary2 = sc.nextInt();

        ComplexNumber obj1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber obj2 = new ComplexNumber(real2, imaginary2);

        obj1.addition(obj2);

        System.out.print("Sum: ");
        obj1.display();
    }
}
