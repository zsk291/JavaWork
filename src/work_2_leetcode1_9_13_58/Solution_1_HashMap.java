package work_2_leetcode1_9_13_58;

import java.util.HashMap;

public class Solution_1_HashMap {
    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。(HashMap)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        //创建指定长度数组存储下标（节省空间）
        int[] indexs = new int[2];
        //排除特殊情况
        if (nums == null || nums.length == 0) {
            return indexs;
        }
        //使用map避免暴力循环导致的时间复杂度过大，且相对set集合，map存储值和下标更方便
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //查找 补数 是否存在，找到则将下标信息存入下标数组，未找到则重复找补数操作
            if (map.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = map.get(nums[i]);
                return indexs;
            }
            //存入当前 num[i]的补数 到map
            map.put(target - nums[i], i);
        }
        return indexs;
    }
}
