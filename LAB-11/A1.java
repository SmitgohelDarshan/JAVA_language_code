class Mythread1 extends Thread{
    public void run(){
        try{
            
            System.out.println("Good Morning");
            for (int i = 0; i < 50; i++) {
                System.out.println("i"+i);
                sleep(1000);
            }
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Mythread2 implements Runnable{
    int n;
    Mythread2(int n){
        this.n = n;
    }
    public void run(){
        try{
        
            System.out.println("Good Afternoon");
            for (int i = 1; i < 11; i++) {
                Thread.sleep(3000);
                System.out.println(" "+n+" X "+i+": "+(5*i));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

public class A1 {
    public static void main(String[] args) {
        
        Mythread1 mt1 = new Mythread1();
        mt1.start();

        Mythread2 mt2 = new Mythread2(5);
        Thread t1 = new Thread(mt2);
        t1.start();

    }
}
