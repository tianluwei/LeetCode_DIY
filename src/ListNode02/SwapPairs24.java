package ListNode02;

public class SwapPairs24 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        l1.next=l2;l2.next=l3;l3.next=l4;
        ListNode listNode = new SwapPairs24().swapPairs(l1);
        System.out.println(listNode);
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode end=dummy;
        while(end!=null){
            for(int i=0;i<2 && end!=null;i++){
                end=end.next;
            }
            if(end==null){
                break;
            }
            ListNode start=pre.next;
            ListNode next=end.next;
            end.next=null;
            pre.next=reverse(start);
            start.next=next;
            pre=start;
            end=start;
        }
        return dummy.next;
    }
    private ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;

            pre=head;
            head=next;
        }
        return pre;
    }
}
