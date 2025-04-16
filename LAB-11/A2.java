class Mythread1 implements Runnable{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Good Morning");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

class Mythread2 implements Runnable{
    public void run(){
        try{
            Thread.sleep(3000);
            System.out.println("Good Afternoon");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

public class A2 {
    public static void main(String[] args) {
        Mythread1 mt1 = new Mythread1();
        Thread t1 = new Thread(mt1);
        t1.start();
        
        Mythread2 mt2 = new Mythread2();
        Thread t2 = new Thread(mt2);
        t2.start();
    }
    
}