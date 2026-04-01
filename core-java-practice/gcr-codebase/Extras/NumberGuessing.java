package Extras;
import java.util.Scanner;
public class NumberGuessing {
    static int generateGuess(int low, int high) {
            return (low + high) / 2;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int low = 1, high = 100;
            String feedback;

            System.out.println("Think of a number between 1 and 100");

            while (true) {
                int guess = generateGuess(low, high);
                System.out.println("Computer guesses: " + guess);
                System.out.print("Enter feedback (low/high/correct): ");
                feedback = sc.next();

                if (feedback.equals("correct")) {
                    System.out.println("Computer guessed correctly!");
                    break;
                } else if (feedback.equals("low")) {
                    low = guess + 1;
                } else if (feedback.equals("high")) {
                    high = guess - 1;
                }
            }
        }
    }

