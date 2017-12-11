package games;

import java.util.*;

public class ConnectFour {

  // important variables
  int round = 0;

  // column empty space counters
  int co1 = 6;
  int co2 = 6;
  int co3 = 6;
  int co4 = 6;
  int co5 = 6;
  int co6 = 6;
  int co7 = 6;

  // data structures
  HashMap<Integer, Stack<String>> board;
  Stack<String> column1 = new Stack<String>();
  Stack<String> column2 = new Stack<String>();
  Stack<String> column3 = new Stack<String>();
  Stack<String> column4 = new Stack<String>();
  Stack<String> column5 = new Stack<String>();
  Stack<String> column6 = new Stack<String>();
  Stack<String> column7 = new Stack<String>();

  // initialize
  public ConnectFour() {
    board = new HashMap<Integer, Stack<String>>();
    initColumn();
  }

  // fills the empty columns with blanks
  public void initColumn() {
    for (int i = 0; i < 6; i++) {
      column1.push(" ");
      column2.push(" ");
      column3.push(" ");
      column4.push(" ");
      column5.push(" ");
      column6.push(" ");
      column7.push(" ");
    }
  }

  // fills out the HashMap
  public HashMap<Integer, Stack<String>> buildBoard() {
    initColumn();
    board.put(1, column1);
    board.put(2, column2);
    board.put(3, column3);
    board.put(4, column4);
    board.put(5, column5);
    board.put(6, column6);
    board.put(7, column7);

    return board;
  }

  // prints the game board out
  public void printBoard() {
    System.out.println("---------------");
    System.out.println("|1|2|3|4|5|6|7|");
    System.out.println("---------------");
    Stack<String> x = new Stack<String>();
    for (int j = 0; j < 6; j++){
      for (int i = 1; i < 8; i++) {
        System.out.print("|" + board.get(i).pop());
      }
      System.out.print("|");
      System.out.println();
    }
    
    System.out.println("---------------");
  }

  public void update(int c, int p) {
    buildBoard();
    if (p == 0) {
      updateColumn(randomCol(), "o");
    } else if (p == 1) {
      updateColumn(c, "x");
    } else if (p == 2) {
      updateColumn(c, "o");
    }
  }

  // adds a piece to a column
  public void updateColumn(int col, String item) {
    Stack<String> temp = new Stack<String>();
    int placement = -1;

    if (col == 1) {
      placement = column1.search(item);

      if (placement == -1) {
        temp.push(item);
        for (int i = 0; i < 5; i++) {
          temp.push(" ");
        }
      } else {
        for (int i = placement; i < co1 + 1; i++) {
          temp.push(item);
        }
        for (int i = 0; i < placement; i++) {
          temp.push(" ");
        }
      }
      co1--;
      board.replace(1, temp);

    } else if (col == 2) {

      placement = column2.search(item);

      if (placement == -1) {
        temp.push(item);
        for (int i = 0; i < 5; i++) {
          temp.push(" ");
        }
      } else {
        for (int i = placement; i < co2 + 1; i++) {
          temp.push(item);
        }
        for (int i = 0; i < placement; i++) {
          temp.push(" ");
        }
      }
      co2--;
      board.replace(2, temp);

    } else if (col == 3) {

      placement = column3.search(item);

      if (placement == -1) {
        temp.push(item);
        for (int i = 0; i < 5; i++) {
          temp.push(" ");
        }
      } else {
        for (int i = placement; i < co3 + 1; i++) {
          temp.push(item);
        }
        for (int i = 0; i < placement; i++) {
          temp.push(" ");
        }
      }
      co3--;
      board.replace(3, temp);

    } else if (col == 4) {

      placement = column4.search(item);

      if (placement == -1) {
        temp.push(item);
        for (int i = 0; i < 5; i++) {
          temp.push(" ");
        }
      } else {
        for (int i = placement; i < co4 + 1; i++) {
          temp.push(item);
        }
        for (int i = 0; i < placement; i++) {
          temp.push(" ");
        }
      }
      co4--;
      board.replace(4, temp);

    } else if (col == 5) {

      placement = column5.search(item);

      if (placement == -1) {
        temp.push(item);
        for (int i = 0; i < 5; i++) {
          temp.push(" ");
        }
      } else {
        for (int i = placement; i < co5 + 1; i++) {
          temp.push(item);
        }
        for (int i = 0; i < placement; i++) {
          temp.push(" ");
        }
      }
      co5--;
      board.replace(5, temp);

    } else if (col == 6) {

      placement = column6.search(item);

      if (placement == -1) {
        temp.push(item);
        for (int i = 0; i < 5; i++) {
          temp.push(" ");
        }
      } else {
        for (int i = placement; i < co6 + 1; i++) {
          temp.push(item);
        }
        for (int i = 0; i < placement; i++) {
          temp.push(" ");
        }
      }
      co6--;
      board.replace(6, temp);

    } else if (col == 7) {

      placement = column7.search(item);

      if (placement == -1) {
        temp.push(item);
        for (int i = 0; i < 5; i++) {
          temp.push(" ");
        }
      } else {
        for (int i = placement; i < co7 + 1; i++) {
          temp.push(item);
        }
        for (int i = 0; i < placement; i++) {
          temp.push(" ");
        }
      }
      co7--;
      board.replace(7, temp);
    }
  }

  public Integer randomCol() {
    return 1; // temporary
  }
}
