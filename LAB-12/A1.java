import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A1 {
    public static void main(String[] args) {
        int char_count = 0;
        int word_count = 0;
        int line_count = 0;
        boolean inWord = false;

        try {
            FileInputStream file = new FileInputStream("A1.txt");
            int i;
            while ((i = file.read()) != -1) {
                char ch = (char) i;

                char_count++;
                if (ch == '\n') {
                    line_count++;
                }

                // Count words
                if (Character.isWhitespace(ch)) {
                    inWord = false;
                } else {
                    if (!inWord) {
                        word_count++;
                        inWord = true;
                    }
                }
            }

            file.close();

            if (char_count > 0 && (char_count == word_count || line_count == 0)) {
                line_count++;
            }

            System.out.println("Characters: " + char_count);
            System.out.println("Words: " + word_count);
            System.out.println("Lines: " + line_count);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
