import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String[] args)
    {
        String name;
        double gpa;
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = inputName.nextLine();
        Scanner inputGpa = new Scanner(System.in);
        System.out.println("Enter your grade point average: ");
        gpa = inputGpa.nextDouble();
        gpa_to_credits(name, gpa);
    }
    public static void gpa_to_credits(String name, double gpa)
    {
        final int TIMES = 10;
        double credits;
        credits = gpa * TIMES;
        System.out.println("Name: " + name +
                "\nGrade Point Average: " + gpa +
                "\nCredits: $" + credits);
    }
}
