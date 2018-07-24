import java.util.Scanner;
public class PaintCalculator
{
    public static void main(String[] args)
    {
        int length;
        int width;
        int height;
        int price;

        Scanner inputLength = new Scanner(System.in);
        System.out.println("Enter the length of a rectangular room: ");
        length = inputLength.nextInt();
        Scanner inputWidth = new Scanner(System.in);
        System.out.println("Enter the width of a rectangular room: ");
        width = inputWidth.nextInt();
        Scanner inputHeight = new Scanner(System.in);
        System.out.println("Enter the height of a rectangular room: ");
        height = inputHeight.nextInt();

        price = computeCost(length, width, height);
        System.out.println("The cost to paint a " + length + "-by-" + width +
                "-foot room with " + height + "-foot ceilings is $" + price);
    }
    public static int computeCost(int length, int width, int height)
    {
        int wallArea;
        int gallons;
        int price;
        final int PRICE_PER_GALLON = 32;
        wallArea = (length + width) * height * 2;
        gallons = computeGallons(wallArea);
        System.out.println("The number of gallons: " + gallons);
        price = gallons * PRICE_PER_GALLON;
        return price;
    }
    public static int computeGallons(int wallArea)
    {
        final int WALL_SPACE_PER_GALLON = 350;
        int gallons;
        gallons = wallArea / WALL_SPACE_PER_GALLON;
        return gallons;
    }
}
