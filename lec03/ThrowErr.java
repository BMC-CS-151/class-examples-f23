// Adam Poliak
// Example creating and throwing an error

public class ThrowErr {

  public static void main(String[] args) throws Exception {


    // usually just throw and create a new Exception all on 
    // one line but this shows how Exception is a type
    // and we can create an Exception variable
    Exception e = new Exception("This is your error message: ");
    throw e; 
    // this needs a command line arg
    //throw new Exception("This is your error message: " + args[0]);
  }
}
