import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int[] arr = {4, 3, 7, 6, 5, 8};
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length-1-i; j++){
                x++;
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            y++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(x);
        System.out.println(y);
    }
}
