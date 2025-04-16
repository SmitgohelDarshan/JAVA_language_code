 class Final{
    final int x = 10;
   final public void finalMethod(){
         int x = 11;
        System.out.println("value of x: "+x);
    }
}
   
class Constant extends Final{
    public void finalMethod(){
        x= 10;
        int y = 11;
        System.out.println("value of x: "+x);
        System.out.println("value of y: "+y);

    } 
}

public class A5 {
    public static void main(String[] args) {
        Final f1 = new Final();
        f1.finalMethod();

        Constant c1 = new Constant();
        c1.finalMethod();

    }
}
