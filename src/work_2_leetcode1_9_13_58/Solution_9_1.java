package work_2_leetcode1_9_13_58;

class Solution_9_1 {
    /**
     * 判断是否为回文数（倒序判断法）
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        //0符合条件直接返回true
        if (x == 0) return true;
        //筛除负数
        if (x < 0 ||x%10==0) return false;
        //定义rev变量存储倒序数
        int rev = 0;
        while (x > rev) {
            //将尾数存入倒序数的第一位
            rev = rev * 10 + x % 10;
            //剔除一位已经转入倒序数的尾数
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}

