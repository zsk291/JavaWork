package work_4_leetcode67_119_234_1018;

public class Solution67 {

    public String addBinary(String a, String b) {
        //排除特殊情况
        if (a.length() == 0 && b.length() == 0) return "0";
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;
        //反转，方便后续正常思路计算
        a = reverse(a);
        b = reverse(b);

        int aLen = a.length();
        int bLen = b.length();
        //取最大长度
        int maxLen = Math.max(aLen, bLen);
        //采用StringBuilder方便追加（避免使用String导致创建过多实例占用内存）
        StringBuilder sb = new StringBuilder();
        //进位数
        int carrN = 0;
        for (int i = 0; i < maxLen; i++) {
            int aVal = i < aLen ? a.charAt(i) - 48 : 0;
            int bVal = i < bLen ? b.charAt(i) - 48 : 0;
            //当前位的值
            int add = carrN + aVal + bVal;
            sb.append(add % 2);
            carrN = add / 2;
        }
        //最后判断最后一位超出maxLen的进制数是否存在
        if (carrN == 1) sb.append('1');
        return sb.reverse().toString();
    }

    /**
     * 字符串反转方法
     * @param s
     * @return
     */
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}


