import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestArrayStack {

  @Test
  public void testEmpty() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    assertTrue(stack.isEmpty());
  }

  @Test
  public void testPushTop() {
    ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
    stack.push(1);
    assertTrue(stack.pop() == 1);
  }

}



