public class LinkedList {
    // LinkedList.java

    // Class to represent a Node in the LinkedList
    class Node {
        int data;        // Data of the node
        Node next;       // Pointer to the next node in the list

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Class to represent the Singly LinkedList

        // Head of the list
        private Node head;

        // Constructor to initialize the linked list
        public LinkedList() {
            head = null;
        }

        // Method to insert a node at the beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;  // Point the new node's next to the current head
            head = newNode;       // Move the head to point to the new node
        }

        // Method to insert a node at the end
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode; // If list is empty, new node becomes the head
                return;
            }
            Node current = head;
            // Traverse to the last node
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode; // Link the last node to the new node
        }

        // Method to delete a node from the beginning
        public void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty, nothing to delete.");
                return;
            }
            head = head.next;  // Move the head to the next node
        }

        // Method to print the linked list
        public void printList() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node current = head;
            // Traverse and print all nodes
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(); // Newline after the list is printed
        }

        // Main method to test the linked list operations
        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            // Inserting nodes at the beginning and end
            list.insertAtBeginning(10);
            list.insertAtBeginning(20);
            list.insertAtEnd(30);
            list.insertAtEnd(40);

            // Printing the list after insertions
            System.out.print("Linked List after insertions: ");
            list.printList();

            // Deleting a node from the beginning
            list.deleteFromBeginning();
            System.out.print("Linked List after deletion from beginning: ");
            list.printList();
        }
    }
