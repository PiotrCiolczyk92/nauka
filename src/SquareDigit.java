public class SquareDigit {
    public int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            sb.append(Character.getNumericValue(s.charAt(i)) * Character.getNumericValue(s.charAt(i)));
        }
        return Integer.parseInt(sb.toString());
    }
}
