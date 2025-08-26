package TWO_SUM;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Map to store thr complement and the index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Checks whether the current number is already in the map
            // If yes, we have already encountered its complement and the index of the complement is stored in the map as value.
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            // Storing the complement of current number and the current index
            // for us to retrieve it in a later stage
            map.put(target-nums[i], i);
        }

        return new int[] {};
    }
    
}
