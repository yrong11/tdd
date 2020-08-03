import org.junit.jupiter.api.Test;

import java.lang.management.MonitorInfo;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {

    Mommifier mommifier = new Mommifier();

    @Test
    void should_insert_mommy_when_vowels_more_than_30_and_have_continue_vowels(){
        String testStr = "is aeiou";
        String testResult = "is amommyemommyimommyomommyu";
        assertEquals(testResult, mommifier.insert_mommy_for_string(testStr));
    }

    @Test
    void not_insert_mommy_when_vowels_more_than_30_but_not_have_continue_vowels(){
        String testStr = "is ahbo";
        assertEquals(testStr, mommifier.insert_mommy_for_string(testStr));
    }

    @Test
    void should_return_original_string_when_vowels_less_than_30_present(){
        String testStr1 = "Hello World!";
        assertEquals(testStr1, mommifier.insert_mommy_for_string(testStr1));
        String testStr2 = "aeio bnmfkzlpmqwmm";
        assertEquals(testStr2, mommifier.insert_mommy_for_string(testStr2));
    }

    @Test
    void should_return_empty_string_when_input_empty_string(){
        String testStr = "";
        assertEquals(testStr, mommifier.insert_mommy_for_string(testStr));
    }

}
