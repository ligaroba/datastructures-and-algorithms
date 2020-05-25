package test.java.graph;

import TDD.Hangman;
import arrayfuncs.ArrayArrangement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestHangman  {
    static Hangman game;
    /*
    * Set up aLl global test requirements
    * */
    @BeforeAll
    static void setUpAll(){
      game= new Hangman();
    }

    /*
     * Set Up test  global test parameters
     * */
    @BeforeEach
    void setUptest(){

    }
    @Test
    public void testAlPhabetCountInWord(){
     String word="pizza";
     char alphabet = 'z';
     int count = game.countAlphabet(word , alphabet);
     assertEquals(2,count);
    }

    @Test
    public void test_beforeGuess(){
        String word = "pizza";
        String clue =game.fetchClue(word);
        StringBuilder clueStrBuild = new StringBuilder();
        for (int i =0 ; i<word.length();i++){
            clueStrBuild.append("-");
        }
        assertEquals(clueStrBuild.toString(),clue);
    }

    @Test
    public void test_AfterCorrectGuess(){
        String word = "pizza";
        char guess = 'a';
        String clue =game.fetchClue(word);
        String newclue =game.fetchClue(word,clue,guess);
        assertEquals("----a",newclue);
    }

    @Test
    public void test_AfterInCorrectGuess(){
        String word = "pizza";
        char guess = 'a';
        String clue =game.fetchClue(word);
        String newclue =game.fetchClue(word,clue,guess);
        assertEquals("-----",newclue,
                "Correct Input value based on logic has been passed");
    }
    @Test
    public void test_whenInvalidGuessFetchClueThrowsException(){
        String word = "pizza";
        char guess = '1';
        String clue=game.fetchClue(word);
         assertThrows(IllegalArgumentException.class,()->
                game.fetchClue(word,clue,guess),
                 "IllegalArgumentException Thrown");
       }

    @Test
    public void testArrayarrangments(){
        ArrayArrangement arrArrng=new ArrayArrangement();
        int [] arr = {-1,-3,2};//{1,3,6,4,1,2};
        int smallest=arrArrng.smallestMissingNum(arr);
        assertEquals(1,smallest);
    }
}
