import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;
        mpp.put(0, 1);
        for (int num : nums) {
            preSum += num;
            cnt += mpp.getOrDefault(preSum - k, 0);
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}