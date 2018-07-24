import java.util.Scanner;
public class CraftPricing
{
    public static void main(String[] args)
    {
        String name;
        int materialCost;
        int workHours;
        int price;
        Scanner inputName = new Scanner(System.in);
        System.out.println("The name of a product: ");
        name = inputName.nextLine();
        Scanner inputMaterialCost = new Scanner(System.in);
        System.out.println("The cost of materials: ");
        materialCost = inputMaterialCost.nextInt();
        Scanner inputWorkHours = new Scanner(System.in);
        System.out.println("The number of hours of work required: ");
        workHours = inputWorkHours.nextInt();
        price = computeRetailPrice(materialCost, workHours);
        System.out.println("Product name: " + name +
                "\nPrice: $" + price);
    }

    public static int computeRetailPrice(int materialCost, int workHours)
    {
        int retailPrice;
        final int CONSTANT = 12;
        final int S_A_H = 7;
        retailPrice = materialCost + CONSTANT * workHours + S_A_H;
        return retailPrice;
    }
}
