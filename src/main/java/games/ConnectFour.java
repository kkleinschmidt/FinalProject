package games;

import java.util.*;

public class ConnectFour {

  // important variables
  int countPlayer1 = 0;
  int countPlayer2 = 0;

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
  public void update(int c, int p) {
    if (p == 0) {
      updateColumn(randomCol(), "o");
    } else if (p == 1) {
      updateColumn(c, "x");
    } else if (p == 2) {
      updateColumn(c, "o");
    }
  }

  public int checkWinner() {
    columnAndRow();

    int colCount1_1 = 0;
    int colCount2_1 = 0;
    int colCount1_2 = 0;
    int colCount2_2 = 0;
    int colCount1_3 = 0;
    int colCount2_3 = 0;
    int colCount1_4 = 0;
    int colCount2_4 = 0;
    int colCount1_5 = 0;
    int colCount2_5 = 0;
    int colCount1_6 = 0;
    int colCount2_6 = 0;
    int colCount1_7 = 0;
    int colCount2_7 = 0;

    for (int i = 0; i < 6; i++) {
      String p1 = column1.get(i);
      String p2 = column2.get(i);
      String p3 = column3.get(i);
      String p4 = column4.get(i);
      String p5 = column5.get(i);
      String p6 = column6.get(i);
      String p7 = column7.get(i);

      if (p1 == "x") {
        colCount1_1++;
      } else if (p1 == "o") {
        colCount2_1++;
      }

      if (p2 == "x") {
        colCount1_2++;
      } else if (p2 == "o") {
        colCount2_2++;
      }

      if (p3 == "x") {
        colCount1_3++;
      } else if (p3 == "o") {
        colCount2_3++;
      }

      if (p4 == "x") {
        colCount1_4++;
      } else if (p4 == "o") {
        colCount2_4++;
      }

      if (p5 == "x") {
        colCount1_5++;
      } else if (p5 == "o") {
        colCount2_5++;
      }

      if (p6 == "x") {
        colCount1_6++;
      } else if (p6 == "o") {
        colCount2_6++;
      }

      if (p7 == "x") {
        colCount1_7++;
      } else if (p7 == "o") {
        colCount2_7++;
      }
    }

    if (colCount1_1 == 4
        || colCount1_2 == 4
        || colCount1_3 == 4
        || colCount1_4 == 4
        || colCount1_5 == 4
        || colCount1_6 == 4
        || colCount1_7 == 4) {
      return 1;
    } else if (colCount2_1 == 4
        || colCount2_2 == 4
        || colCount2_3 == 4
        || colCount2_4 == 4
        || colCount2_5 == 4
        || colCount2_6 == 4
        || colCount2_7 == 4) {
      return 2;
    }

    int rowCount1_1 = 0;
    int rowCount2_1 = 0;
    int rowCount1_2 = 0;
    int rowCount2_2 = 0;
    int rowCount1_3 = 0;
    int rowCount2_3 = 0;
    int rowCount1_4 = 0;
    int rowCount2_4 = 0;
    int rowCount1_5 = 0;
    int rowCount2_5 = 0;
    int rowCount1_6 = 0;
    int rowCount2_6 = 0;

    for (int i = 0; i < 7; i++) {
      String p1 = row1.get(i);
      String p2 = row2.get(i);
      String p3 = row3.get(i);
      String p4 = row4.get(i);
      String p5 = row5.get(i);
      String p6 = row6.get(i);

      if (p1 == "x") {
        rowCount1_1++;
      } else if (p1 == "o") {
        rowCount2_1++;
      }

      if (p2 == "x") {
        rowCount1_2++;
      } else if (p2 == "o") {
        rowCount2_2++;
      }

      if (p3 == "x") {
        rowCount1_3++;
      } else if (p3 == "o") {
        rowCount2_3++;
      }

      if (p4 == "x") {
        rowCount1_4++;
      } else if (p4 == "o") {
        rowCount2_4++;
      }

      if (p5 == "x") {
        rowCount1_5++;
      } else if (p5 == "o") {
        rowCount2_5++;
      }

      if (p6 == "x") {
        rowCount1_6++;
      } else if (p6 == "o") {
        rowCount2_6++;
      }
    }

    if (rowCount1_1 == 4
        || rowCount1_2 == 4
        || rowCount1_3 == 4
        || rowCount1_4 == 4
        || rowCount1_5 == 4
        || rowCount1_6 == 4) {
      return 1;
    } else if (rowCount2_1 == 4
        || rowCount2_2 == 4
        || rowCount2_3 == 4
        || rowCount2_4 == 4
        || rowCount2_5 == 4
        || rowCount2_6 == 4) {
      return 2;
    }

    return 0;
  }

