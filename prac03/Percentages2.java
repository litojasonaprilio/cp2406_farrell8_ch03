import java.util.Scanner;
public class Percentages2
{
    public static void main(String[] args)
    {
        double num1;
        double num2;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        num2 = input2.nextInt();
        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    public static void computePercent(double num1, double num2)
    {
        final int PERCENTAGE = 100;
        double percentage;
        percentage = (num1 / num2) * PERCENTAGE;
        System.out.println(num1 + " is " + percentage + " percent of " + num2);
    }
}
