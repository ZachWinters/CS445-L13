/**
 * Interface for checking if an array exists within another array
 */
public interface ArraySearcherInterface<T> {
    // Return the index which pattern resides in arr. 
    // If pattern is not a subarray of arr, return -1.
    int search(T[] arr, T[] pattern);
}
