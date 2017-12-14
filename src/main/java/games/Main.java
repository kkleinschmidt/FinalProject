package games;

import java.util.*;
import java.util.Scanner;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    int gameType;
    final Scanner input = new Scanner(System.in);
    int game = 0;

    System.out.println(
        "Type in 1 to play Connect 4.  Type in 2 to play Word Unscramble.  Type 0 to cancel.");
    gameType = input.nextInt();

    // connect 4 variables
    int col = 0;

    // word scramble variables
    String wordGuess;
    boolean gameOver = false;
    boolean correctWord = true;
    int turns = -1;

    // connect 4
    if (gameType == 1) {

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
    } else if (gameType == 2) {

      // word scramble game begins
      WordScramble w = new WordScramble();

      String scrambledWord = w.scrambleWord();
      System.out.println("This is your word: " + scrambledWord);

      while (game == 0) {
        wordGuess = input.nextLine();
        correctWord = w.checkGuess(wordGuess);
        if (correctWord) {
          System.out.println("You've guessed the correct word!");
          game = 1;
        } else if (!correctWord) {
          System.out.println("Type in your unscrambled guess: ");
        }
        turns++;
      }

      if (game == 1) {
        System.out.println("Congrats! You won WordScramble in " + turns + " turns!");
      }

      // quit game choosing
    } else if (gameType == 0) {
      System.exit(0);

      // invalid input
    } else {
      System.out.println("Invalid game type. Please type in either 1 or 2.");
      gameType = input.nextInt();
    }
  }
}
