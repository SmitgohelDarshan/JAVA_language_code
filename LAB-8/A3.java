interface Transport {
   public void deliver();
}
abstract class Animal { }

class Tiger extends Animal { }

class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("Camel is used for transport.");
    }
}

class Deer extends Animal { }

class Donkey extends Animal implements Transport {
    public void deliver() {
        System.out.println("Donkey is used for transport.");
    }
}

public class A3 {
    public static void main(String[] args) {
        Animal[] animals = { new Tiger(), new Camel(), new Deer(), new Donkey() };

        ((Transport)animals[1]).deliver();///only implements interface valid.
        

    }
}
