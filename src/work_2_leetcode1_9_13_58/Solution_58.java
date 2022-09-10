package work_2_leetcode1_9_13_58;

class Solution_58 {
    /**
     * 返回字符串中 最后一个 单词的长度
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int len = 0;
        //倒序遍历
        for (int i = s.length() - 1; i >= 0; i--) {
            //遇到空格前len自增
            if (s.charAt(i) != ' ') {
                len++;
                //遇到空格则最后一个单词长度信息收集完成（同时防止句子末尾为空格的问题）
            } else if (len != 0) {
                return len;
            }
        }
        //空句子
        return len;
    }
}
