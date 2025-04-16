class Check {
    int instanceVariable=35; 
    static int staticVariable = 45; 

    public Check(int instanceVariable) {
        this.instanceVariable = instanceVariable; 
    }

    public void print() {
        System.out.println("Instance Variable: " + this.instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void staticMethod() {
        System.out.println("Static Variable: " + staticVariable); 
    }
}

public class C7 {
    public static void main(String[] args) {
        Check obj = new Check(35);
        obj.print();
        Check.staticMethod();
    }
}