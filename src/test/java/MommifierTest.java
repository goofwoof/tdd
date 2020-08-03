import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_insert_mommy_for_each_continuous_set_of_vowels_when_insert_given_the_number_of_vowels_more_than_30percent(){
        //Given
        String testStr = "oooo";
        //When
        String result = new Mommifier().insertMommy(testStr);
        //Then
        String expect = "omommyomommyomommyo";
        assertEquals(expect, result);
    }
}
