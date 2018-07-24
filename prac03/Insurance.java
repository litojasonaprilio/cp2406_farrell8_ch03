import java.util.Scanner;
public class Insurance
{
    public static void main(String[] args) {
        int currentYear;
        int birthYear;
        int premiumAmount;
        Scanner inputCurrent = new Scanner(System.in);
        System.out.println("Enter the current year: ");
        currentYear = inputCurrent.nextInt();
        Scanner inputBirth = new Scanner(System.in);
        System.out.println("Enter the birth year: ");
        birthYear = inputBirth.nextInt();
        premiumAmount = computeAmount(currentYear, birthYear);
        System.out.println("Your premium amount: $" + premiumAmount);
    }

    public static int computeAmount(int currentYear, int birthYear)
    {
        final int DECADE = 10;
        int age;
        int decades;
        int premiumAmount;
        age = currentYear - birthYear;
        System.out.println(currentYear + " - " + birthYear + ": " + age);
        decades = age / DECADE;
        premiumAmount = (decades + 15) * 20;
        return premiumAmount;
    }
}
