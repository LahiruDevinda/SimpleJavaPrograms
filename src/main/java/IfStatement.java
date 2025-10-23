import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name :");
        name = scanner.nextLine();

        System.out.print("Enter your age :");
        age = scanner.nextInt();

        System.out.print("Are you a student ? (true / false) :");
        isStudent = scanner.nextBoolean();

        System.out.print("\nHello Mr."+name+"\n");

        if(age <= 0){
            System.out.print("Invalid age");
        }else if (age < 18){
            System.out.print("You are a child");
        }else if (age >=65 ){
            System.out.print("You are senior");
        }else {
            System.out.print("You are an adult");
        }

        if (isStudent){
            System.out.print(" and you are a student.");
        }else {
            System.out.print(" and you are not a student.");
        }

        scanner.close();

    }
}
