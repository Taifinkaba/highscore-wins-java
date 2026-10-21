package com.pluralsight;

import java.util.Scanner;

public class HighscoreWins {
    static void main() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Input Game Score (EX: Home:Visitor|21:9): ");
        String input = myScanner.nextLine().trim();

        // Home:Visitor|21:9 will be Home:Visitor and 21:9 for [0] and [1]
        String[] gameScore = input.split("\\|");

        // seperate home, visitor and scores through :
        String[] teams = gameScore[0].split(":"), scores = gameScore[1].split(":");

        // assign scores to numbers
        int homeScore = Integer.parseInt(scores[0].trim()), visitorScore = Integer.parseInt(scores[1].trim());




    }
}
