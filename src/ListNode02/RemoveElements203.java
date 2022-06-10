package ListNode02;

public class RemoveElements203 {
    public static void main(String[] args){
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(6);
        ListNode l4=new ListNode(3);
        ListNode l5=new ListNode(4);
        ListNode l6=new ListNode(5);
        ListNode l7=new ListNode(6);
        l1.next=l2;l2.next=l3;
        l3.next=l4;l4.next=l5;
        l5.next=l6;l6.next=l7;
//        ListNode l1=new ListNode(7);
//        ListNode l2=new ListNode(7);
//        ListNode l3=new ListNode(7);
//        ListNode l4=new ListNode(7);
//        l1.next=l2;l2.next=l3;
//        l3.next=l4;
        ListNode listNode = new RemoveElements203().removeElements(l1, 6);
        System.out.println(listNode);
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode res=dummy;
        while(dummy!=null && dummy.next!=null){
            if(dummy.next.val==val){
                dummy.next=dummy.next.next;
            }else{
                dummy=dummy.next;
            }
        }
        return res.next;
    }
}
