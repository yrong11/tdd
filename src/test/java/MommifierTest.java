import org.junit.jupiter.api.Test;

import java.lang.management.MonitorInfo;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {

    @Test
    void given_string_when_vowels_more_than_30of_string_length_then_return_insert_mommy_new_string(){
        Mommifier mommifier = new Mommifier();
        String str = "is aeiou";
        assertEquals("is amommyemommyimommyomommyu", mommifier.insert_mommy_new_string(str));
    }

    @Test
    void given_string_when_vowels_less_than_30of_string_length_then_return_string(){
        Mommifier mommifier = new Mommifier();
        String str = "Hello World!";
        assertEquals(str, mommifier.insert_mommy_new_string(str));
    }
}
