import java.util.Scanner;

class Book{
    private String author_name;

    Book(String author_name){
        this.author_name = author_name;
    }

    public void display(){
        System.out.println("Author Name:"+author_name);
    }
}

class Book_publication extends Book{
    private String title;

    Book_publication(String title, String author_name){
        super(author_name);
        this.title = title;
    }

    public void display(){
        super.display();
        System.out.println("Book Publication:"+title);
    }
}


class Paper_publication extends Book{
    private String title;

    Paper_publication(String title, String author_name){
        super(author_name);
        this.title = title;
    }

    public void display(){
        super.display();
        System.out.println("Paper Publication:"+title);
    }

}
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = null;
        System.out.println("Enter Author Name:");
        String author_name = sc.nextLine();
        System.out.println("Choice:");
        System.out.println("Choice 1 for Book Publication\nChoice 2 for Paper Publication:");
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice == 1){
            System.out.println("Enter Book Title:");
            String title = sc.nextLine();
            b = new Book_publication(title, author_name);
        }
        else if (choice == 2) {
            System.out.println("Enter Paper Title:");
            String title = sc.nextLine();
            b = new Paper_publication(title, author_name);
        }
        else{
            System.out.println("Invalid Choice");
        }
        b.display();

    }
}
