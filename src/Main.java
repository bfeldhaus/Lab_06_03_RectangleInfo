import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rHeight;
        double rLength = 0;
        double area;
        double perimeter;
        double diagonal;
        boolean trash;

        System.out.print("Enter length: ");
        if (input.hasNextDouble())
        {
            rLength = input.nextDouble();
        }
        else
        {
            trash = input.hasNextDouble();
            System.out.println("You must enter a valid integer!");
            System.out.println("Run the code again!");
            System.exit(0);
        }

        System.out.print("Enter height: ");
        if (input.hasNextDouble())
        {
            rHeight = input.nextDouble();
            area =  rLength * rHeight;
            perimeter = 2 * (rLength + rHeight);
            diagonal = Math.sqrt(rLength * rLength + rHeight * rHeight);
            System.out.printf("Area: %.2f\nPerimeter: %.2f\nDiagonal length: %.2f", area, perimeter, diagonal);
        }
        else
        {
            trash = input.hasNextDouble();
            System.out.println("You must enter a valid integer!");
            System.out.println("Run the code again!");
            System.exit(0);
        }

    }
}