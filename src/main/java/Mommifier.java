import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Mommifier {
    ArrayList<Character> VOWELS = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public String insert_mommy_for_string(String str){
        int len = str.length();
        int vowel_counts = get_string_vowels_counts(str);
        float precent = 0.3f;
        String insert_words = "mommy";

        if (vowel_counts <= len * precent)
            return str;

        StringBuilder result = new StringBuilder();
        boolean is_vowel_flag = is_vowels(str.charAt(0));
        result.append(str.charAt(0));

        for (int i = 1; i < len; i++){
            if (is_vowel_flag && is_vowels(str.charAt(i)))
                result.append(insert_words);
            result.append(str.charAt(i));
            is_vowel_flag = is_vowels(str.charAt(i));
        }
        return result.toString();
    }

    public int get_string_vowels_counts(String str){
        return (int) str.chars().mapToObj(c -> (char)c)
                                .map(Character::toLowerCase)
                                .filter(c -> VOWELS.contains(c))
                                .count();
    }

    public boolean is_vowels(char c){
        return VOWELS.contains(Character.toLowerCase(c));
    }



}
