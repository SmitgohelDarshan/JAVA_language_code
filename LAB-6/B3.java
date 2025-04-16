import java.util.Scanner;

class Vowel {
    String sentences;
    int A = 0, E = 0, I = 0, O = 0, U = 0;

    public void checkVowel(String sentence) {

        for (int j = 0; j < sentence.length(); j++) {
            char c = sentence.charAt(j);

            switch (c) {
                case 'A':
                case 'a':
                    A++;
                    break;

                case 'E':
                case 'e':
                    E++;
                    break;

                case 'I':
                case 'i':
                    I++;
                    break;

                case 'O':
                case 'o':
                    O++;
                    break;

                case 'U':
                case 'u':
                    U++;
                    break;
            }
        }
    }

    public void Display() {
        System.out.println("Total Vowels Count: ");
        System.out.println("A: " + A);
        System.out.println("E: " + E);
        System.out.println("I: " + I);
        System.out.println("O: " + O);
        System.out.println("U: " + U);
    }
}

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vowel vowelCount = new Vowel();  

        while (true) {
            System.out.println("Enter Sentences (if exit so type quit): ");
            String sentences = sc.nextLine();

            if (sentences.equalsIgnoreCase("quit")) {
                break;
            }

            vowelCount.checkVowel(sentences);
        }
        vowelCount.Display();
    }
}
