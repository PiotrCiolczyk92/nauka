import java.util.Arrays;

public class WellOfIdeadEasy {
    public static String well(String[] x) {
        long result = Arrays.stream(x).filter(element -> element.equals("good"))
                .count();
        if (result > 0 && result < 3) {
            return "Publish!";
        } else if (result > 2) {
            return "I smell a series!";
        } else {
            return "Fail!";
        }
    }
}
