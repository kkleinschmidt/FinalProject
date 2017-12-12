package games;

import java.util.*;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    boolean gameType = true; // stand-in for game type input right now
    final Scanner input = new Scanner(System.in);

    // connect 4 variables
    int col = 0;
    int game = 0;

    // connect 4
    if (gameType) {

      // connect 4 game begins
      ConnectFour c = new ConnectFour();
      c.buildBoard();
      c.printBoard();

      while (game == 0) {
        int pn = c.getPlayerNumber();
        if (pn == 1) {
          System.out.println(
              "Player 1, add a piece to the board by typing in which number column you would like to add a piece.");
          col = input.nextInt();
          c.update(col);
          c.printBoard();
          c.updatePlayerNumber(pn);
        } else if (pn == 2) {
          System.out.println(
              "Player 2, add a piece to the board by typing in which number column you would like to add a piece.");
          col = input.nextInt();
          c.update(col);
          c.printBoard();
          c.updatePlayerNumber(pn);
        }
        game = c.checkWinner();
      }

      if (game == 1) {
        System.out.println("Player 1 wins!");
      } else if (game == 2) {
        System.out.println("Player 2 wins!");
      }

      // word scramble
    } else if (!gameType) {

      // word scramble game begins
      WordScramble w = new WordScramble();
    }
  }
}
