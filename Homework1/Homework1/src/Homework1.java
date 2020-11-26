import java.util.Scanner;

public class Homework1 {
    public static int emplid = 0;
    public static int quiz1 = 0;
    public static int quiz2 = 0;
    public static int age = 0;
    public static int currentTemp = 0;
    public static int finalGrade = (quiz1 + quiz2)/2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Student EMPLID (0-999999:)");
        emplid = scanner.nextInt();
        System.out.println("Enter your quiz1 percentage score (0.0-100.0):");
        quiz1 = scanner.nextInt();
        System.out.println("Enter your quiz2 percentage score (0.0-100.0):");
        quiz2 = scanner.nextInt();
        System.out.println("Enter your age:");
        age = scanner.nextInt();
        System.out.println("Enter the current Temperature in degrees Fahrenheit:");
        currentTemp = scanner.nextInt();
        System.out.println("******* Thank you for completing our survey ***********************");
        System.out.println("Your Student ID is: " + emplid);
        System.out.println("Your Quiz 1 Score is: " + quiz1);
        System.out.println("Your Quiz 2 Score is: " + quiz2);
        System.out.println("Your Average Quiz Score is: " + finalGrade);
        System.out.println("Your age is: " + age);
        System.out.println("The current temperature is: " + currentTemp + "degrees Fahrenheit");
    }
}
