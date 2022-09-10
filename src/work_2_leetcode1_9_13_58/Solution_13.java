package work_2_leetcode1_9_13_58;

import java.util.HashMap;

class Solution_13 {
    public int romanToInt(String s) {
        //HashMap���ֵ��
        HashMap<Character, Integer> romaMapper = new HashMap<>();
        romaMapper.put('M', 1000);
        romaMapper.put('D', 500);
        romaMapper.put('C', 100);
        romaMapper.put('L', 50);
        romaMapper.put('X', 10);
        romaMapper.put('V', 5);
        romaMapper.put('I', 1);
        //��ֵ
        int sum = 0;
        //��ǰλ����ֵ
        int cur = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            //��ǰλС�ں���
            if ((cur = romaMapper.get(s.charAt(i))) < romaMapper.get(s.charAt(i + 1))) {
                //������ȥ��ǰλ
                sum -= cur;
            } else {
                //��ǰλ���ڻ���ں����������ۼӣ�
                sum += cur;
            }
        }
        //�������һλ��ͬʱ���ַ���ֻ��һλʱ��sum=0����ʽ�Գ���
        return sum + romaMapper.get(s.charAt(s.length()-1));
    }
}
