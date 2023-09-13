// Adam Poliak
// 0998/13/2023
// Generic example with two generics

public class Pair<A, B> {
  private A first; private B second;

  public Pair(A first, B second) {
    this.first = first; this.second = second;
  }

  public A getFirst() {return first;}
  public B getSecond() {return second;}
  public String toString() {
    return this.first.toString() + ", " + this.second.toString();
 }

  public static void main(String[] args) {
    Pair<String,Integer> pair = new Pair<String, Integer>("Lola", 1234);
    System.out.print(pair);

     Pair<String, String> building = new Pair<>("white house", "1600 pennsylvania ave");
      System.out.printf("Joe lives at %s\n", building);
   }
}



