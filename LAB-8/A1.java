abstract class Vegetable{
    String color = " ";
    // String name;
    public abstract String toString();
}

class Potato extends Vegetable{
    Potato(){
    super.color = "Yellow";
    }
    public String toString(){
        return super.color;
    }
}

class Brinjal extends Vegetable{
    Brinjal(){
    super.color = "Purple";
    }
    public String toString(){
        return super.color;
    }
}

class Tomato extends Vegetable{
    Tomato(){
        super.color = "Red";
    }
    public String toString(){
        return super.color;
    }
}
public class A1 {
    public static void main(String[] args) {
        Potato p = new Potato();
        System.out.println(p.toString());
        Brinjal b = new Brinjal();
        System.out.println(b.toString());
        Tomato t = new Tomato();
        System.out.println(t.toString());
    }
}
