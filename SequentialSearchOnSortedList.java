import java.util.Arrays;
import java.util.Random;

public class SequentialSearchOnSortedList {
    public static void main(String[] args) {
        int [] arr = {3, 1, 2, 5, 4};
        Arrays.sort(arr);
        Random rand = new Random();
        int x = rand.nextInt(4)+1;
        System.out.println(x);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i<=arr.length-1; i++){
            if (arr[i] == x ){
                System.out.println("Element found at index: " + i);
            }
            else if (arr[i]>x){
                System.out.println("Not found");
            }
        }
    }
}