  // adds a piece to a column
  public void updateColumn(int col, String item) {

    int placement1 = -1;
    int placement2 = -1;

    if (col == 1) {
      placement1 = column1.indexOf("x");
      placement2 = column1.indexOf("o");

      if (placement1 == -1 && placement2 == -1) {
        column1.set(co1, item);
      } else {
        column1.set(co1, item);
      }

      co1--;
      buildBoard();

    } else if (col == 2) {
      placement1 = column2.indexOf("x");
      placement2 = column2.indexOf("o");

      if (placement1 == -1 && placement2 == -1) {
        column2.set(co2, item);
      } else {
        column2.set(co2, item);
      }

      co2--;
      buildBoard();

    } else if (col == 3) {
      placement1 = column3.indexOf("x");
      placement2 = column3.indexOf("o");

      if (placement1 == -1 && placement2 == -1) {
        column3.set(co3, item);
      } else {
        column3.set(co3, item);
      }

      co3--;
      buildBoard();

    } else if (col == 4) {
      placement1 = column4.indexOf("x");
      placement2 = column4.indexOf("o");

      if (placement1 == -1 && placement2 == -1) {
        column4.set(co4, item);
      } else {
        column4.set(co4, item);
      }

      co4--;
      buildBoard();

    } else if (col == 5) {
      placement1 = column5.indexOf("x");
      placement2 = column5.indexOf("o");

      if (placement1 == -1 && placement2 == -1) {
        column5.set(co5, item);
      } else {
        column5.set(co5, item);
      }

      co5--;
      buildBoard();

    } else if (col == 6) {
      placement1 = column6.indexOf("x");
      placement2 = column6.indexOf("o");

      if (placement1 == -1 && placement2 == -1) {
        column6.set(co6, item);
      } else {
        column6.set(co6, item);
      }

      co6--;
      buildBoard();

    } else if (col == 7) {
      placement1 = column7.indexOf("x");
      placement2 = column7.indexOf("o");

      if (placement1 == -1 && placement2 == -1) {
        column7.set(co7, item);
      } else {
        column7.set(co7, item);
      }

      co7--;
      buildBoard();
    }
  }

  public void columnAndRow() {

    column1.addAll(board.get(1));
    column2.addAll(board.get(2));
    column3.addAll(board.get(3));
    column4.addAll(board.get(4));
    column5.addAll(board.get(5));
    column6.addAll(board.get(6));
    column7.addAll(board.get(7));

    row1.add(column1.get(0));
    row1.add(column2.get(0));
    row1.add(column3.get(0));
    row1.add(column4.get(0));
    row1.add(column5.get(0));
    row1.add(column6.get(0));
    row1.add(column7.get(0));

    row2.add(column1.get(1));
    row2.add(column2.get(1));
    row2.add(column3.get(1));
    row2.add(column4.get(1));
    row2.add(column5.get(1));
    row2.add(column6.get(1));
    row2.add(column7.get(1));

    row3.add(column1.get(2));
    row3.add(column2.get(2));
    row3.add(column3.get(2));
    row3.add(column4.get(2));
    row3.add(column5.get(2));
    row3.add(column6.get(2));
    row3.add(column7.get(2));

    row4.add(column1.get(3));
    row4.add(column2.get(3));
    row4.add(column3.get(3));
    row4.add(column4.get(3));
    row4.add(column5.get(3));
    row4.add(column6.get(3));
    row4.add(column7.get(3));

    row4.add(column1.get(4));
    row4.add(column2.get(4));
    row4.add(column3.get(4));
    row4.add(column4.get(4));
    row4.add(column5.get(4));
    row4.add(column6.get(4));
    row4.add(column7.get(4));

    row5.add(column1.get(5));
    row5.add(column2.get(5));
    row5.add(column3.get(5));
    row5.add(column4.get(5));
    row5.add(column5.get(5));
    row5.add(column6.get(5));
    row5.add(column7.get(5));

    row6.add(column1.get(6));
    row6.add(column2.get(6));
    row6.add(column3.get(6));
    row6.add(column4.get(6));
    row6.add(column5.get(6));
    row6.add(column6.get(6));
    row6.add(column7.get(6));
  }

  public int randomCol() {
    return 1; // temporary
  }
}
