package work_2_leetcode1_9_13_58;

import java.util.HashMap;

class Solution_13 {
    public int romanToInt(String s) {
        //HashMap存键值对
        HashMap<Character, Integer> romaMapper = new HashMap<>();
        romaMapper.put('M', 1000);
        romaMapper.put('D', 500);
        romaMapper.put('C', 100);
        romaMapper.put('L', 50);
        romaMapper.put('X', 10);
        romaMapper.put('V', 5);
        romaMapper.put('I', 1);
        //总值
        int sum = 0;
        //当前位数的值
        int cur = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            //当前位小于后卫
            if ((cur = romaMapper.get(s.charAt(i))) < romaMapper.get(s.charAt(i + 1))) {
                //总数减去当前位
                sum -= cur;
            } else {
                //当前位大于或对于后卫（正常累加）
                sum += cur;
            }
        }
        //加上最后一位，同时当字符串只有一位时，sum=0，该式仍成立
        return sum + romaMapper.get(s.charAt(s.length()-1));
    }
}
