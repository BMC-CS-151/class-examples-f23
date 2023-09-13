public class ThrowErr {

  public static void main(String[] args) throws Exception {

    throw new Exception("This is your error message: ");
    // this needs a command line arg
    //throw new Exception("This is your error message: " + args[0]);
  }
}
