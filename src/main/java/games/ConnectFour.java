package games;

import java.util.*;

public class ConnectFour {

  // important variables
  int playerNumber = 1;

  // column empty space index counters
  int co1 = 5;
  int co2 = 5;
  int co3 = 5;
  int co4 = 5;
  int co5 = 5;
  int co6 = 5;
  int co7 = 5;

  // data structures
  HashMap<Integer, List<String>> board;

  List<String> column1 = new ArrayList<String>();
  List<String> column2 = new ArrayList<String>();
  List<String> column3 = new ArrayList<String>();
  List<String> column4 = new ArrayList<String>();
  List<String> column5 = new ArrayList<String>();
  List<String> column6 = new ArrayList<String>();
  List<String> column7 = new ArrayList<String>();

  List<String> row1 = new ArrayList<String>();
  List<String> row2 = new ArrayList<String>();
  List<String> row3 = new ArrayList<String>();
  List<String> row4 = new ArrayList<String>();
  List<String> row5 = new ArrayList<String>();
  List<String> row6 = new ArrayList<String>();

  // initialize
  public ConnectFour() {
    board = new HashMap<Integer, List<String>>();
    initColumn();
  }

  // fills the empty columns with blanks
  public void initColumn() {
    for (int i = 0; i < 6; i++) {
      column1.add(" ");
      column2.add(" ");
      column3.add(" ");
      column4.add(" ");
      column5.add(" ");
      column6.add(" ");
      column7.add(" ");
    }
  }

  // fills out the HashMap
  public void buildBoard() {
    board.put(1, column1);
    board.put(2, column2);
    board.put(3, column3);
    board.put(4, column4);
    board.put(5, column5);
    board.put(6, column6);
    board.put(7, column7);
  }

  // prints the game board out
  public void printBoard() {
    System.out.println("---------------");
    System.out.println("|1|2|3|4|5|6|7|");
    System.out.println("---------------");
    List<String> x = new ArrayList<String>();
    for (int i = 0; i < 6; i++) {
      for (int j = 1; j < 8; j++) {
        System.out.print("|" + board.get(j).get(i));
      }
      System.out.print("|");
      System.out.println();
    }

    System.out.println("---------------");
  }

  // updates the board depending on the player
  public void update(int c) {
    if (playerNumber == 1) {
      updateColumn(c, "x");
    } else if (playerNumber == 2) {
      updateColumn(c, "o");
    }
  }

  // checks to see if there is a row or column of 4
  public int checkWinner() {
    boolean xh = checkXHorizontal();
    boolean xv = checkXVertical();

    boolean oh = checkOHorizontal();
    boolean ov = checkOVertical();

    if (xh == true || xv == true) {
      return 1;
    } else if (oh == true || ov == true) {
      return 2;
    } else {
      return 0;
    }
  }

  // checks xs horizontally
  public boolean checkXHorizontal() {
    boolean flag = true;

    int counter = 0;
    while (flag) {

      for (int w = 1; w < 8; w++) {
        for (int h = 0; h < 6; h++) {
          if (board.get(w).get(h) == "x") {
            counter++;
          } else {
            counter = 0;
          }
          if (counter >= 4 || counter <= 4) {
            flag = false;
          }
        }
      }
      break;
    }
    return flag;
  }

  // checks xs vertically
  public boolean checkXVertical() {
    boolean flag = true;

    int counter = 0;
    while (flag) {

      for (int h = 0; h < 6; h++) {
        for (int w = 1; w < 8; w++) {
          if (board.get(w).get(h) == "x") {
            counter++;
          } else {
            counter = 0;
          }
          if (counter >= 4 || counter <= 4) {
            flag = false;
          }
        }
      }
      break;
    }
    return flag;
  }

  // checks os horizontally
  public boolean checkOHorizontal() {
    boolean flag = true;

    int counter = 0;
    while (flag) {

      for (int w = 1; w < 8; w++) {
        for (int h = 0; h < 6; h++) {
          if (board.get(w).get(h) == "o") {
            counter++;
          } else {
            counter = 0;
          }
          if (counter >= 4 || counter <= 4) {
            flag = false;
          }
        }
      }
      break;
    }
    return flag;
  }

  // checks os vertically
  public boolean checkOVertical() {
    boolean flag = true;

    int counter = 0;
    while (flag) {

      for (int h = 0; h < 6; h++) {
        for (int w = 1; w < 8; w++) {
          if (board.get(w).get(h) == "o") {
            counter++;
          } else {
            counter = 0;
          }
          if (counter >= 4 || counter <= 4) {
            flag = false;
          }
        }
      }
      break;
    }
    return flag;
  }

  public int getPlayerNumber() {
    return playerNumber;
  }

  // changes player number
  public void updatePlayerNumber(int pn) {
    if (pn == 1) {
      playerNumber = 2;
    } else if (pn == 2) {
      playerNumber = 1;
    }
  }

  // adds a piece to a column
  public void updateColumn(int col, String item) {

    int placement1 = -1;
    int placement2 = -1;
    int pn = getPlayerNumber();

    if (co1 == 0 && co2 == 0 && co3 == 0 && co4 == 0 && co5 == 0 && co6 == 0 && co7 == 0) {
      System.out.println("It's a draw!");
      System.exit(0);
    }

    if (col == 1) {
      placement1 = column1.indexOf("x");
      placement2 = column1.indexOf("o");

      if (co1 < 0) {
        System.out.println("There are no spaces left.  Lose a turn!");
        updatePlayerNumber(pn);
      } else {
        column1.set(co1, item);
      }

      co1--;
      buildBoard();

    } else if (col == 2) {
      placement1 = column2.indexOf("x");
      placement2 = column2.indexOf("o");

      if (co2 < 0) {
        System.out.println("There are no spaces left.  Lose a turn!");
        updatePlayerNumber(pn);
      } else {
        column2.set(co2, item);
      }

      co2--;
      buildBoard();

    } else if (col == 3) {
      placement1 = column3.indexOf("x");
      placement2 = column3.indexOf("o");

      if (co3 < 0) {
        System.out.println("There are no spaces left.  Lose a turn!");
        updatePlayerNumber(pn);
      } else {
        column3.set(co3, item);
      }

      co3--;
      buildBoard();

    } else if (col == 4) {
      placement1 = column4.indexOf("x");
      placement2 = column4.indexOf("o");

      if (co4 < 0) {
        System.out.println("There are no spaces left.  Lose a turn!");
        updatePlayerNumber(pn);
      } else {
        column4.set(co4, item);
      }

      co4--;
      buildBoard();

    } else if (col == 5) {
      placement1 = column5.indexOf("x");
      placement2 = column5.indexOf("o");

      if (co5 < 0) {
        System.out.println("There are no spaces left.  Lose a turn!");
        updatePlayerNumber(pn);
      } else {
        column5.set(co5, item);
      }

      co5--;
      buildBoard();

    } else if (col == 6) {
      placement1 = column6.indexOf("x");
      placement2 = column6.indexOf("o");

      if (co6 < 0) {
        System.out.println("There are no spaces left.  Lose a turn!");
        updatePlayerNumber(pn);
      } else {
        column6.set(co6, item);
      }

      co6--;
      buildBoard();

    } else if (col == 7) {
      placement1 = column7.indexOf("x");
      placement2 = column7.indexOf("o");

      if (co7 < 0) {
        System.out.println("There are no spaces left.  Lose a turn!");
        updatePlayerNumber(pn);
      } else {
        column7.set(co7, item);
      }

      co7--;
      buildBoard();
    }
  }
}
