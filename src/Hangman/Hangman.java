package Hangman;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    private String secretWord;
    private char[] disguisedWord;
    private int guessCount, chanceLeft;

    public Hangman() {
        guessCount = 0;
        chanceLeft = 8;
        secretWord = getWord();
        disguisedWord = secretWord.toCharArray();
        for (int i = 0; i < secretWord.length(); i++)
            if (secretWord.charAt(i) == ' ') disguisedWord[i] = ' ';
            else disguisedWord[i] = '-';
    }

    public void makeGuess(char c) {
        char a, b;
        a = b = c;
        a -= 32;
        b += 32;
        String x = new String(disguisedWord);

        for (int i = 0; i < secretWord.length(); i++)
            if (c == secretWord.charAt(i) || b == secretWord.charAt(i) || a == secretWord.charAt(i))
                disguisedWord[i] = secretWord.charAt(i);

        String y = new String(disguisedWord);    //After changing
        if (x.equals(y)) chanceLeft--;    //If before is similar to after
    }

    public String getSecretWord() {
        return secretWord;
    }

    public int getGuessCount() {
        return ++guessCount;
    }

    public int getChanceLeft() {
        return chanceLeft;
    }

    public char[] getDisguisedWord() {
        return disguisedWord;
    }

    public boolean isFound() {
        for (int i = 0; i < disguisedWord.length; i++)
            if (disguisedWord[i] == '-') return false;
        return true;
    }

    public String getWord() {
        Random rand = new Random();
        String[] wordList = {"Python", "Java", "JavaScript", "Kotlin"};
        int r = rand.nextInt(wordList.length);
        return wordList[r];
    }


    public static void main(String[] args) {

        Hangman a1 = new Hangman();
        System.out.println("""
                Welcome to a game of Hangman!
                The game will available soon!
                """ + '\n');
        Scanner key = new Scanner(System.in);

        while (!a1.isFound()) {
            System.out.println(a1.getDisguisedWord());
            System.out.print("Please enter a character" + '\n');
            a1.makeGuess(key.next().charAt(0));
            System.out.println(a1.getDisguisedWord());
            System.out.println("Guess count: " + a1.getGuessCount());
            System.out.println("Chances left: " + a1.getChanceLeft());
            if (a1.getChanceLeft() == 0) {
                System.out.println("You lost!");
                System.out.println("The secret word was: " + a1.getSecretWord());
                break;
            }
            if (a1.isFound()) System.out.println("You survive!");
        }
        key.close();
    }
}
