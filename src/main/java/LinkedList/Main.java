package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.createLinkedList(1);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 1);
        System.out.println("Original list:");
        singleLinkedList.traverseLinkedList();
        singleLinkedList.delete(0);
        System.out.println("List after deleting node with values 2 and 5:");
        singleLinkedList.traverseLinkedList();

        singleLinkedList.searchNode(7);
    }
}


//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
// why when inserting a value at a position that is already occupied, it throws a null pointer exception.

// Here is some reasons why this can happen:

// Incorrect indexing:

// - When you insert a value at a specific location, you have to ensure that the index is
// within the valid range(0 to size - 1). Also, if the index is out of bounds, it can lead
// to accessing a null reference, which results in a null pointer exception.

// Not updating references properly:

// When you insert a brand-new node, make sure to update the next references correctly.
// If you overwrite an existing node without properly updating the references, it can cause
// issues.

// Handling edge cases:

// Consider edge cases such as inserting at the beginning, end, or middle of the list.
// Make sure the head and tail references are updated correctly.
