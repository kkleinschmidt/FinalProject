package games;

import java.util.*;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    boolean gameType = true; // stand-in for input right now
    final Scanner input = new Scanner(System.in);
    int col = 0;
    int playerNumber = 1;
    int game = 0;

    // CALL INPUT

    // if(input == "no"){
    //   gameType = false;
    // } else if(input == "yes"){
    //   gameType = true;
    // } else{
    //   System.out.println("Please answer yes or no:");
    //   //CALL INPUT AGAIN
    // }
    // connect 4
    if (gameType) {

      // connect 4 game begins
      ConnectFour c = new ConnectFour();
      c.buildBoard();
      c.printBoard();

      while (game == 0) {
        if (playerNumber == 1) {
          System.out.println(
              "Player 1, add a piece to the board by typing in which column you would like to add a piece.");
          col = input.nextInt();
          c.update(col, playerNumber);
          c.printBoard();
          playerNumber = 2;
        } else if (playerNumber == 2) {
          System.out.println(
              "Player 2, add a piece to the board by typing in which column you would like to add a piece.");
          col = input.nextInt();
          c.update(col, playerNumber);
          c.printBoard();
          playerNumber = 1;
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
