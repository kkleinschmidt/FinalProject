## Project Name: Connect 4 and Word Unscramble

#### Members: 
Kaili Kleinschmidt (kaili.annk3@gmail.com kkleinschmidt@luc.edu), Elie Murphy (ermur97@gmail.com emurphy12@luc.edu), Linette Maliakal (lmaliakal@luc.edu, lmaliakal21@gmail.com) 

##### Workflow: 
Using Google Docs, a C9 workspace, Slack, and github, we will work together and collaborate on what we need to do. We’ll also meet up in person at least once a week on Thursdays. 

##### Abstract: 
We are building the popular “board” game Connect 4 . Using inputs, two users will be able to play against each other in 
Connect 4. They will input the column they want their piece to fall in, and the terminal will update with a 
representation of the game grid until someone has four across, four down, four diagonally, or it's a draw. 
Then, the terminal will print the result of the game. For Unscramble, the user will be provided a word in a list of 
words that already exists that will be scrambled up. The player then has to unscramble the word given in however many 
tries it will take. The player can also give its own word to eventually unscramble, and it will be added to the 
pre-made list of words to be selected from.

#### Project Design:
* language: Java
* we will also be using Lists of various kinds

#### Project Milestones:
* Code the input system and main class.
* Code the updating game board.
* Code the lists of each column.

##### Notes

Four Data Structures:
1. `HashMap`, used to print out the connect 4 table in the terminal
2. `Stacks`, used to keep track of where the tokens are in the columns of connect 4
3. `ArrayList`, used to keep track of the words in the word scrambler
4. `Search`, used to check if the word inputted hasn't been scrambled already
