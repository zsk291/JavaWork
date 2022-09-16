package work_3_leetcode21_83_290;

public class Solution_83 {
    /**
     * 删除重复的节点（排好序）
     *
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        //判断是否为空
        if (head == null) return null;
        //判断是否只有一个节点
        if (head.next == null) return head;

        if (head.val == head.next.val) {
            //当前节点与下一节点大小相同，把head.next作为新的链表传入del函数（即相当于删除当前节点）
            head = deleteDuplicates(head.next);
        } else {
            //当前节点与下一节点大小不同
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }
}
