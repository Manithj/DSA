/*
Pseudo code for this
bubbleSort(array)
  for i <- 1 to indexOfLastUnsortedElement-1
    if leftElement > rightElement
      swap leftElement and rightElement
end bubbleSort
*/



//my method
/*
 // Bubble sort

import java.util.Arrays;

class Main {

  // perform the bubble sort
  static void bubbleSort(int array[]) {
    int size = array.length;
    
    // loop to access each array element
    for (int i = 0; i < size - 1; i++)
    
      // loop to compare array elements
      for (int j = 0; j < size - i - 1; j++)

        // compare two adjacent elements
        // change > to < to sort in descending order
        if (array[j] > array[j + 1]) {

          // swapping occurs if elements
          // are not in the intended order
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public static void main(String args[]) {
      
    int[] data = { -2, 45, 0, 11, -9 };
    
    // call method using class name
    Main.bubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}
 */

 //madam's code

 class BubbleSortArray{
  private long[] a; // ref to array a
  private int nElems; // number of data items
  
  public BubbleSortArray(int max) { // constructor
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
  
  private void swap(int one, int two) { // swaps array elements in place
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
  }
  
  public void bubbleSort() { // bubble sort algorithm
      int outer, inner;
      for (outer = nElems - 1; outer > 1; outer--) { // outer loop (backward)
          for (inner = 0; inner < outer; inner++) { // inner loop (forward)
              if (a[inner] > a[inner + 1]) { // out of order?
                  swap(inner, inner + 1); // swap them
              }
          }
      }
  }

  public static void main(String[] args) {
    BubbleSortArray arr = new BubbleSortArray(10);
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
    
    arr.bubbleSort();
    
    System.out.println("Sorted array:");
    arr.display();
}

}
