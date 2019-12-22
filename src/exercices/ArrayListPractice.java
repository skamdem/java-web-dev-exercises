package exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> someArray = new ArrayList<>();
        for (int i = 0; i < 15; i++){
            someArray.add(i);
        }
        //1. Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.
        System.out.println(sumOfAllEvenNumbers(someArray));

        List<String> someListOfWords = new ArrayList<String>();
        someListOfWords = Arrays.asList(ArrayPractice.str.split("[ \\t\\n\\x0B\\f\\r]"));

        Scanner sc = new Scanner(System.in);

        //2. Write a static method to print out each word in a list that has exactly 5 letters.
        //3. Modify your code to prompt the user to enter the word length for the search.
        //4. BONUS: Use the string from the Array Practice section
        System.out.println("Enter the number of letters searched words should have: ");
        int input = sc.nextInt();
        printEachWordWithXLetters(someListOfWords, input);

    }

    //1. static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.
    public static int sumOfAllEvenNumbers(ArrayList<Integer> myArray){
        int sum = 0;
        for (int i:myArray){
            if (i%2==0){
                sum +=i;
            }
        }
        return sum;
    }

    //2. static method to print out each word in a list that has exactly 5 letters.
    public static void printEachWordWithXLetters(List<String> myArray, int x){
        for(String str : myArray){
            if (str.length()==x) {
                System.out.println(str);
            }
        }
    }

}


