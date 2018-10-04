import java.util.Scanner;

public class GameTwo {
    public static void main(String[] args) {
        int lowerValue = 1;
        int higherValue = 100;
        int desiredNumber = (higherValue - lowerValue + 1)/2;

        System.out.println("Lets start Game 2! Make a number between 1 and 100, please.");
        System.out.println("You can help me with answer: l (less <), g (greater >), e (equal ==). ");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println(String.format("Desired number is: %d?", desiredNumber));

            String answer = scanner.nextLine().trim();

            if (answer.equals("e")) {
                break;
            }

            if (answer.equals("l")) {
                higherValue = desiredNumber;
                desiredNumber = higherValue - (higherValue - lowerValue + 1)/2;
            }
            else if (answer.equals("g")) {
                lowerValue = desiredNumber;
                desiredNumber = lowerValue + (higherValue - lowerValue + 1)/2;
            }
            else {
                System.out.println("Your answer should be one of: l | g | e");
            }

        }

        System.out.println(String.format("Desired number is %d! Game over :)", desiredNumber));
    }
}
