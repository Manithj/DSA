class Node {
  public int item; // data
  public Node next; // reference to the next node

  public Node(int i) { // constructor
      item = i; // initialize data
      next = null;
  }

  public void displayNode() { // display node item
      System.out.println(item);
  }
}

class LinkedList {
  private Node head; // reference to first node on list

  public LinkedList() { // constructor
      head = null; // empty list
  }

  public boolean isEmpty() { // true if list is empty
      return (head == null);
  }

  public void insertFirst(int i) { //inserts at start of list
      Node newNode = new Node(i);
      newNode.next = head;
      head = newNode;
  }

  public Node deleteFirst() { //delete first item
      if (isEmpty()) {
          System.out.println("List is empty");
          return null;
      }
      Node temp = head;
      head = head.next;
      return temp;
  }

  public void displayList() { //display items on the list
      if (isEmpty()) {
          System.out.println("List is empty");
          return;
      }
      Node current = head;
      while (current != null) {
          current.displayNode();
          current = current.next;
      }
  }

  public Node find(int key) {
      Node current= head;
      while(current.next!=null) {
          if(current.item==key) {
              break;
          }
          else
              current=current.next;
      }

      if(current.item==key) {
          System.out.println("Item is found");
          return current;
      }
      else{
          System.out.println("Item is not found");
          return null;
      }
  }

  public void delete(int key) {

      Node prevNode = null;
      Node currNode = head;

      while (currNode != null && currNode.item != key) {
          prevNode = currNode;
          currNode = currNode.next;
      }
      if (currNode == head) {
          head = head.next;
          System.out.println("Head node deleted");
      }
      else{
          if (currNode == null) {
              System.out.println("A node with that value does not exist.");
          }
          else {
              System.out.println("A node with the value " +  currNode.item + " deleted");
              prevNode.next = currNode.next;
          }
      }
  }

  public int size() { // returns the number of elements in the list
      int size = 0;
      Node current = head;
      while (current != null) {
          size++;
          current = current.next;
      }
      return size;
  }

class Main {
  public static void main(String[] args) {
      LinkedList myList = new LinkedList();

      System.out.println("Is list empty? " + myList.isEmpty());

      myList.insertFirst(12);
      myList.insertFirst(24);
      myList.insertFirst(36);
      myList.insertFirst(48);
      myList.insertFirst(60);
      myList.insertFirst(72);
      myList.insertFirst(84);

      System.out.println("List items: ");
      myList.displayList();

      //deleting an item
      Node deletedNode = myList.deleteFirst();
      System.out.print("Deleted node: ");
      deletedNode.displayNode();

      myList.find(48); // find
      myList.delete(72); // delete

      System.out.println("List items: ");
      myList.displayList();

      System.out.println("Is list empty? " + myList.isEmpty());
      System.out.println("Size of list: " + myList.size());

  }
}
}