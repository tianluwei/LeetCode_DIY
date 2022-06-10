package ListNode02;

public class DetectCycle142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        slow=slow.next;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null && slow!=fast){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null || fast.next==null){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
