import java.util.Arrays;
import java.util.List;


public class Troll {
    public static String disemvowel(String str) {
        Character[] charArray = new Character[]{'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        List<Character> charList = Arrays.asList(charArray);
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        for (String element : s) {
            for (int i = 0; i < element.length(); i++) {
                if (!charList.contains(element.charAt(i))) {
                    sb.append(element.charAt(i));
                }
            }
        sb.append(" ");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}
