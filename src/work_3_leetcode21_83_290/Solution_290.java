package work_3_leetcode21_83_290;

import java.util.HashMap;

public class Solution_290 {
    public boolean wordPattern(String pattern, String s) {
        //去除特殊情况
        if(pattern == null || s==null) return false;
        //按“ ”分出各单词
        String[] strings = s.split(" ");
        //去除单词与规律代表字符不一样长的情况
        if(pattern.length() != strings.length) return false;
        HashMap<String,Character> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            //当前单词
            String word =strings[i];
            //当前规律字符
            char c = pattern.charAt(i);
            //判断当前词是否是新词
            if (map.containsKey(word)){
                //判断当前词的规律代表符是否与最初存入的一样
                //一致则继续遍历
                if (map.get(word)!=c){
                    return false;
                }
            }else {
                if (map.containsValue(c)){
                    return false;
                }else {
                    //不包含该词则存入该词与其对应的新的规律代表符
                    map.put(word,c);
                }
            }
        }
        //成功全部遍历完成，即没有不符合规律的情况
        return true;
    }
}
