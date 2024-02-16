public class bubbleSort {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 5 , 7, 3, 1};
        bubblesort(numbers);
        for(int i : numbers) {
            System.out.print(i);
        }
    }

    public static void bubblesort(int[] arr) {
        for(int i = 0 ; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++) {
                if(arr[j-1] > arr[j]) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
