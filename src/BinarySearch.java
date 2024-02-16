import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        int target = 990000;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //int index = Arrays.binarySearch(arr, target);
        int index = binarySearch(arr, target);
        if(index < 0) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Target found at index: " + index);
        }
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int value = arr[mid];
            System.out.println("middle:" + value);
            if( target > value) low = mid + 1;
            else if(target < value) high = mid - 1;
            else return mid;
        }
        return -1;
    }

}
