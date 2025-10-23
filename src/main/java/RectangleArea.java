import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Height :");
        double height = scanner.nextDouble();

        System.out.print("Enter the Length :");
        double length = scanner.nextDouble();

        double area = height * length;

        System.out.println("The area for your inputs :"+area);


        scanner.close();
    }
}
