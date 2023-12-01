/* 
    Hunter Havard / Victor Ejiasi

    10/3/2023

    CSCI 3302 Section 002

    PP03

    Files: GenericList.java (input), None (output)

    Purpose: This class is a generic list that implements the ListADT interface. It is used to create a list of any type of object.
*/


public class GenericList<E> extends ListADT<E> {

    private Node<E> head;

    // Description: Constructor for initializing an empty list
    // Parameters and Preconditions: None
    // Postconditions: An empty list is created
    public GenericList() {
        this.head = null;
    }

    // Description: Constructor for initializing a list with one item
    // Parameters and Preconditions: firstItem - the first item to be added to the list
    // Postconditions: A list with one item is created
    public GenericList(E firstItem) {
        this.head = new Node<E>(firstItem);
    }

    // Description: Helper method to get a Node at a specific index
    // Parameters and Preconditions: index - the index of the Node to retrieve
    // Postconditions: Returns the Node at the specified index
    private Node<E> getNodeAt(int index) {
        Node<E> x = this.head;
        for(int i = 1; i <= index; i++){
            x = x.getNext();
        }
        return x;
    }

    // Description: Checks if the list is empty
    // Parameters and Preconditions: None
    // Postconditions: Returns true if the list is empty, false otherwise
    @Override
    public boolean isEmpty() {
        return (this.head == null);
    }

    // Description: Gets the size of the list
    // Parameters and Preconditions: None
    // Postconditions: Returns the number of items in the list

    @Override
    public int size() {
        return this.getSize(this.head);
    }

    public int getSize(Node<E> node){
        if(node == null)
            return 0;
        else
            return 1 + this.getSize(node.getNext());
    }

    // Description: Removes all items from the list
    // Parameters and Preconditions: None
    // Postconditions: The list is empty
    
    @Override
    public void removeAll() {
        this.head = null;
    }

    // Description: Adds an item at a specific index
    // Parameters and Preconditions: index - the index where the item should be added, item - the item to add
    // Postconditions: The item is added at the specified index
    @Override
    public void add(int index, E item) throws ListException {
        if(index < 0 || index > this.size())
            throw new ListException("Index " + index + " is invalid for a list of size " + this.size());
        Node<E> newItem = new Node<E>(item);
        if(index == 0){
            newItem.setNext(this.head);
            this.head = newItem;
        }
        else {
            Node<E> before = this.getNodeAt(index - 1);
            Node<E> current = before.getNext();

            before.setNext(newItem);
            newItem.setNext(current);
        }
    }

    // Description: Gets an item at a specific index
    // Parameters and Preconditions: index - the index of the item to retrieve
    // Postconditions: Returns the item at the specified index
    @Override
    public E get(int index) throws ListException {
        if(index < 0 || index >= this.size())
            throw new ListException("Index " + index + " is invalid for a list of size " + this.size());

        Node<E> n1 = this.getNodeAt(index);
        return n1.getItem();
    }

    // Description: Removes an item at a specific index
    // Parameters and Preconditions: index - the index of the item to remove
    // Postconditions: The item at the specified index is removed
    @Override
    public void remove(int index) throws ListException {
        if(index < 0 || index >= this.size())
            throw new ListException("Index " + index + " is invalid for a list of size " + this.size());

        if(index == 0)
            this.head = this.head.getNext();
        else{
            Node<E> before = this.getNodeAt(index - 1);
            Node<E> nodeToRemove = before.getNext();
            Node<E> nextInLine = nodeToRemove.getNext();

            before.setNext(nextInLine);
            nodeToRemove.setNext(null);
        }
    }

    // Description: Converts the list to a string representation
    // Parameters and Preconditions: None
    // Postconditions: Returns a string representation of the list
    @Override
    public String toString() {
        String s = "[";
        Node<E> current = this.head;
        while (current != null){
                s = s + current.getItem().toString() + ", ";
                current = current.getNext();
            }
        return s + "]";
    }
}