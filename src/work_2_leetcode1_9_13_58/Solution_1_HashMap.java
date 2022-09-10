package work_2_leetcode1_9_13_58;

import java.util.HashMap;

public class Solution_1_HashMap {
    /**
     * ����һ���������� nums ��һ������Ŀ��ֵ target�������ڸ��������ҳ� ��ΪĿ��ֵ target  ���� ���� ���������������ǵ������±ꡣ(HashMap)
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
        //ʹ��map���Ⱪ��ѭ�����µ�ʱ�临�Ӷȹ��������set���ϣ�map�洢ֵ���±������
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //���� ���� �Ƿ���ڣ��ҵ����±���Ϣ�����±����飬δ�ҵ����ظ��Ҳ�������
            if (map.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = map.get(nums[i]);
                return indexs;
            }
            //���뵱ǰ num[i]�Ĳ��� ��map
            map.put(target - nums[i], i);
        }
        return indexs;
    }
}
