package work_5_1_leetcode459_748_806_804;

public class Solution_806 {
    public static void main(String[] args) {

    }

    public int[] numberOfLines(int[] widths, String s) {
        //arr[0]代表所需行数
        //arr[1]代表最后一行遗留的长度
        int[] arrs = new int[2];
        arrs[0] = 1;
        for (char arr : s.toCharArray()) {
            //当前行长度累加
            arrs[1] += widths[arr - 'a'];
            if (arrs[1] > 100) {
                //超出最大长度重新赋值
                arrs[1] = widths[arr - 'a'];
                //行数加1
                arrs[0]++;
            }
        }
        return arrs;
    }
}