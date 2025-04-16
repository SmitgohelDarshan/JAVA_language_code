import java.util.Scanner;

class Member {
    String Name;
    int Age;
    long Phone_Number;
    String Address;
    double Salary;

    Member(String Name, int Age, long Phone_Number, String Address, double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.Phone_Number = Phone_Number;
        this.Address = Address;
        this.Salary = Salary;
    }

    public void printDetails() {
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.Age);
        System.out.println("Phone Number: " + this.Phone_Number);
        System.out.println("Address: " + this.Address);
        System.out.println("Salary: " + this.Salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String Name, int Age, long Phone_Number, String Address, double Salary, String specialization) {
        super(Name, Age, Phone_Number, Address, Salary);
        this.specialization = specialization;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + this.specialization);
    }
}

class Manager extends Member {
    String department;

    Manager(String Name, int Age, long Phone_Number, String Address, double Salary, String department) {
        super(Name, Age, Phone_Number, Address, Salary);
        this.department = department;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Department: " + this.department);
    }
}

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String Name = sc.nextLine();

        System.out.println("Enter Age: ");
        int Age = sc.nextInt();

        System.out.println("Enter Phone Number: ");
        long Phone_Number = sc.nextLong();
        sc.nextLine(); 

        System.out.println("Enter Address: ");
        String Address = sc.nextLine();

        System.out.println("Enter Salary: ");
        double Salary = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter 1 for Employee, 2 for Manager: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        Member m1; 

        if (choice == 1) {
            System.out.println("Enter Specialization: ");
            String specialization = sc.nextLine();
            m1 = new Employee(Name, Age, Phone_Number, Address, Salary, specialization);
        } else {
            System.out.println("Enter Department: ");
            String department = sc.nextLine();
            m1 = new Manager(Name, Age, Phone_Number, Address, Salary, department);
        }

        System.out.println("Details of the Member:");
        m1.printDetails();
    }
}
