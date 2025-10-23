import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A :");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side B :");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("\n "+c+" cm");

        scanner.close();
    }
}
