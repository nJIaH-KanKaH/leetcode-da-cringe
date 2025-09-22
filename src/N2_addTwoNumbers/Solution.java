package N2_addTwoNumbers;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    /**
     * 2. Add Two Numbers
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
     * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * 5->6->7
     * 2->4->3
     * 7->0->1->1
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        int toNextDigit = 0;
        ListNode nextNode = sum;
        ListNode nextl1 = l1;
        ListNode nextl2 = l2;
        while (nextl1 != null || nextl2 != null || toNextDigit!=0) {
            if(nextl1 == null) nextl1 = new ListNode(0,null);
            if(nextl2 == null) nextl2 = new ListNode(0,null);
            int tmpSum = nextl1.val + nextl2.val + toNextDigit;
            nextNode.val = tmpSum % 10;
            toNextDigit = tmpSum / 10;
            if(nextl1.next==null&&nextl2.next==null&&toNextDigit==0){
                nextNode.next = null;
                break;
            }
            nextNode.next = new ListNode();
            nextNode = nextNode.next;
            nextl1 = nextl1.next;
            nextl2 = nextl2.next;
        }
        return sum;
    }
}
