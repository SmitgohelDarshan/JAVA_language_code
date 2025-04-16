// Parent Interface
interface A {
    int a=7;
    void methodA();
}

interface A1 extends A {
    int a1 = 1;
    void methodA1();
}

interface A2 extends A {
    int a2 = 2;
    void methodA2();
}

// Multiple Inheritance Interface
interface A12 extends A1, A2 {
    int a12 = 3;
    void methodA12();
}

class B implements A12 {
    public void methodA() {
        System.out.println("Method from A");
    }
    public void methodA1() {
        System.out.println("Method from A1");
    }
    public void methodA2() {
        System.out.println("Method from A2");
    }
    public void methodA12() {
        System.out.println("Method from A12");
    }
}

public class A22 {
    public static void main(String[] args) {
        B obj = new B();
        obj.methodA();
        obj.methodA1();
        obj.methodA2();
        obj.methodA12();
    }
}
