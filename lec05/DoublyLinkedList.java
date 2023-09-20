// Adam Poliak
// 09/18
// LinkedList example from class

public class DoublyLinkedList<T> {

  private class Node<T> {

     public T data;
     public Node next;
     public Node prev;
     
     public Node() {
       this.next = null;
       this.prev = null;
     }

     public Node(T data) {
       this.data = data;
     }
  }
  private Node head;
  private Node tail;

  public DoublyLinkedList() {
    head = new Node();
    tail = new Node();
  }

  public void insertFront(T data) {
    // 1. Create new node
    Node tmp = new Node(data);
    // 2. have new node point to head
    tmp.next = head;
    head.prev = tmp; 
    //3. update the head to point to the new node
    head = tmp;
  }

  public void insertBack(T data) {
    //1. make the new doe
    Node newest = new Node(data);
    // 2. find the last node
    Node last = tail.prev;
    // 3. Update the pointers for the new node
    newest.prev = last;
    newest.next = tail;
    
    // 4. Update the tail and old last
    last.next = newest;
    tail.prev = newest;
    newest.next = tail;


    Node currNode = head;
    // 3. make the last node point to newest
    currNode.next = newest;
  }

  public void print() {
    Node currNode = head; //.next;

    while (currNode.next != null) {
      System.out.print("<- " + currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println();
  }
  public static void main(String[] args) {
    DoublyLinkedList<String> list = new DoublyLinkedList<>();

    list.insertFront("Philly");
    list.print();
    list.insertBack("Chicago");
    list.print();
    /*
    list.insertBack(0);
    list.print();
    list.insertBack(1);
    list.print();
    list.insertBack(2);
    list.print();

    list = new DoublyLinkedList<>();
    for (int i = 0; i <10; i++) {
      list.insertBack(i);
    }
    list.print();

    list = new DoublyLinkedList<>();
    for (int i = 0; i <10; i++) {
      list.insertFront(i);
    }
    list.print();
    */
  }

}
