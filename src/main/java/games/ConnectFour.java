package games;

import java.util.*;

public class ConnectFour {

  // important variables
  int round = 0;

  // column item counters
  int co1 = 0;
  int co2 = 0;
  int co3 = 0;
  int co4 = 0;
  int co5 = 0;
  int co6 = 0;
  int co7 = 0;

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
    for (int i = 0; i < 7; i++) {
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
    board.put(1, column1);
    board.put(2, column2);
    board.put(3, column3);
    board.put(4, column4);
    board.put(5, column5);
    board.put(6, column6);
    board.put(7, column7);

    return board;
  }

  // adds a piece to a column
  public void updateColumn(int col, String item) {
    Stack<String> temp = new Stack<String>();

    temp.push("item");
  }

  // prints the game board out
  public void printBoard() {
    System.out.println("---------------");
    for (int i = 0; i < 7; i++) {
      Stack<String> x = new Stack<String>();
      for (int j = 1; j < 8; j++) {
        x.push(board.get(j).pop());
      }
      System.out.println(
          "|" + x.pop() + "|" + x.pop() + "|" + x.pop() + "|" + x.pop() + "|" + x.pop() + "|"
              + x.pop() + "|" + x.pop() + "|");
    }
    System.out.println("---------------");
  }

  public void update(int c, int p) {
    if (p == 0) {
      updateColumn(randomCol(), "o");
    } else if (p == 1) {
      updateColumn(c, "x");
    } else if (p == 2) {
      updateColumn(c, "o");
    }
  }

  public Integer randomCol() {
    return 1; // temporary
  }
}
