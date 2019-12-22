package exercices;
import java.util.Arrays;

public class ArrayPractice {
    //3. For this exercise, use the string str
    static String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.;";


    public static void main(String[] args) {
        //1. Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] myArray = {1, 1, 2, 3, 5, 8};

        //2. Loop through the array and print out each value
        System.out.println("Printing everything");
        for (int i:myArray){
            System.out.println(i);
        }
        //modify the loop to only print the odd numbers.
        System.out.println("Printing odd numbers");
        for (int i:myArray){
            if (i%2==1) {
                System.out.println(i);
            }
        }

        //Use the split method to divide the string at each space and store the individual words in an array.
        String[] divideAtEachSpace = str.split("[ \\t\\n\\x0B\\f\\r]");

        //4. Print the array of words to verify that your code works. The syntax is:
        System.out.println(Arrays.toString(divideAtEachSpace));

        //Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
        String[] divideAtEachSentence = str.split("\\.");

        //4. Print the array of words to verify that your code works. The syntax is:
        System.out.println(Arrays.toString(divideAtEachSentence));
    }
}
