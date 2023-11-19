package LargestandSmallest;
import java.util.Scanner;
public class LargestandSmallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int number;
        int small = 0;
        int large = 0;

        System.out.print("Input a set of numbers. When finished, input -99 to display the largest and smallest numbers: ");
        number = input.nextInt();
        int n = input.nextInt();

        small = number;
        for (int i = 2; i < n; i++)
        {
            number = input.nextInt();
            if(number == -99)
            {
                break;
            }
            if (number > large)
            {
                large = number;
            }
            if (number < small)
            {
                small = number;
            }
        }
        System.out.println("The smallest number is: " + small);
        System.out.println("The largest number is: " + large);
    }

}