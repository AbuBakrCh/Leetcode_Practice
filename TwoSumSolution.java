import java.util.*;

public class TwoSumSolution {
    public static void main(String[] args) {
        int result[] = Solution.twoSum(new int[] {2, 7, 11, 15}, 9);
        for (int i = 0; i< result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    private static int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> numbers = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numbers.containsKey(complement)) {
                return new int[] {numbers.get(complement), i};
            }
            numbers.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
