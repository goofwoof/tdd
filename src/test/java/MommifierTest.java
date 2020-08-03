import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MommifierTest {
    @Test
    void should_return_insert_mommy_for_each_continuous_set_of_vowels_when_insert_given_the_number_of_vowels_more_than_30percent(){
        //Given
        String testStr = "oooo";
        //When
        String result = new Mommifier().insertMommy(testStr);
        //Then
        String expect = "omommyomommyomommyo";
        assertEquals(expect, result);
    }

    @Test
    void should_return_not_insert_mommy_for_each_continuous_set_of_vowels_when_insert_given_the_number_of_vowels_no_more_than_30percent(){
        //Given
        String testStr = "lill";
        //When
        String result = new Mommifier().insertMommy(testStr);
        //Then
        String expect = "lill";
        assertEquals(expect, result);
    }

    @Test
    void should_return_not_insert_mommy_for_no_continuous_set_of_vowels_when_insert_given_the_number_of_vowels_more_than_30percent(){
        //Given
        String testStr = "lilil";
        //When
        String result = new Mommifier().insertMommy(testStr);
        //Then
        String expect = "lilil";
        assertEquals(expect, result);
    }

    @Test
    void should_return_error_when_insert_given_error_input(){
        //Given
        String testStr = null;
        //When
        try {
            new Mommifier().insertMommy(testStr);
        } catch (Exception e) {
            //Then
            assertEquals("input is wrong", e.getMessage());
            return;
        }
        fail("expected for GrammarException of The vertex args is lack.");
    }
}
