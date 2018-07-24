import java.util.Scanner;
public class MetricConversion
{
    public static void main(String[] args)
    {
        int num;
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = inputNum.nextInt();
        inchesToCm(num);
        gallonsToLiters(num);
    }
    public static void inchesToCm(int inches)
    {
        final double CM_TO_INCHES = 2.54;
        double cm;
        cm = inches * CM_TO_INCHES;
        System.out.println(inches + " inches is " + cm + " centimeters.");
    }
    public static void gallonsToLiters(int gallons)
    {
        final double LITERS = 3.7854;
        double liters;
        liters = gallons * LITERS;
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
