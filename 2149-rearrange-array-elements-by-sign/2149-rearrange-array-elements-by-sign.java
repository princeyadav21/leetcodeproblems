class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1; // Start positive numbers at even indices, negative at odd indices.

        // Traverse the original array and place numbers in the correct positions.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                // Place positive number at the next available even index if it exists.
                if (posIndex < nums.length) {
                    result[posIndex] = nums[i];
                    posIndex += 2;
                }
            } else {
                // Place negative number at the next available odd index if it exists.
                if (negIndex < nums.length) {
                    result[negIndex] = nums[i];
                    negIndex += 2;
                }
            }
        }

        // Handle any remaining numbers (if counts of positive and negative numbers are unequal)
        for (int i = 0; i < nums.length; i++) {
            if (result[i] == 0) {
                if (posIndex < nums.length && nums[i] >= 0) {
                    result[posIndex] = nums[i];
                    posIndex += 2;
                } else if (negIndex < nums.length && nums[i] < 0) {
                    result[negIndex] = nums[i];
                    negIndex += 2;
                }
            }
        }

        return result;
    }
}
