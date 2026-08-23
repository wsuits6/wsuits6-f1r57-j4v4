import java.util.Scanner;   //importing the scanner library


/**
 * CYBER SEC JAVA CODE
 * ====================
 * 
 *Curly  brackets contain the instructions for the loop
 * run for  i is valued  at if i is less than  1 increase the  value through incrementaiton
 */
// public class

public class decisionMaking {
    public static void main(String[] args) {

        int score = 1000000;

        if (score < 50) {
            System.out.println("F");
        }
        else if (score <= 60) {
            System.out.println("Pass");
        }
        else if (score <= 65) {
            System.out.println("D");
        }
        else if (score < 70) {
            System.out.println("D+");
        }
        else if (score < 75) {
            System.out.println("C");
        }
        else if (score < 80) {
            System.out.println("C+");
        }
        else if (score < 85) {
            System.out.println("B+");
        }
        else if (score > 90) {
            System.out.println("A");
        }
        else {
            System.out.println("A+");
        }

    }
}


// Looping  class
public class looping {

    //Application entry point
    public static void main(String[] args) {

        //creating for loop
        for (int i = 1; i <= 12; i++) {
            System.out.println("10 x " + i + " = " + i * 10);
        }

    }
}


public class receieve {

    public static void main(String[] args) {

        int age;
        String name;

        Scanner iodevice = new Scanner(System.in);

        System.out.println("What is your age");
        age = iodevice.nextInt();

        System.out.println("Your Age is " + age);

        iodevice.nextLine(); // Clears the leftover newline

        System.out.println("What is your name: ");
        name = iodevice.next();

        System.out.println("Your Name is: " + name);

        iodevice.close();
    }
}