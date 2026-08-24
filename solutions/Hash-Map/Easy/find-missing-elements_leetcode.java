import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return missingNumbers;
        }

        // Step 1: Initialize min and max boundaries
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        HashSet<Integer> numSet = new HashSet<>();

        // Step 2: Populate the set and identify the range boundaries
        for (int num : nums) {
            numSet.add(num);
            if (num < minVal) minVal = num;
            if (num > maxVal) maxVal = num;
        }

        // Step 3: Iterate through the range and identify missing numbers
        for (int i = minVal; i <= maxVal; i++) {
            if (!numSet.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}
