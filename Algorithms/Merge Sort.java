import java.util.Arrays;

class MergeSort {
  public void sort(int[] array) {
    if (array.length < 2)
      return; // If the array has less than 2 elements, it's already sorted or empty, so we return.

    var middle = array.length / 2; // Calculate the middle index of the array.

    // Split the array into two halves: left and right
    int[] left = new int[middle]; // Create a new array for the left half.
    for (var i = 0; i < middle; i++)
      left[i] = array[i]; // Copy elements from the original array to the left array.

    int[] right = new int[array.length - middle]; // Create a new array for the right half.
    for (var i = middle; i < array.length; i++)
      right[i - middle] = array[i]; // Copy elements from the original array to the right array.

    // Recursively sort the left and right halves.
    sort(left);
    sort(right);

    // Merge the sorted left and right halves back into the original array.
    merge(left, right, array);
  }

  private void merge(int[] left, int[] right, int[] result) {
    int i = 0, j = 0, k = 0; // Initialize pointers for the left, right, and result arrays.

    // Compare elements from the left and right arrays and merge them into the result array.
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j])
        result[k++] = left[i++]; // If the current element in the left array is smaller, add it to the result and move the left pointer.
      else
        result[k++] = right[j++]; // If the current element in the right array is smaller, add it to the result and move the right pointer.
    }

    // Add any remaining elements from the left array to the result array.
    while (i < left.length)
      result[k++] = left[i++];

    // Add any remaining elements from the right array to the result array.
    while (j < right.length)
      result[k++] = right[j++];
  }
}

class Main {
  public static void main(String[] args) {
    int[] numbers = { 7, 3, 5, 2, 3, 1, 5, 8 }; // An array of numbers to be sorted.
    var sorter = new MergeSort(); // Create an instance of the MergeSort class.
    sorter.sort(numbers); // Sort the array using the merge sort algorithm.
    System.out.println(Arrays.toString(numbers)); // Print the sorted array.
  }
}
