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
import java.util.List;
import java.util.Random;

public class WordScramble {
  // important variables
  int round = 0;
  private Random random = new Random();
  ArrayList<String> words = new ArrayList<String>();

  words.add("random")
  words.add("first")
  words.add("pumpkin");
  words.add("christmas");
  words.add("library");
  words.add("pedestrian");

  public String randomWord() {
    // method will choose word from ArrayList of words to be scrambled up later on
    int indexWords = random.nextInt(words.size());
    String myWord = words.get(indexWords);
    return myWord;
  }
  
  public void scrambleWord() {
    // takes in randomly picked word, separates into individ chars, scrambles chars around to form new "word" then returned to user
    String w = randomWord(); // makes a random word
    int wordLength = w.length; // takes the word's length in wordLength to be used to re-print the word in loops
    for (int i = 0; i < wordLength; i++) {
      char c = w.charAt(i);
      // unless I do something like char x = w.charAt(i+1) etc. but then again we dont know length of word/how many variables needed
      //System.out.print(c);
    } 
  }
  
  public void checkGuess(String wordUserInput) {
    return wordUserInput;
  }
}
