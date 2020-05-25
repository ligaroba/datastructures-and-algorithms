package TDD;

import java.util.LinkedList;
import java.util.Queue;

public class Hangman {

    public int countAlphabet(String word, char alphabet) {
        int results=0;
        for (int i =0 ;i<word.length();i++){
            if(word.charAt(i)==alphabet) {
               results++;
            }
        }
        return results;
    }

    public String fetchClue(String word) {
        StringBuilder clueStrBuild = new StringBuilder();
        for (int i =0 ; i<word.length();i++){
            clueStrBuild.append("-");
        }
        return clueStrBuild.toString();
    }


    public String fetchClue(String word ,String clue, char guess) {
        Queue<Integer> res = new LinkedList<Integer>();

        if(guess>='A' && guess <= 'Z') guess+=32;
        if(guess<'a' || guess>'z') throw new IllegalArgumentException();

        StringBuilder newClue= new StringBuilder();
        for (int i = 0 ; i<clue.length();i++){
           if(word.charAt(i)==guess && clue.charAt(i)!=guess) {
               newClue.append(guess);
           }else{
               newClue.append(clue.charAt(i));
           }

        }

        return newClue.toString();
    }
}
