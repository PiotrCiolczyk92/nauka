import java.time.LocalDate;

public class LongestSubstring {

    int substringBeginIndex = 0;
    int substringEndIndex = 0;
    LocalDate localDate;

    public int lengthOfLongestSubstring(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    substringBeginIndex = i;
                } else {
                    substringEndIndex = j;
                }
            }
        }


        return 0;
    }
}
