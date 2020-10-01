package Test;

import Spil.Dice;

public class Test {

    public static void main(String[] args) {


        int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0;
        for (int i = 0; i < 1000; i++) {
            Dice d = new Dice();
            d.roll();
            int val = d.getFacevalue();
            switch (val) {
                case 1:
                    face1++
                    ;
                    break;
                case 2:
                    face2++
                    ;
                    break;
                case 3:
                    face3++
                    ;
                    break;
                case 4:
                    face4++
                    ;
                    break;
                case 5:
                    face5++
                    ;
                    break;
                case 6:
                    face6++
                    ;
                    break;
            }
        }
        System.out.println("Test result:");
        System.out.println("Roll 1 " + face1 + " times");
        System.out.println("Roll 2 " + face2 + " times");
        System.out.println("Roll 3 " + face3 + " times");
        System.out.println("Roll 4 " + face4 + " times");
        System.out.println("Roll 5 " + face5 + " times");
        System.out.println("Roll 6 " + face6 + " times");
    }
}

