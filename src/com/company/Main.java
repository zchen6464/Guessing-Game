package com.company;

import java.lang.Math;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
	System.out.println("Please Choose either user guessing game or computer guessing game."); //Greeting
	System.out.println("Enter 'User' for user guessing game, 'Computer' for computer guessing game");  //Greeting
	Scanner choice = new Scanner(System.in); //input
	String game = choice.nextLine().toLowerCase();
	System.out.println("Please Enter the lower number");  //setting
	int lower = choice.nextInt();
	System.out.println("Please Enter the higher number");  //setting
	int higher = choice.nextInt();
	if(game.equals("computer"))
        {
            guessAI(lower, higher);
        }
        else if(game.equals("user"))
        {
            randomNumGen(lower, higher);
        }
    }

    public static void randomNumGen(int lower, int higher) {
        System.out.println("Game Begin");
        int rand = (int) (Math.random() * higher) + lower;
        System.out.println("Guess a number from " + lower + " - " + higher);
        Scanner guess = new Scanner(System.in);
        while ((guess.nextInt() != rand)) {
            System.out.println("Wrong number, try again.");
        }
        System.out.println("Congrats, that's the number!");
    }

    public static void guessAI(int lower, int higher) {
        System.out.println("Game Begin");
        int x = lower;
        int z = higher;
        int y = (x + z) / 2;
        System.out.println(y);
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while(condition)
        {
            String test = input.nextLine().toLowerCase();
	        if(test.equals("lower"))
            {
                int temp = y;
                if(temp == x-1)
                {
                    System.out.println("Input incorrect,try again");
                }
                else
                {
                    z = y;
                }
            }
            else if(test.equals("higher"))
                {
                int temp = y;
                if(temp == z-1)
                {
                    System.out.println("Input incorrect,try again");
                }
                else
                {
                    x = y;
                }
                }
                else if(test.equals("correct"))
                    {
                        System.out.println("You Win!");
                        return;
                    }
                    else
                    {
                        System.out.println("Please enter a valid input");
                    }
            y = (x + z) / 2;
            System.out.println(y);
        }
    }
}
