import java.util.Arrays;
/*
Longest Increasing Subsequence
approach: at each index we have a choice to chose or not, use dp
time: O(n^2)
space: O(n)
 */
public class Problem1 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i=0;i<n;i++) {
            for (int j = 0;j<i;j++) {
                if (nums[j]<nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
