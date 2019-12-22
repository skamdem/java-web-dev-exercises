package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Character;
import java.io.*;

public class CountingCharacters {
    static final String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    //NOTE : uncomment each method to execute the desired version of code
    public static void main(String[] args) throws Exception {

        //basicStudio();
        //bonusMission();
        superBonus();
    }

    /**count the number of times each character occurs
     *  in a string and then print the results*/
    public static void basicStudio() {
        HashMap<Character, Integer> result = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c != ' '){
                if (!result.containsKey(c)){
                    result.put(c,1);
                }else{
                    result.put(c,result.get(c)+1);
                }
            }
        }
        //print results
        printResults(result);
    }

    public static void bonusMission() {
        //1. Prompt the user to enter the string in the command line.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String :");
        String newStr = input.nextLine();
        HashMap<Character, Integer> bonusResult = new HashMap<>();
        char c;
        for (char c1 : newStr.toCharArray()) {
            //2. Make the character counts case-insensitive.
            c = Character.toLowerCase(c1);

            //3. Exclude non-alphabetic characters.
            if (c == ' '|| !Character.isAlphabetic(c)){
                continue;
            }
            if (!bonusResult.containsKey(c)){
                bonusResult.put(c,1);
            }else{
                bonusResult.put(c,bonusResult.get(c)+1);
            }
        }

        //print results
        printResults(bonusResult);
    }

    /**
     * Super Bonus: Read the string in from a file
    NOTE : Make sure you update the file path when running the code */
    public static void superBonus() throws Exception {
        String pathname ="C:\\Documents\\Skills update\\Launchcode\\java-practice\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\file.txt";
        File file = new File(pathname);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st, superBonusStr;
        superBonusStr = "";
        while ((st = br.readLine()) != null){
            superBonusStr = superBonusStr.concat("\n"+st);
        }
        //System.out.println(superBonusStr);

        HashMap<Character, Integer> superBonusResult = new HashMap<>();
        char c;
        for (char c1 : superBonusStr.toCharArray()) {
            //2. Make the character counts case-insensitive.
            c = Character.toLowerCase(c1);

            //3. Exclude non-alphabetic characters.
            if (c == ' '|| !Character.isAlphabetic(c)){
                continue;
            }
            if (!superBonusResult.containsKey(c)){
                superBonusResult.put(c,1);
            }else{
                superBonusResult.put(c,superBonusResult.get(c)+1);
            }
        }

        //print results
        printResults(superBonusResult);
    }

    public static void printResults(HashMap<Character, Integer> result) {
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
