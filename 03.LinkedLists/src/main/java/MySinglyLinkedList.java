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


}
