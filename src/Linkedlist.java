import java.util.LinkedList;

public class Linkedlist {
   public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<>();
      list.addFirst("Yo");
      list.push("A");
      list.push("B");
      list.push("C");
      list.push("E");
      list.push("F");
      //list.removeFirst();
      list.add(4, "E");
      System.out.println(list.indexOf("B"));
      System.out.println(list.peekFirst());
   }
}
