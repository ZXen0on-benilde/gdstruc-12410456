//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int numbers[] = { 60, 33, 12, 64, 17, 105, -53};

        System.out.println(linearSearch(numbers, 105));
    }

    public static int linearSearch(int[] input, int value)
    {
        for (int i = 0; i < input.length; i++)
        {
            if (input[i] == value)
            {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;

        while (start <= end)
        {
            int middle = (start + end) / 2;

            if (input[middle] == value)
            {
                return middle;
            } else if (value < input [middle])
            {
                end = middle - 1;
            } else if (value > input[middle])
            {
                start = middle + 1;
            }
        }

        return -1;
    }
}