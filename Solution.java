/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode listNode = new ListNode();
        ListNode res = listNode;
        
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                listNode.next = list1;
                listNode = listNode.next;
                list1 = list1.next;
            } else {
                listNode.next = list2;
                listNode = listNode.next;
                list2 = list2.next; 
            }
        }
        
        if(list1 != null) {
            listNode.next = list1;
        } else if (list2 != null) {
            listNode.next = list2;
        }
        
        return res.next;
    }
}
