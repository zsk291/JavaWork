package work_5_1_leetcode459_748_806_804;

public class Solution_459 {
    public static void main(String[] args) {

    }

    /**
     * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
     * 枚举法
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        //枚举子串元素，长度为i
        for (int i = 1; i  <= n/2; i++) {
            //按子串长度划分字符串
            if (n % i == 0) {
                boolean flag = true;
                //判断后面的每个子字串的是否前一个子字符串相同
                for (int j = i; j < n; j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        flag = false;
                        break;
                    }
                }
                //任意一个子字符串构成重复就满足规则，故跳出
                if (flag) {
                    return true;
                }
            }
        }
        //所有子串都不满足规则，则不重复
        return false;
    }
}
