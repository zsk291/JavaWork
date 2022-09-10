package work_2_leetcode1_9_13_58;

class Solution_1 {
    class Solution {
        /**
         * 暴力破解法
         *
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
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    //排除i=j，并判断和是否为target
                    if (i != j && target - nums[i] == nums[j]) {
                        //将下标信息存入数组
                        indexs[0] = i;
                        indexs[1] = j;
                    }
                }
            }
            return indexs;
        }
    }
}