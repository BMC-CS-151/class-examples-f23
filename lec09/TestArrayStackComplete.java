import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;

import java.lang.IllegalStateException; 

public class TestArrayStackComplete {


  @Test
  public void testPushPop() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    stack.push(1);
    assertTrue(stack.pop() == 1);
  }

  @Test
  public void testEmpty() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    assertTrue(stack.isEmpty());
  }

  @Test
  public void testPushPopEmpty() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    stack.push(1);
    stack.pop();
    assertTrue(stack.isEmpty());
  }

  @Test
  public void testPushTop() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    stack.push(1);
    assertEquals(new Integer(1), stack.top());
  }

  @Test
  public void testTopEmpty() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    assertEquals(null, stack.top());
  }

  @Test
  public void testPopEmpty() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    assertEquals(null, stack.pop());
  }

  @Test(expected = IllegalStateException.class)
  public void testPushFull() throws IllegalStateException {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    for (int i = 0; i < 10; i++) {
        stack.push(i);
    }
    stack.push(10);
  }

  @Test
  public void testInitialSize() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    assertEquals(0, stack.size());
  }

  @Test
  public void testFullSize() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    for (int i = 0; i < 10; i++) {
        stack.push(i);
    }
    assertEquals(10, stack.size());
  }

  @Test(expected = IllegalStateException.class)
  public void testFullSizeEmptyConstructorPush() throws IllegalStateException {
    ArrayStack<Integer> stack = new ArrayStack<Integer>();
    for (int i = 0; i < 1000; i++) {
        stack.push(i);
    }
    stack.push(0);
  }

  @Test
  public void testEmptySizeAfterPushPops() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    for (int i = 0; i < 10; i++) {
        stack.push(i);
    }
    for (int i = 0; i < 10; i++) {
        stack.pop();
    }
    assertEquals(0, stack.size());
  }

  @Test
  public void testToStringEmpty() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    assertEquals("()", stack.toString());

  }

  @Test
  public void testToString1Item() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    stack.push(0);
    assertEquals("(0)", stack.toString());
  }

  @Test
  public void testToString2Item() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    stack.push(0);
    stack.push(0);
    assertEquals("(0, 0)", stack.toString());
  }

  @Test
  public void testToString3Item() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    stack.push(0);
    stack.push(0);
    stack.push(0);
    assertEquals("(0, 0, 0)", stack.toString());
  }

}



