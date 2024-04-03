import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountingWordsInString {

    public static ArrayList<String> ConvertStringToArray (String str)
    {
        return new ArrayList<String>(Arrays.asList(str.split(" ")));
    }

    public static ArrayList<String> CountWords (ArrayList<String> arr, int wordlen)
    {
        ArrayList<String> finalArray = new ArrayList<>();
        int wordlencal = 0;
        String eachWord = "";

        for (String word : arr) {

            char lastLetter = word.charAt(word.length() - 1);

            if (lastLetter == '.' || lastLetter == ',') {
                wordlencal = word.length() - 1;
                eachWord = word.substring(0, word.lastIndexOf((lastLetter)));
            } else {
                wordlencal = word.length();
                eachWord = word;
            }

            if (eachWord.length() == wordlen) {
                finalArray.add(eachWord);
            }
        }
        return finalArray;
    }

    public static void main (String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        Scanner input = new Scanner(System.in);
        int wordlen;
        //System.out.println(ConvertStringToArray(phrase));
        list=ConvertStringToArray(phrase);
        System.out.println(phrase);
        System.out.println("Enter Word Length : ");
        wordlen = input.nextInt();
        System.out.println(CountWords(list, wordlen));
        input.close();
    }
}
