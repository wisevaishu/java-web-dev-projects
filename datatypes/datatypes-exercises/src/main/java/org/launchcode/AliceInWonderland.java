package org.launchcode;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, ‘and what is " +
                "the use of a book,’ thought Alice ‘without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println(sentence);
        System.out.println("Enter a String to search for in this sentence: ");


        String searchString = input.nextLine();


        if (sentence.contains(searchString))
        {
            System.out.println("Yes, the word '" + searchString + "' is present in the sentence.");


            int index = sentence.indexOf(searchString);
            System.out.println("Index of the word: " + index);


            int length = searchString.length();
            System.out.println("Length of the word: " + length);


            sentence = sentence.replace(searchString, "");


            System.out.println("Updated sentence after removing the word:");
            System.out.println(sentence);
        }
        else
        {
            System.out.println("No, the word '" + searchString + "' is not present in the sentence.");
        }

    }
}
