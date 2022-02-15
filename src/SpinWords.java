import java.util.StringJoiner;

public class SpinWords {
    public String spinWords(String sentence) {
        //TODO: Code stuff here
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String[] separated = sentence.split(" ");
        for (String word : separated) {
            if (word.length() > 3) {
                sb1.append(sb2.append(word).reverse().toString());
                sb2.setLength(0);
                sb1.append(" ");
            } else {
                sb1.append(word);
                sb1.append(" ");
            }
        }
        sb1.setLength(sb1.toString().length()-1);
        return sb1.toString();
    }
}

