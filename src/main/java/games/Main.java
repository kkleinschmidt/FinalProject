package games;

import java.util.*;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    boolean gameType = true; // stand-in for input right now
    final Scanner input = new Scanner(System.in);
    int col = 0;
    int playerNumber = 0;

    // CALL INPUT

    // if(input == "no"){
    //   gameType = false;
    // } else if(input == "yes"){
    //   gameType = true;
    // } else{
    //   System.out.println("Please answer yes or no:");
    //   //CALL INPUT AGAIN
    // }

    if (gameType) {
      // connect 4 game begins
      ConnectFour c = new ConnectFour();
      c.buildBoard();
      c.printBoard();
      System.out.println(
          "Player 1, add a piece to the board by typing in which column you would like to add a piece.");
      playerNumber = 1;
      col = input.nextInt();
      c.update(col, playerNumber);
      c.printBoard();
    } else if (!gameType) {
      // word scramble game begins
      WordScramble w = new WordScramble();
    }
  }
}
