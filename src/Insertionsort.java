public class Insertionsort {
    public static void main(String[] args) {
        int[] array = {1,4,5,6,2,2,4,5,7};
        insertionSort(array);
        for(int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
