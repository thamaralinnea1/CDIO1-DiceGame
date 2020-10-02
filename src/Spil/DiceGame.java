package Spil;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        //opretter 4 terninger så spillerne får to terninger hver

        Dice Dice1 = new Dice(1);
        Dice Dice2 = new Dice(1);
        Dice Dice3 = new Dice(1);
        Dice Dice4 = new Dice(1);

        //summen af terningerne der bliver slået
        int sum1;
        int sum2;

        //holder styr på spiller 1 og spiller 2's sum i løbet af spillet

        int p1sum = 0;
        int p2sum = 0;

        //While loop der kører indtil spiller 1 ellers 2's sum er større eller lig med 40

        System.out.println("Welcome player 1 and player 2");
        System.out.println("Each player gets two dice and the first player to get a total of 40 points or more wins the game");
        System.out.println(" Good luck :) ");

        while (p1sum <= 40 && p2sum <=40) {
            Scanner input = new Scanner(System.in);
            System.out.println("press r and enter to roll dice");
            String roll = input.nextLine();
            if (roll.equals("r")) {
                Dice1.roll();
                Dice2.roll();
                Dice3.roll();
                Dice4.roll();

                //når en spiller slår med to terninger skal facevalue af terningerne slåes sammen

                sum1 = Dice1.getFacevalue() + Dice2.getFacevalue();
                sum2 = Dice3.getFacevalue() + Dice4.getFacevalue();

                int dienr1 = Dice1.getFacevalue();
                int dienr2 = Dice2.getFacevalue();
                int dienr3 = Dice3.getFacevalue();
                int dienr4 = Dice4.getFacevalue();
                p1sum = p1sum + sum1;
                p2sum = p2sum + sum2;
            }

            System.out.println("Player 1: " + "Dice one: " + Dice1 + "  Dice two:  " + Dice2);
            System.out.println("player 1 total = " + p1sum);
            System.out.println("Player 2: " + "Dice one:" + Dice3 + " Dice two: "  + Dice4);
            System.out.println("player 2 total=  " + p2sum);


            if (p1sum >= 40)
                System.out.println("Player 1  is the winner  with " + p1sum + " point");

            if (p2sum >=40)
                System.out.println("Player 2 is the winner with " + p2sum + " point" );

            if (p1sum >= 40 && p2sum >= 40)
                System.out.println("Both Players have won the game ");

        }

    }
}
