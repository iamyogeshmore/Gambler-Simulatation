package org.bridgelabz;

import java.util.Random;

/*Create a program to simulate a gambling game where the player starts with 100 units of currency
and aims to reach 200 units. The player makes bets with a 50% chance of winning or losing.
The program should track the number of wins and losses and display the final outcome (win or loss) for the player.*/
public class GamblerSimulatation {
    public static void main(String[] args) {
        int stake = 100;
        int win = 0;
        int loss = 0;
        final int goal = 200;
        System.out.println("Let's Gamble");
        {
            while (stake >= 1) {
                Random random = new Random();
                int int_random = random.nextInt(2);
                if (int_random < 1) { //Win = 0
                    stake++;
                    win++;
                } //win
                else { //Loss=1
                    stake--;
                    loss++;
                } //loss
                if (stake == goal) {
                    break;
                }
            }
        }
        System.out.println("Total Wins = " + win);
        System.out.println("Total Losses = " + loss);
        if (stake < 1) {
            System.out.println("You Loss...!!!");
        } else {
            System.out.println("you Won...!!!");
        }
    }
}