public class ArraySearcher<T> implements ArraySearcherInterface<T> {
    public int search(T[] arr, T[] pattern) {
        if (arr == null || pattern == null || arr.length < pattern.length) {
            return -1; 
        }

        for (int i = 0; i <= arr.length - pattern.length; i++) {
            boolean found = true;
            for (int j = 0; j < pattern.length; j++) {
                if (!arr[i + j].equals(pattern[j])) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }

        return -1;
    }
}
