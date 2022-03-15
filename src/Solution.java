class Solution {
    // Time complexity: O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        // The naive approach is to just use two nested for loops and check if the sum of any two elements in the array is equal to the given target
        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};

    }
}

