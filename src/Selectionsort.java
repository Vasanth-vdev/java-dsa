public class Selectionsort {
    public static void main(String[] args) {
        int[] array = {1,4,3,6,7,5,4,3};
        selectionSort(array);
        for(int i : array) {
            System.out.print(array[i]);
        }
    }
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
