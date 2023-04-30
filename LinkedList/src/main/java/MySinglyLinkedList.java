public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;



    boolean isEmpty(){
        return head == null;
    }

    void add(int data){
        Node node = new Node(data);

        if(isEmpty()){
            head=tail=node;
        }else{
            tail.next = node;
            tail = node;

        }
        size++;
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.id + "=> null");
            } else {
                System.out.print( current.id + "=>");

            }
            current = current.next;
        }
    }


    public int getKthItemFromLast(int k){
        Node ptr1 = head;
        Node ptr2 = head;

        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
        }
        while(ptr2!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1.id;
    }

}
