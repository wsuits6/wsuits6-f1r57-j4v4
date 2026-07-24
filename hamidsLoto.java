import java.util.Random;
import java.util.Scanner;

public class loto {
    public static void main(String[] args) {

        // Creating a Scanner Object
        Scanner userNum = new Scanner(System.in);
        System.out.print("What is your Number? ");

        // Reading the user's number
        int number = userNum.nextInt();

        // Creating a Random Object
        Random genrand = new Random();
        int randNum = genrand.nextInt(1000000);

        // Checking if the user's number is the same as the random number
        if (number == randNum) {
            System.out.println("WINNER! Your winning number is " + number);
        } else {
            System.out.println("LOSER! Wrong number entered: " + number);
            System.out.println("The winning number was: " + randNum);
        }

       
    }
}