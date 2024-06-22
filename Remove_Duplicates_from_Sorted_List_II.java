import java.util.*;
// Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class Remove_Duplicates_from_Sorted_List_II {

    public ListNode deleteDuplicates(ListNode head) {

        Set<Integer>h=new HashSet<>();
        ListNode temp=new ListNode(-101);
        ListNode prev=temp;
        while(head!=null){
            if(h.contains(head.val)||(head.next!=null&&head.val==head.next.val)){
                h.add(head.val);

            }
            else{
                prev.next=head;
                prev=head;

            }
            head=head.next;
        }

        prev.next=null;
        return temp.next;


    }


}
