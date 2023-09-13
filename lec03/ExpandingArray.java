// Ada Poliak
// 09/13/2023
//  Started ExpandingArray

public class ExpandingArray<G> {

  private G[] data;
  private int size; // how many items are in our array

   public ExpandingArray() {
      this.data = (G[]) new Object[5];
      this.size = 0;
    }

    public void insert(G item) {
       // assume our interal array isnt full
       this.data[size] = item;
       this.size++;
     }

      public void print() {
         for (int i = 0; i < this.size; i++) {
            System.out.println("Index of " + i + ": " + data[i]); //\n", i, data[i]); //Index of 0: value
          } 
      }

      public static void main(String[] args) {
        ExpandingArray<Integer> collection = new ExpandingArray<Integer>();
        collection.insert(7);
        collection.print();

        ExpandingArray<String> collection2 = new ExpandingArray<String>();
        collection2.insert("adam");
        collection2.insert("eli");
        collection2.insert("judah");
        collection2.print();
       }
}
