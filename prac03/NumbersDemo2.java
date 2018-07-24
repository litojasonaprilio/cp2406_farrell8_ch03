import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the first number (integer):");
        num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second number (integer):");
        num2 = input2.nextInt();
        System.out.println("First number is " + num1 +
                "\nSecond number is " + num2 + ".");
        displayTwiceTheNumber(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num1);
        displayNumberPlusFive(num2);
        displayNumberSquared(num1);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int num)
    {
        int twiceNum;
        twiceNum = num * 2;
        System.out.println("Twice the number of " + num +
                " is " + twiceNum + ".");
    }
    public static void displayNumberPlusFive(int num)
    {
        int plusFive;
        plusFive = num + 5;
        System.out.println("Plus 5 the number of " + num +
                " is " + plusFive + ".");
    }
    public static void displayNumberSquared(int num)
    {
        int squareNumber;
        squareNumber = num*num;
        System.out.println("Square number of " + num +
                " is " + squareNumber + ".");
    }
}
