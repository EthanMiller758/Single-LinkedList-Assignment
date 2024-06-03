package LinkedList;
public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public SingleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }



    // Cretae a linked List
    public Node createLinkedList(int nodeValue){
        head = new Node(nodeValue);
        tail = head;
        size = 1;
        return head;
    }

  //  insert into a linked list
//    0. If link list doesn't
//    1. inserting at the begining
//    2. Inserting at the ending
//    3. Insert anywhere
    public void insertInLinkedList(int nodeValue, int location){
        Node newNode = new Node(nodeValue);
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            tail = newNode;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
    }

    //Traverse a Linked List
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.value);
                if (tempNode.next != null) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    //Search for a Node

    public boolean searchNode (int nodeValue){
        if (head != null) {
            Node tempNode = head;
            int index = 0;
            while (tempNode != null) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node: " + tempNode.value + " at location: " + index);
                    return true;
                }
                tempNode = tempNode.next;
                index++;
            }
        }
        System.out.println("Node not found");
        return false;
    }


//    Deleting a Node from a Single linked List
//    0. If link list doesn't
//    1. deleting at the begining
//    2. deleting at the ending
//    3. deleting anywhere in the list

    public void delete(int valueToDelete) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.value == valueToDelete) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.value != valueToDelete) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found in the list");
            return;
        }

        prev.next = current.next;
        size--;
    }
}

