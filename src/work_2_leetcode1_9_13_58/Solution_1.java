package work_2_leetcode1_9_13_58;

class Solution_1 {
    class Solution {
        /**
         * �����ƽⷨ
         *
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSum(int[] nums, int target) {
            //����ָ����������洢�±꣨��ʡ�ռ䣩
            int[] indexs = new int[2];
            //�ų��������
            if (nums == null || nums.length == 0) {
                return indexs;
            }
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    //�ų�i=j�����жϺ��Ƿ�Ϊtarget
                    if (i != j && target - nums[i] == nums[j]) {
                        //���±���Ϣ��������
                        indexs[0] = i;
                        indexs[1] = j;
                    }
                }
            }
            return indexs;
        }
    }
}