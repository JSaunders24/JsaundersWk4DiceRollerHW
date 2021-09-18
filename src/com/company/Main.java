package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Program Header
        // Saunders, John
        // CISP 401
        // 9/18/21
        // Dice Roller Homework

        // This assignment will have the user enter a number of dice, as well as
        // the number of sides on each dice.
        // This will show results in a while loop until the user decides to exit the program.

        Scanner input = new Scanner(System.in);
        int goChoice = 0;




        System.out.println("This is the main Program. \n");
        System.out.println("Press 1 to enter your dice information or 2 to exit the program \n");

        while (goChoice != 2) {

            System.out.println("Press 1 to continue or 2 to Exit \n");
            goChoice = input.nextInt();

            // This loop will check if the user's input is valid. Only 1 and 2 are valid inputs.
            while (goChoice != 1 && goChoice != 2) {
                System.out.println("Sorry, that input is not accepted. Please enter 1 to continue or 2 to exit \n");
                goChoice = input.nextInt();
            }
            // Dice Input
            if (goChoice == 1) {
                String diceData;

                System.out.println("Keep rolling those Dice! \n");

                System.out.println("This program uses XdY syntax. When inputting your answers, use XdY (i.e. 4d10 = Four 10-sided dice) \n");
                System.out.println("Enter the number of dice and number of sides \n");

                boolean synCheck = true;
                diceData = input.next();

                // checks for correct input
                if (diceData.contains("d")){
                    System.out.println("Looks good to me \n"); }
                else {
                    synCheck = false;
                }

                // This while loop will continue until user uses correct format of XdY
                while (!synCheck) {
                    System.out.println("This is not the correct syntax. Your input must include the lower case letter 'd' \n");
                    System.out.println("Enter a valid input \n");
                    diceData = input.next();

                    if (diceData.contains("d")) {
                        synCheck = true;
                    }


                }

                if (diceData.contains("d")) {
                    System.out.println("Looks good to me \n"); }

                System.out.println("You entered: " + diceData);

                // User input will now be split into 2 integers and assigned to new variables

                String str = diceData;
                String[] diceSort = str.split("d");
                int diceNum;
                int diceSide;

/*
                for (String newDice: str.split("d")){
                    System.out.println(newDice);
                }
*/

                for (int i = 0; i < diceSort.length; i++) {
                    System.out.println("Integer: " + i + " Value: " + diceSort[i]);
                }
                diceNum = Integer.parseInt(diceSort[0]);
                diceSide = Integer.parseInt(diceSort[1]);
                System.out.println(" \n");

                System.out.println("Number of Dice: " + diceNum);
                System.out.println("Number of sides on each dice: " + diceSide + " \n");

                int total = 0;

                int[] dice = new int[diceNum];

                for (int j = 0; j < diceNum; j++) {
                    Random rand = new Random();
                    dice[j] = rand.nextInt(diceSide) + 1;
                }

                String msg = "";
                for (int die: dice) {
                    msg += "You rolled a " + die + " on a " + diceSide + " sided dice \n";
                    System.out.println(msg);
                    total += die;
                }

                System.out.println("Your total is " + total);






            }


        }

        System.out.println("Have a nice Day! \n");






    }
}
