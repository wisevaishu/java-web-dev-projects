import java.lang.String;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int j : integerArray)
        {
            //System.out.println(j);
            if(j%2==1)
            {
                System.out.println(j);
                continue;
            }
        }
        String message = "I would not, could not, in a box. I would not, could not with a fox. " +
                          "I will not eat them in a house. I will not eat them with a mouse.";
        String[] messageArray = message.split(" ");
        for (String singleWord : messageArray)
        {
            System.out.println(singleWord);
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
