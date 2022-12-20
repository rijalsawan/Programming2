import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 6, 5, 8};
        for (int i =0; i<arr.length-1; i++){
            int smallest = i;
            for (int j = i+1; j<arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
