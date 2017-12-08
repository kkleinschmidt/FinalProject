import java.util.*;

public class ConnectFour {

  // important variables
  int round = 0;
  boolean gameType = false;

  // data structures
  HashMap<Integer, Stack<Integer>> board = new HashMap<Integer, Stack<Integer>>();
  Stack<Integer> column1 = new Stack<Integer>();
  Stack<Integer> column2 = new Stack<Integer>();
  Stack<Integer> column3 = new Stack<Integer>();
  Stack<Integer> column4 = new Stack<Integer>();
  Stack<Integer> column5 = new Stack<Integer>();
  Stack<Integer> column6 = new Stack<Integer>();
  Stack<Integer> column7 = new Stack<Integer>();

  public ConnectFour(boolean gameType) {
    this.gameType = gameType;
  }

  public HashMap<Integer, Stack<Integer>> buildBoard() {
    board.put(1, column1);
    board.put(2, column2);
    board.put(3, column3);
    board.put(4, column4);
    board.put(5, column5);
    board.put(6, column6);
    board.put(7, column7);
  }
}
