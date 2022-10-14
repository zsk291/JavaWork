package work_5_1_leetcode459_748_806_804;

import java.util.HashSet;

public class Solution_804 {
    private static String[] mos = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<String>();
        for (String s : words) {
            //方便字符追加
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                sb.append(mos[c - 'a']);
            }
            //无则添加，重复则不添加（防止了重复）
            set.add(sb.toString());
        }
        return set.size();
    }
}
