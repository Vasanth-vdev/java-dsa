public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,5};
        int index = linearSearch(arr, 5);
        if(index != -1) {
            System.out.println("Element at index at:" + index);
        }else {
            System.out.println("Element not found!");
        }
}

private static int linearSearch(int[] arr, int value) {
    for(int i=0; i < arr.length; i++) {
        if(arr[i] == value) {
            return i;
        }
    }
    return -1;
}
    
}
