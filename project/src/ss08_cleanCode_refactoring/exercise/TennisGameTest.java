package ss08_cleanCode_refactoring.exercise;

import java.util.Scanner;

public class TennisGameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of player 1:");
        String player1 = scanner.nextLine();
        System.out.println("Input name of player 2: ");
        String player2 = scanner.next();
        System.out.println("Input player 1 score: ");
        int player1Score = scanner.nextInt();
        System.out.println("Input player 2 score: ");
        int player2Score = scanner.nextInt();
        TennisGame tennisGame = new TennisGame();
        System.out.println(tennisGame.displayScore(player1, player2, player1Score, player2Score));
    }

}
