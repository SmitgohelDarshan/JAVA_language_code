class Print extends Thread {
    int n;

    public void run() {
        try {
            while (true) {
                n = (int) (Math.random() * (100));
                sleep(1000);
                if (n % 2 == 0) {
                    Even even = new Even(n);
                    even.start();
                } else {
                    Odd odd = new Odd(n);
                    odd.start();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Even extends Thread {
    int even;

    Even(int even) {
        this.even = even;
    }

    public void run() {
        int result = (int) Math.pow(even, 2);
        System.out.println("Result1: "+result);
    }
}

class Odd extends Thread {
    int odd;

    Odd(int odd){
        this.odd = odd;
    }

    public void run(){
        int result = (int)Math.pow(odd, 3);
        System.out.println("Result2: "+result);

    }
}

public class B5 {
    public static void main(String[] args) {
        Print e = new Print();
        e.start();
    }
}
