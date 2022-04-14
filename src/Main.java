import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its next smaller number with the same digits");
        int enteredNumber=  scanner.nextInt();
        scanner.nextLine();

        NextSmall nextSmall = new NextSmall(enteredNumber);
        if (nextSmall.validEnteredNumber()&&nextSmall.getEnteredNumber()!=nextSmall.nextSmall()) {
            System.out.println(String.format("\"%d is the next smaller number after %d", nextSmall.nextSmall(),nextSmall.getEnteredNumber()));
    } else if (nextSmall.getEnteredNumber()==nextSmall.nextSmall()) {
            System.out.println(String.format("\"%d is the smallest number formed with the same digits", nextSmall.nextSmall()));
        } else {
            System.out.println("Please enter a valid number.");
            scanner.nextLine();

        }
}}

