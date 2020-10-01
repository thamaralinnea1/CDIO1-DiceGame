package Spil;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        //opretter 4 terninger så spillerne får to terninger hver

        Dice Dice1 = new Dice();
        Dice Dice2 = new Dice();
        Dice Dice3 = new Dice();
        Dice Dice4 = new Dice();

        //summen af terningerne der bliver slået
        int sum1;
        int sum2;

        //holder styr på spiller 1 og spiller 2's sum i løbet af spillet

        int p1sum = 0;
        int p2sum = 0;

        //While loop der kører indtil spiller 1 ellers 2's sum er større eller lig med 40

        while (p1sum <= 40 || p2sum <=40) {
            Scanner input = new Scanner(System.in);
            System.out.println("press r and enter to roll dice");
            String roll = input.nextLine();
            if (roll.equals("r")) {
                Dice1.roll();

            }

        }
    }
}
