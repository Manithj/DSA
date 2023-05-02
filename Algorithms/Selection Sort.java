/*
//psuedo code
 selectionSort(array, size)
  repeat (size - 1) times
  set the first unsorted element as the minimum
  for each of the unsorted elements
    if element < currentMinimum
      set element as new minimum
  swap minimum with first unsorted position
end selectionSort
 */

//my code
/*
// Selection sort

import java.util.Arrays;

class SelectionSort {
  void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  public static void main(String args[]) {
    int[] data = { 20, 12, 10, 15, 2 };
    SelectionSort ss = new SelectionSort();
    ss.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
 */

//lecturer's code
class SelectionSortArray {
  private long[] a; // ref to array a
  private int nElems; // number of data items
  
  public SelectionSortArray(int max) { // constructor
      a = new long[max]; // create the array
      nElems = 0; // no items yet
  }
  
  public void insert(long value) { // put element into array
      a[nElems] = value; // insert it
      nElems++; // increment size
  }
  
  public void display() { // display array contents
      for (int i = 0; i < nElems; i++) {
          System.out.print(a[i] + " ");
      }
      System.out.println();
  }
  
  private void swap(int one, int two) { // swaps elements in array
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
  }
  
  public void selectionSort() {
      int out, in, min;
      for (out = 0; out < nElems - 1; out++) { // outer loop
          min = out; // minimum
          for (in = out + 1; in < nElems; in++) { // inner loop
              if (a[in] < a[min]) { // if min greater,
                  min = in; // we have a new min
              }
          }
          swap(out, min); // swap them
      }
  }
  
  public static void main(String[] args) {
      SelectionSortArray arr = new SelectionSortArray(5); // create array of size 5
      
      arr.insert(30); // insert elements into array
      arr.insert(50);
      arr.insert(10);
      arr.insert(40);
      arr.insert(20);
      
      System.out.print("Original array: ");
      arr.display(); // display original array
      
      arr.selectionSort(); // sort array
      
      System.out.print("Sorted array: ");
      arr.display(); // display sorted array
  }
}
