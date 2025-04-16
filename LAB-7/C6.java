import java.util.Scanner;

class MyPoint{
    double x, y;
   

    MyPoint(){
        x = 0;
        y = 0;
    }
    MyPoint(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public void getter() {
        System.out.println("x:- "+x);
        System.out.println("y:- "+y);
    }
    

    // public int getY() {
    //     return y;
    // }

    // public void setY(int y) {
    //     this.y = y;
    // }

   

    // MyPoint(int x, int y){
    //     this.x = x;
    //     this.y = y;
    // }

    public double distance(double x,double y){
        double ans;
        ans=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y, 2));
        return ans;
        // System.out.println("Distance from "+x+" to "+y+": "+ans);
    }
}

class ThreeDPoint extends MyPoint{
    double z;
    
   
    // public void setZ(double z) {
    //     this.z = z;
    // }
    ThreeDPoint()
    {
        super();
        this.z=0;
    }

    ThreeDPoint(double x,double y,double z){
        super(x,y);
        this.z = 0;
    }

    // ThreeDPoint(double z){
    //     super();
    //     this.z = z;
    // }

    public void getter() {
        System.out.println("x:- "+x);
        System.out.println("y:- "+y);
        System.out.println("z:- "+z);
    }

    public double distance(double x,double y,double z){
        double ans;
        ans=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y, 2)+Math.pow(this.z-z, 2));
        return ans;
        // System.out.println("Distance from "+x+" to "+y+": "+ans);
    }
}

public class C6 {
    public static void main(String[] args) {
        double x,y,z;
        Scanner sc=new Scanner(System.in);
        MyPoint p1; 
        System.out.println("Enter x:- ");
        x=sc.nextDouble();
        System.out.println("Enter y:- ");
        y=sc.nextDouble();
        
        System.out.println("1-2d and 2- 3d:- ");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter x1,y1:-");
            double x1=sc.nextDouble();
            double y1=sc.nextDouble();

            p1=new MyPoint(x,y);
            p1.distance(x1, y1);
        }
        else
        {
            System.out.println("Enter z for 3D:-");
            z=sc.nextInt();

            p1=new ThreeDPoint(x,y,z);

            System.out.println("Enter x1,y1,z1:-");
            double x1=sc.nextDouble();
            double y1=sc.nextDouble();
            double z1=sc.nextDouble();

            p1.distance(x1, y1,z1);

            

        }


        // ThreeDPoint p1=ThreeDPoint()
    }    
}
