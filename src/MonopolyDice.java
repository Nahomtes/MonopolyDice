import javax.swing.*;
import java.util.Random;
public class MonopolyDice {
    public static void main(String[] args) {
        int countDoubleRolls = 0;
        boolean rollAgain = false;

        Random random = new Random();

        do{
            rollAgain = false;

            int diceValue1 = 1 + random.nextInt(6);
            int diceValue2 = 1 + random.nextInt(6);

            System.out.printf("User rolls %d & %d \n", diceValue1, diceValue2);

            if (diceValue1 == diceValue2) {
                System.out.println("DOUBLES!");
                countDoubleRolls++;

                if (countDoubleRolls == 3) {
                    System.out.println("go to JAIL");
                } else {
                    int addedDices = diceValue1 + diceValue2;
                    System.out.printf("Move %d Spaces and roll again getting...\n", addedDices);
                    rollAgain = true;
                }
            } else {
                System.out.println("Move %d Spaces and stop");
            }
        } while(rollAgain);

    }
}
