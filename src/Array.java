public class Array {
   private int[] items;

   public Array(int len) {
    items = new int[len];
   } 
   public void print() {
    for(int i=0; i < items.length; i++)
    System.out.println(items[i]);
   }
}
