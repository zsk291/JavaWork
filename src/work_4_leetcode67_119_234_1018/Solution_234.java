package work_4_leetcode67_119_234_1018;


public class Solution_234 {
    public boolean isPalindrome(ListNode head) {
        if (head==null) return false;
        if (head.next==null) return true;
        StringBuilder sb = new StringBuilder();
        while (head!=null){
            sb.append(head.val);
            head=head.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
