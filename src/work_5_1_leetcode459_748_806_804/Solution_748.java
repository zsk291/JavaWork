package work_5_1_leetcode459_748_806_804;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_748 {
    public static void main(String[] args) {

    }

    /**
     * 找出 words 中的 最短补全词 。
     * @param licensePlate
     * @param words
     * @return
     */
    public String shortestCompletingWord(String licensePlate, String[] words) {
        //licensePlate各字符次数对应数组
        int[] lp = new int[26];
        count(licensePlate,lp);
        //字符串长度排序
        Arrays.sort(words, Comparator.comparingInt(String::length));
        //将各个字符串依次与licensePlate进行匹配
        for(int i=0;i<words.length;i++){
            int[] records = new int[26];
            count(words[i],records);
            boolean flag = true;
            for(int j=0;j<26;j++){
                //个数少于
                if(records[j]<lp[j]){
                    flag=false;
                    break;
                }
            }
            //字符全部存在且个数大于
            if(flag) return words[i];
        }
        return null;
    }
    //统计各字符的个数
    public void count(String s,int[] lp){
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c<='Z'&&c>='A') lp[c-'A']++;
            else if(c<='z'&&c>='a') lp[c-'a']++;
        }
    }
}
