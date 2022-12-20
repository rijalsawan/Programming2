import java.util.Arrays;
import java.util.Random;

public class Search {
    public static void main(String[] args) {

    }
        public static int BinarySearch(int[] L, int X) {
            // If the list is empty, return -1 to indicate "not found"
            if (L.length == 0) {
                return -1;
            }
            // Determine the midpoint of the list
            int mid = L.length / 2;

            // Determine the value at the midpoint of the list
            int midVal = L[mid];

            // If X is less than the midpoint value, search the left sublist
            if (X < midVal) {
                return BinarySearch(Arrays.copyOfRange(L, 0, mid), X);
            }
            // If X is greater than the midpoint value, search the right sublist
            else if (X > midVal) {
                return BinarySearch(Arrays.copyOfRange(L, mid + 1, L.length), X);
            }
            // If X is equal to the midpoint value, return the index of the midpoint
            else {
                return mid;
            }
        }
    }
