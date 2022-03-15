import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    // Time complexity: O(n)
    public static int[] twoSum(int[] nums, int target) {
        // Initialize an empty HashMap
        Map<Integer, Integer> tmpMap = new HashMap<>();

        // iterate over the element of the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // check if complement exist then conditional return true
            if (tmpMap.containsKey(complement)) {
                // return int array with  get  value from key map complement  and then also put indices of the current element
                return new int[]{tmpMap.get(complement), i};
            } else {
                // Otherwise, put the element in the Map, and move to the next iteration
                tmpMap.put(nums[i], i);
            }

        }
        return new int[]{};
    }
}
