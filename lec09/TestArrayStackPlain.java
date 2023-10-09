public class TestArrayStackPlain {

  /*
    public int size() { return (t + 1); }
  public boolean isEmpty() { return (t == -1); }
      public void push(E e) throws IllegalStateException {
  public E top() {
  public E pop() {
  public String toString() {
  */

  public static void main(String[] args) {

    ArrayStack<Integer> stack = new ArrayStack<Integer>();

    assert stack.size() == 0;
    assert stack.isEmpty() == true; 

    stack.push(1);
    assert stack.top() == 1;
    assert stack.size() == 1;
  }

}
