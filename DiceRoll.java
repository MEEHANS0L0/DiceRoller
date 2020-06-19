import java.util.*;

public class DiceRoll {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DnD Dice Roller APP 1.0 by Josh and Ryan\n");

        int menuChoice = 0;

        // creating a program loop to let us roll as many dice as we want
        do {
            //number of dice
            System.out.println("How many faces do you want the dice to have?\n");
            Dice dice = new Dice(input.nextInt());

            // How many times are we rolling?
            System.out.println("How many dice do you want to have?");
            int numDice = input.nextInt();

            int total = 0;
            // loop and roll.

            for (int i = 0; i < numDice; i++){
                int result = dice.roll();
                System.out.println("You rolled: " + result);
                total += result;
            }

            System.out.println("The total for that was: " + total);

            String menuString = "1 - Roll a new dice type and number\n" +
                    "2 - Exit the program\n";

            System.out.println(menuString);

            menuChoice = input.nextInt();
        } while (menuChoice != 2);

    }
}
