import java.util.ArrayList;
import java.util.Scanner;

public class CountingLettersInWord {

    public static ArrayList<String> CountWords (ArrayList<String> arr, int wordlen)
    {
        ArrayList<String> finalArray = new ArrayList<>();
        for (String word : arr)
        {
            if (word.length() == wordlen)
            {
                finalArray.add(word);
            }
        }
        return finalArray;
    }

    public static void main (String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int wordlen;
        list.add("vaish");
        list.add("mohnish");
        list.add("prabhu");
        list.add("apple");
        list.add("orange");
        System.out.println("Enter Word Length : ");
        wordlen = input.nextInt();
        System.out.println(CountWords(list, wordlen));
        input.close();
    }
}
