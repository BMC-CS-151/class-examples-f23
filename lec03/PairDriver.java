public class PairDriver {

  public static void main(String[] args) {
    Pair<Double, Integer> pair = new Pair<Double, Integer>(2., 5);
    System.out.println(pair);

    Pair<String, Integer> pair2 = new Pair<>("hello", 5);
    System.out.println(pair2);

  }

}
