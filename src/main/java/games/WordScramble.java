package games;
/*
Create list of words of which one will be picked and scrambled up (arraylist to be flexible with what can be
added and removed)
Once word is picked randomly, method with take in the string word as characters and scramble up
letters into new order
New "word" created, turned back into type string, then printed out for user to see/have the scramble method
be returned
User continuously guesses word, input string provided by user will be checked to see if matches with
original word that random generator picked from arraylist of words
When user wins, will tell number of tries it took (include overall guesses into while loop and count tries)
*/

import java.util.*;
import java.util.ArrayList;
import java.util.Collections.*;
import java.util.List;
import java.util.Random;

public class WordScramble {
  // important variables
  int round = 0;
  private Random random = new Random();
  String unscrambledWord;
  ArrayList<String> words =
      new ArrayList<String>(
          Arrays.asList("random", "first", "pumpkin", "christmas", "library", "pedestrian"));

  public String randomWord() {
    // method will choose word from ArrayList of words to be scrambled up later on
    int indexWords = random.nextInt(words.size());
    String myWord = words.get(indexWords);
    return myWord;
  }

  public String scrambleWord() {
    String word = randomWord(); // makes a random word
    unscrambledWord = word;
    List<Character> temp = new ArrayList<Character>();
    for (char c : word.toCharArray()) { // adds each char of word into a list
      temp.add(c);
    }
    Collections.shuffle(temp); // shuffles the list

    StringBuilder sb = new StringBuilder(); // rebuilds the word
    for (char c : temp) {
      sb.append(c);
    }
    word = sb.toString();
    return word; // returns scrambled word to print it in Main
  }

  // checks to see if the guess is correct.
  public boolean checkGuess(String wordUserInput) {
    if (wordUserInput == unscrambledWord) {
      return true;
    } else {
      return false;
    }
  }
}
