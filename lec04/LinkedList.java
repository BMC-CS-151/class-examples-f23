// Adam Poliak
// 09/18
// LinkedList example from class

public class LinkedList<T> {

  private class Node<T> {

     public T data;
     public Node next;
     
     public Node() {
       this.next = null;
     }

     public Node(T data) {
       this.data = data;
     }
  }
  private Node head;

  public LinkedList() {
    head = new Node();
  }

  public void insertHead(T data) {
    // 1. Create new node
    Node tmp = new Node(data);
    // 2. have new node point to head
    tmp.next = head; 
    //3. update the head to point to the new node
    head = tmp;
  }

  public void insertTail(T data) {
    // 1. create a new node
    Node newest = new Node(data);
    // 2. find the last node
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    // 3. make the last node point to newest
    currNode.next = newest;
  }

  public void print() {
    Node currNode = head.next;

    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.print();

    list.insertTail(0);
    list.print();
    list.insertTail(1);
    list.print();
    list.insertTail(2);
    list.print();

    list = new LinkedList<>();
    for (int i = 0; i <10; i++) {
      list.insertTail(i);
    }
    list.print();

    list = new LinkedList<>();
    for (int i = 0; i <10; i++) {
      list.insertHead(i);
    }
    list.print();
  }

}
