public class Reverse_Nodes_in_k_Group {

    /**
     * Definition for singly-linked list.    */
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     }


        public ListNode reverse(ListNode head, int l, int r) {

            ListNode lp, rp, back = null, prev = null;
            ListNode temp = head;
            int c = 0;

            while (c != l) {
                c++;
                back = prev;
                prev = temp;
                temp = temp.next;
            }

            lp = back;
            rp = prev;
            temp = prev;
            prev = null;
            c--;

            while (c != r) {
                c++;
                back = prev;
                prev = temp;
                temp = temp.next;
                prev.next = back;
            }

            if (lp != null)
                lp.next = prev;
            else
                head = prev;
            rp.next = temp;

            return head;

        }

        public ListNode reverseKGroup(ListNode head, int k) {

            int n = 0;
            if (k == 1) {
                return head;
            }
            ListNode temp = head;

            while (temp != null) {
                temp = temp.next;
                n++;
            }

            int loop = n / k;
            int i = 1;
            while (loop != 0) {
                head = reverse(head, i, i + k - 1);
                loop--;
                i = i + k;
            }

            return head;
        }

}
