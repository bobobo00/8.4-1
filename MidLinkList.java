package day15;

/**
 * @ClassName MidLinkList
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/4 22:00]
 * @Version 1.0
 **/

public class MidLinkList {
    public Node midLocation(Node head){
        Node temp=head;
        if(this.length(head)==0){
            System.err.println("链表为空");
            return null;
        }else{
            for (int i = 0; i <(this.length(head))/2 ; i++) {
                temp=temp.next;
            }
        }
        return temp;
    }
    public int length(Node head){
        Node temp=head;
        int num=0;
        while(temp!=null){
            num++;
            temp=temp.next;
        }
        return num;
    }
    public static void main(String[] args) {
        MidLinkList m=new MidLinkList();
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        System.out.println((m.midLocation(head)).data);

    }
}
class Node{
    int data;
    Node next=null;

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }
}
