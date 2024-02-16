import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a + " " + b);
        String[] arr = {"Hello", "Bro"};
        int[] arrint = new int[2];
        int[] numbers = {1,2,3,4};
        arrint[0] = 10;
        arrint[1] = 20;
        //System.out.println(Arrays.toString(arrint));
        //System.out.println(numbers);
        //System.out.println(arr.length);
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(30);
        arrList.remove(1);
        System.out.println(arrList.contains(30));
        System.out.println(arrList);
    }
}
