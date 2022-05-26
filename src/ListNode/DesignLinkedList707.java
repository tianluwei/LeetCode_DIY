package ListNode;

public class DesignLinkedList707 {
//    不要有敌意。该怎么样就怎么样，自己永远是有主动性的，受害者心态意味着把自己的权利，自己的自由责任交给别人，这样可不对。

//    我好像总是把别人想的超级厉害，永远不可能战胜。因为习得性无助？？我爸那？
//    但其实要客观的来看，也就那样嘛。。。
//    每个人有自己的长处和短处。要正确对待。况且多看看自己好的方面，你不需要和别人去比较。
    ListNode head;
    int size=0;
    public DesignLinkedList707() {

    }

    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        ListNode dummy=head;
        while(index>0){
            dummy=dummy.next;
            index--;
        }
        return dummy.val;
    }

    public void addAtHead(int val) {
        if(head==null){
            head=new ListNode(val);
        }else{
            ListNode temp=new ListNode(val);
            temp.next=head;
            head=temp;
        }
        size++;
    }

    public void addAtTail(int val) {
        if(head==null){
            head=new ListNode(val);
        }else{
            ListNode dummy=head;
            while(dummy.next!=null){
                dummy=dummy.next;
            }
            dummy.next=new ListNode(val);
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index<=0){
            addAtHead(val);
        }else if(index==size){
            addAtTail(val);
        }else if(index>size){
            return;
        }else{
            ListNode dummy=head;
            while(index>1){
                dummy=dummy.next;
                index--;
            }
            ListNode temp=new ListNode(val);
            temp.next=dummy.next;
            dummy.next=temp;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index==0){
            head=head.next;
            size--;
        }else if(index>0 && index<size){
            ListNode dummy=head;
            while(index>1){
                dummy=dummy.next;
                index--;
            }
            dummy.next=dummy.next.next;
            size--;
        }
    }
}
