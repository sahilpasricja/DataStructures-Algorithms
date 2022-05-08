public class LinkedList {

    Node head;
    Node tail;
    static class Node{
        int value;
        Node next;

        Node(int v){
            value = v;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int value){
        Node new_node  = new Node(value);
        // if linked list is empty,
        // then make new node as head adn tail;
        if(list.head == null)
            list.head = new_node;
        if (list.tail == null){
            list.tail = new_node;
        }
        //else update existing list's last element.next to new node
        //and shift tail to newly added node
        else {
            list.tail.next = new_node;
            list.tail = list.tail.next;
        }
        return list;
}

public  static void printList(LinkedList list){
    Node cur_node = list.head;
    System.out.println("Linked List");
    while (cur_node != null){
        System.out.println(cur_node.value + " ");
        cur_node = cur_node.next;
    }
    }

public static  void main(String[] args){
        LinkedList list  = new LinkedList();
        list = insert(list,1);
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,5);
        list = insert(list,8);

        printList(list);



}
}