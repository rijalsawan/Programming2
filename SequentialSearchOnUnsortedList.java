import java.util.Random;

public class SequentialSearchOnUnsortedList {
    public static void main(String[] args) {
        int [] arr = {3, 1, 2, 5, 4};
        Random rand = new Random();
        int x = rand.nextInt(4)+1;
        System.out.println(x);
        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i] == x){
                System.out.println("Found element at index " + i);
            }
        }
    }
}
