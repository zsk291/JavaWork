package work_3_leetcode21_83_290;

public class Solution_21 {
    /**
     * 暴力破解法
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //先剔除特别情况
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        //创建虚拟节点存储新链表(-1<0)
        ListNode p = new ListNode(-1);
        //创建一个与res头地址相同的链表，方便后续列表存储完后返回
        ListNode res = p;
        //任意一个遍历完成，则插空完成，停止遍历
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                //把小的节点存在res链表结尾
                p.next = new ListNode(list1.val);
                //l1节点已被存入res,把从l1的下一个节点当作头节点，以便下一次l1，l2头节点的大小比较
                list1 = list1.next;
            } else {
                p.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            //到p链表尾部，以便下一次接入节点
            p = p.next;
        }
        //将未被全部插入的链表的结尾存入res
        if (list1 != null) p.next = list1;
        if (list2 != null) p.next = list2;
        //返回整个链表
        return res.next;
    }

}


