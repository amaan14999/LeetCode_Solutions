/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
 //HASHSET APPROACH
 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs=new HashSet<>();
        while(head!=null)
        {
            if(hs.contains(head))
                return head;
            hs.add(head);
            head=head.next;
        }
        return null;
        
    }
}


//SLOW POINTER AND FAST POINTER APPROACH

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode fast=head;
        ListNode slow=head;
        ListNode entry=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                while(entry!=slow)
                {
                    entry=entry.next;
                    slow=slow.next;
                }
                return entry;
            }
        }
        return null;
    }
}
//27 lines
