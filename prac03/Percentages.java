public class Percentages
{
    public static void main(String[] args)
    {
        double num1 = 2.0;
        double num2 = 5.0;
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
