package work_4_leetcode67_119_234_1018;

import java.util.ArrayList;
import java.util.List;

public class Solution_1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer = new ArrayList<Boolean>();
        int sum =0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            //i位数的十进制数 与 i-1位的十进制的关系:numi = numi-1*2 +num[i]
            //将除余（因为每次都要%5，故可仅保留余数）过后的余数给到下一个
            sum = (sum *2+ nums[i])%5;
            answer.add(sum == 0);
        }
        return answer;
    }
}
