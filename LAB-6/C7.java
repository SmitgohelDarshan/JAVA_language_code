class Check {
    int instanceVar; 
    static int staticVar = 10; 


    public Check(int instanceVar) {
        this.instanceVar = instanceVar; 
    }

    public void show() {
        System.out.println("Instance Variable: " + this.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void staticMethod() {
        System.out.println("Static Variable: " + staticVar); 
    }
}

public class C7 {
    public static void main(String[] args) {
        Check obj = new Check(50);
        obj.show();

        Check.staticMethod();
    }
}