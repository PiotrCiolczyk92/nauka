public class Maskify {
    public String maskify(String word) {
        if (word.length() > 4) {
            StringBuilder sb = new StringBuilder();
            String mask = "#".repeat(word.length() - 4);
            String cut = (word.substring(word.length() - 4, word.length()));
            sb.append(mask);
            sb.append(cut);
            return sb.toString();
        }
        else return word;
    }
}

