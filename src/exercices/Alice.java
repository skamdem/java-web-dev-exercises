package exercices;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("What is your name? : ");
        String name = input.nextLine();
        System.out.println("Hello " + name);*/
        searchString();
    }

    public static void searchString(){
        final String sourceString = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in " +
                "it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search : ");
        String term = input.nextLine();
        boolean found = sourceString.toLowerCase().contains(term.toLowerCase());
        System.out.println("\""+term + "\" was "+ (found?"":"NOT ") + "found in the original string");
        if (found){
            System.out.println("its length is " + term.length() + ". Its index within" +
                    " the original string is " + sourceString.toLowerCase().indexOf(term.toLowerCase()));
            System.out.println("Below is the original string with \"" + term + "\" removed:\n" +
                    sourceString.toLowerCase().replace(term.toLowerCase(), ""));

        }
    }
}
