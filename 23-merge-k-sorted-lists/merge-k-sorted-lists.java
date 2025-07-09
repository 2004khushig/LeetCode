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
    public ListNode mergeKLists(ListNode[] lists) {
         PriorityQueue<ListNode>heap=new PriorityQueue<>(
            (a,b)->Integer.compare(a.val,b.val));
        for(ListNode n:lists){
            if(n!=null){
                heap.offer(n);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(!heap.isEmpty()){
            ListNode curr=heap.poll();
            tail.next=curr;
            tail=tail.next;
            if(curr.next!=null)heap.offer(curr.next);
        }
        return dummy.next;
    }
}