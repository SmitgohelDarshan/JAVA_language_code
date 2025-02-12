import java.util.Scanner;

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
        this.second += ob2.second;
        this.minute += ob2.minute;
        this.hour += ob2.hour;

        if (this.second >= 60) {
            this.minute += this.second / 60; 
            // this.second = this.second % 60;
            this.second -= 60;
        }
        if (this.minute >= 60) {
            this.hour += this.minute / 60;  
            // this.minute = this.minute % 60; 
            this.minute -= 60;
        }

        System.out.println("hour=" + this.hour);
        System.out.println("minute=" + this.minute);
        System.out.println("second=" + this.second);
    }
}

public class A2 {
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
    }
}
