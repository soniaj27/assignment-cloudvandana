import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        
        // Call the shuffleArray function to shuffle the array
        shuffleArray(array);
        
        // Printing the shuffled array
        System.out.println(Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        // Loop through the array in reverse order
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index within the range of the array
            int j = random.nextInt(i + 1);
            
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
