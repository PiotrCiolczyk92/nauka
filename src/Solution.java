import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{2, 4, 5, 6};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
}
