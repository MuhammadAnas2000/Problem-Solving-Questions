class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    public void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
}

class LinkedList{
    ListNode head;

    public void add(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
        }else{
            ListNode current = head;
            while(current.next != null){
                current =current.next;
            }
            current.next = newNode;
        }
    }

    public void printList(){
        ListNode current = head;
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }
    public ListNode insertionSortList(){
        ListNode current = head;
        ListNode temp = new ListNode();
        ListNode tempHead = new ListNode();
        boolean isHead = true;
        if(current != null){
            temp.val = current.val;
            temp.next = null;
            tempHead = temp;
            current= current.next;
        }
        while(current != null){
                isHead = true;
                while(temp != null) {
                    ListNode Newtemp = new ListNode(current.val);
                    if (temp.val >= current.val && isHead) {
                        Newtemp.next = temp;
                        tempHead = new ListNode();
                        tempHead = Newtemp;
                        isHead = false;
                        break;
                    } else if (temp.next != null && temp.next.val >= current.val) {
                        if(tempHead.val == temp.val){
                            tempHead.next = Newtemp;
                        }
                        Newtemp.next = temp.next;
                        temp.next = Newtemp;
                        break;
                    }
                    else if(temp.next == null){
                        temp.next = Newtemp;
                        break;
                    }
                    temp = temp.next;
                    isHead = false;
                }

            temp = new ListNode();
            temp.val = tempHead.val;
            temp.next = tempHead.next;
            current= current.next;
        }
        return temp;
    }
}
public class InserionSortLinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //list.add(4);
        //list.add(1);
        //list.add(5);
        //list.add(10);
        //list.add(2);
        list.add(-1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(0);
        ListNode list2 = list.insertionSortList();
        list2.printList(list2);
    }
}
