package restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        HashMap<Integer, String> choice = new HashMap<Integer, String>();
        choice.put(1, "Add Menu");

        for (Map.Entry<Integer, String> eachChoice : choice.entrySet())
        {
            System.out.println(eachChoice.getKey()+". "+eachChoice.getValue());
        }
        System.out.println("Enter your Choice : ");
        Scanner input = new Scanner(System.in);
        Integer userChoice = input.nextInt();

        if (userChoice == 1)
        {
            System.out.println("Enter ");
        }
    }


}
