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
    public ListNode reverseBetween(ListNode head, int left, int right,ArrayList<Integer> list) {
        if(head==null || head.next==null){
            return head;
        }
        int si=left;
        int ei=right;
        while(si<=ei){
            int save=list.get(si);
            list.set(si,list.get(ei));
            list.set(ei,save);
            si++;
            ei--;
        }
        //now again transform them into nodes
        ListNode final_head=new ListNode(-1);
        ListNode new_head=final_head;
        for(int el:list){
            ListNode node = new ListNode(el);
            new_head.next=node;
            new_head=new_head.next;
        }
        return final_head.next;   
    }
    public int find_size(ListNode head){
        if(head==null){
            return 0;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1){
            return head;
        }
        //if k is = to size of LL then reverse whole LL at return 
        int size = find_size(head);
        if(k==size){
            ListNode curr=head;
            ListNode next=null;
            ListNode prev=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        int nodes_covered=k;
        int nodes_left=size;//will it decrease okay 
        ListNode temp = head;
        int si=0;
        int ei=k-1;
        ListNode head_of_all_heads = null;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode start=head;
        while(start!=null){
            list.add(start.val);
            start=start.next;
        }
        //we have the list okay 
        while(temp!=null && nodes_left>=k){
            head_of_all_heads = reverseBetween(temp,si,ei,list);
            si+=k;
            ei=si+k-1;
            int count = k;
            while(count-->0){
                temp=temp.next;
            }
            nodes_left-=k; 
        }
        return head_of_all_heads;
    }
}