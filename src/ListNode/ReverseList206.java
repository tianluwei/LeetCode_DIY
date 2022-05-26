package ListNode;

public class ReverseList206 {

//    递归，其实好像也不难！
    public ListNode reverseList(ListNode head) {
        return reverse(null,head);
    }
    public ListNode reverse(ListNode pre,ListNode head){
        if(head==null){
            return pre;
        }
        ListNode next=head.next;
        head.next=pre;

        return reverse(head,next);
    }

//    非递归，已经拿捏了！
//    public ListNode reverseList(ListNode head) {
//        ListNode pre=null;
//        ListNode next=null;
//        while(head!=null){
//            next=head.next;
//            head.next=pre;
//
//            pre=head;
//            head=next;
//        }
//        return pre;
//    }
}
