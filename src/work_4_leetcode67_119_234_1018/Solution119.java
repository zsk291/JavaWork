package work_4_leetcode67_119_234_1018;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    /**
     * 滚动数组法
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i < rowIndex + 1; i++) {
            //从中间开始回滚（保证了中间元素以左的元素遍历不受影响）
            for (int j = i / 2; j >= 0; j--) {
                if (j == 0) {
                    if (i==0){
                        //初始值添加
                        row.add(1);
                    }else {
                        //回滚遍历到首位，把首位对应的尾位赋为1
                        row.add(i, 1);
                    }
                } else {
                    //把上一次循环未改变的j-1与j位的和替代掉j位
                    int cur = row.get(j - 1) + row.get(j);
                    row.set(j, cur);
                    //同时为其对称的元素赋值
                    row.set(i - j, cur);
                }
            }
        }
        return row;
//        List<Integer> res = new ArrayList<>(rowIndex + 1);
//        long cur = 1;
//        for (int i = 0; i <= rowIndex; i++) {
//            res.add((int) cur);
//            //使用组合公式C(n,i) = n!/(i!*(n-i)!)==> 第(i+1)项是第i项的倍数=(n-i)/(i+1);
//            cur = cur * (rowIndex-i)/(i+1);
//        }
//        return res;

    }
}
