import java.util.ArrayList;

public class ArrayListPractice {

    public static int sumEven (ArrayList<Integer> arr)
    {
        int total = 0;
        for (int i : arr)
        {
            if (i%2==0)
            {
                total += i;
            }
        }
        return total;
    }

    public static void main (String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(sumEven(list));
    }
}
