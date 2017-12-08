package src;

import java.util.*;

public class Main {

  public static void main(final String[] args) {

    boolean gameType = true;
    final Scanner input = new Scanner(System.in);

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
    }

    if (!gameType) {
      WordScramble w = new WordScramble();
    }
  }
}
