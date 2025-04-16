class ObjectCounter {
    static int count = 0; 

    public ObjectCounter() {
        count++; 
    }

    public static void display() {
        System.out.println("Number of objects created: " + count);
    }
}

public class B6 {
    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter(); 
        ObjectCounter obj2 = new ObjectCounter(); 
        ObjectCounter obj3 = new ObjectCounter(); 
        ObjectCounter obj4 = new ObjectCounter(); 
        ObjectCounter obj5 = new ObjectCounter(); 


        ObjectCounter.display();
    }
}
