package labexer1b;

import java.util.Scanner;

public class LabExer1B 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter an iteger: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
    
        showNumberPlus10(number);
        showNumberPlus100(number);
        showNumberPlus1000(number);

        s.close();
    }

    private static void showNumberPlus10(int number)
    {
        int added = number + 10;
        System.out.println(number + " plus 10 is " + added + ".");
    }

    private static void showNumberPlus100(int number)
    {
        int added = number + 100;
        System.out.println(number + " plus 100 is " + added + ".");
    }

    private static void showNumberPlus1000(int number)
    {
        int added = number + 1000;
        System.out.println(number + " plus 100 is " + added + ".");
    }
}
