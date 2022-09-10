public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }

    void add(int data){
        // Create a new Node object from data

        Node node = new Node(data);
        if(isEmpty()){// If the list is empty
            head = tail = node;
            size++;

        }else{// If there are elements in the list
            tail.next = node;
            tail = node;
            size++;
        }
    }
void printNode(){
        Node current = head;
        while(current !=null){
            if(current.next == null) System.out.println(current.id + " => null");
            else {
                System.out.print(current.id + " => ");

            }
            current = current.next;
        }
}

}
