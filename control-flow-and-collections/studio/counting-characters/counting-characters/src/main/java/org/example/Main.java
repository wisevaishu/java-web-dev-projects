package org.example;

import java.util.*;
import java.util.ResourceBundle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static char[] StringToArray(String msg){
        return msg.toCharArray();
    }

    public static HashMap<Character, Integer> CountingCharacters (char[] msgToChars){
        HashMap<Character, Integer> finalResult = new HashMap<>();

        for (char c :  msgToChars){
            if(Character.isLetter(c))
            {
                char lowercaseChar = Character.toLowerCase(c);
                finalResult.put(lowercaseChar,
                        finalResult.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        return finalResult;
    }

    public static void main(String[] args) {

        String message = "If the product of two terms is zero then common sense says at least one of  +\n" +
                "the two terms has to be zero to start with. So if you move all the terms over +\n" +
                "to one side, you can put the quadratics into a form that can be factored  +\n" +
                "allowing that side of the equation to equal zero. Once you’ve done that,  +\n" +
                "it’s pretty straightforward from there.";
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a String  ");
//        String messageFromUser = input.nextLine();

        ResourceBundle bundle = ResourceBundle.getBundle("resources");
        String myString = bundle.getString("myString");

        char[] finalCharaterArray = StringToArray(myString);
        HashMap<Character, Integer> finalHash = CountingCharacters(finalCharaterArray);
        System.out.println(Arrays.toString(finalCharaterArray));
        System.out.println(finalHash);

//        char[] finalCharaterArray = StringToArray(messageFromUser);
//        HashMap<Character, Integer> finalHash = CountingCharacters(finalCharaterArray);
//        System.out.println(Arrays.toString(finalCharaterArray));
//        System.out.println(finalHash);
//
//        char[] finalCharaterArray = StringToArray(message);
//        HashMap<Character, Integer> finalHash = CountingCharacters(finalCharaterArray);
//        System.out.println(Arrays.toString(finalCharaterArray));
//        System.out.println(finalHash);

    }
}