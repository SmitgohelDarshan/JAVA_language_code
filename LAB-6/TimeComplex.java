import java.util.Scanner;
import java.lang.Math;
class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void Addition(Time ob2) {
        this.second -= ob2.second;
        this.minute -= ob2.minute;
        this.hour -= ob2.hour;

        if (this.second <= 0) {
            this.minute --; 
            this.second += 60;
        }
        if (this.minute <= 0) {
            this.hour --;  
            this.minute += 60;
        }
    }

    public void sum(){

        System.out.println("hour=" + Math.abs(this.hour));
        System.out.println("minute=" + Math.abs(this.minute));
        System.out.println("second=" + Math.abs(this.second));
    }
}


public class TimeComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hour, Minute and Second for the first time:");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        System.out.println("Enter Hour, Minute and Second for the second time:");
        int hour1 = sc.nextInt();
        int minute1 = sc.nextInt();
        int second1 = sc.nextInt();

        Time ob1 = new Time(hour, minute, second);
        Time ob2 = new Time(hour1, minute1, second1);

        ob1.Addition(ob2);
        ob1.sum();
    }
}
