import java.util.Random;

/**
 * Lab 13. Creates an ArraySearcher object and uses it to search various large arrays for randomly-generated subarrays.
 */
public class Lab13 {

    private static Integer[] makeArray(int size) {
        Random rng = new Random();
        Integer[] nums = new Integer[size];
        for(int i=0; i < size; i++) {
            nums[i] = rng.nextInt(10000);
        }
        return nums;
    }

    private static Integer[] getRandomSequence(Integer[] arr, int len) {
        Random rng = new Random();
        int start = rng.nextInt(arr.length - len);
        Integer[] result = new Integer[len];
        for(int i = 0; i < len; i++) {
            result[i] = arr[start + i];
        }
        return result;
    }


    public static void main(String[] args) {
        Integer[] arr = makeArray(10000);
        Integer[] pattern = getRandomSequence(arr, 5);
        ArraySearcher<Integer> as = new ArraySearcher<Integer>();
        int result =  as.search(arr, pattern);
        if (result >= 0) {
            System.out.println("Found the sub-array at index " + result);
        } else {
            System.out.println("Did NOT find the sub-array, although there is one.");
        }
        pattern = new Integer[]{-1, -1, -1, -1, -1};
        result = as.search(arr, pattern);
        if (result >= 0) {
            System.out.println("Should NOT have found the sub-array at index " + result);
        } else {
            System.out.println("Did not find the sub-array in arr");
        }
    }
}
