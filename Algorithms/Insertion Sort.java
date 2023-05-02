/*
 //Pseudo code
insertionSort(array)
  mark first element as sorted
  for each unsorted element X
    'extract' the element X
    for j <- lastSortedIndex down to 0
      if current element j > X
        move sorted element to the right by 1
    break loop and insert X here
end insertionSort
 */

//my code
/*
 // Insertion sort in Java

import java.util.Arrays;

class InsertionSort {

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      // Compare key with each element on the left of it until an element smaller than
      // it is found.
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      // Place key at after the element just smaller than it.
      array[j + 1] = key;
    }
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { 9, 5, 1, 4, 3 };
    InsertionSort is = new InsertionSort();
    is.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
 */

//lecturer's code
class IzaertioaSortArray {
  private long[] a; // ref to array a
  private int nElems; // number of data items
  
  public IzaertioaSortArray(int max) { // constructor
      a = new long[max]; // create the array
      nElems = 0; // no items yet
  }
  
  public void insert(long value) { // put element into array
      a[nElems] = value; // insert it
      nElems++; // increment size
  }
  
  public void display() { // display array contents
      for (int i = 0; i < nElems; i++)
          System.out.print(a[i] + " ");
      System.out.println();
  }
  
  public void insertionSort() { // insertion sort algorithm
      int in, out;
      for (out = 1; out < nElems; out++) { // outer loop (forward)
          long temp = a[out]; // remove marked item
          in = out; // start shifts at out
          while (in > 0 && a[in - 1] >= temp) { // inner loop (backward)
              a[in] = a[in - 1]; // shift item to right
              --in; // go left one position
          }
          a[in] = temp; // insert marked item
      }
  }

  public static void main(String[] args) {
    IzaertioaSortArray arr = new IzaertioaSortArray(10);
    arr.insert(9);
    arr.insert(3);
    arr.insert(7);
    arr.insert(5);
    arr.insert(2);
    arr.insert(1);
    arr.insert(4);
    arr.insert(6);
    arr.insert(8);
    arr.insert(10);
    
    System.out.println("Original array:");
    arr.display();
    
    arr.insertionSort();
    
    System.out.println("Sorted array:");
    arr.display();
}

}
