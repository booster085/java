/**
 * 
 */
package data_structures;

/**
 * Represents dynamic double list implementation
 * 
 * @author Ilian Grekov
 *
 */
public class DoubleLinkedDynamicList {
	/*
	 * Реализирайте операциите добавяне, премахване и търсене на елемент,
	 * добавяне на елемент на определено място (индекс), извличане на елемент по
	 * индекс и метод, който връща масив с елементите на списъка.
	 */
	private class Node {

		Object element;
		Node next;
		Node previous;

		Node(Object element, Node prevNode) {
			this.element = element;
			prevNode.next = this;
			this.previous = prevNode;
		}

		Node(Object element) {
			this.element = element;
			next = null;
			previous = null;
		}
	}

	private Node head;
	// First to last element head - tail
	// Last to first element tail - head
	private Node tail;
	private int count;

	public DoubleLinkedDynamicList() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	/**
	 * Add element at the end of the list
	 * 
	 * @param item
	 *            - the element you want to add
	 */
	public void add(Object item) {
		if (head == null) {
			// we have empty list
			head = new Node(item);
			tail = head;
		} else {
			// we have non-empty list
			Node newNode = new Node(item, tail);
			tail = newNode;
		}
		count++;
	}

	/**
	 * Add element at specified position in the list
	 * 
	 * @param item
	 *            - the element you want to add
	 */
	public void add(Object item, int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		if (head == null) {
			head = new Node(item);
			tail = head;
		} else {
			int currentIndex = 0;
			Node currentNode = head;
			while (currentIndex < index) {
				currentNode = currentNode.next;
				currentIndex++;
			}
			Node newNode = new Node(item, currentNode.previous);
			newNode.next = currentNode;
			currentNode.previous = newNode;
		}
		count++;

	}

	/**
	 * Removes and returns element on the specific index
	 * 
	 * @param index
	 *            - the index of the element you want to remove
	 * @return the removed element
	 * @exception IndexOutOfBoundsException
	 *                - when index is invalid
	 */
	public Object remove(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}

		// Find the element at the specified position
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentIndex < index) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}

		// Remove the element
		count--;
		if (count == 0) {
			head = null;
			tail = null;
		} else if (prevNode == null) {
			head = currentNode.next;
		} else {
			prevNode.next = currentNode.next;
			if (currentNode.next != null) {
				(currentNode.next).previous = prevNode;
			} else {
				tail = currentNode.previous;
			}
		}

		return currentNode.element;
	}

	/**
	 * Removes the specified item and return its index
	 * 
	 * @param item
	 *            – the item for removal
	 * @return the index of the element or -1 if does not exist
	 */
	public int remove(Object item) {
		// Find the element containing searched item
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentNode != null) {
			if ((currentNode.element != null && currentNode.element
					.equals(item))
					|| (currentNode.element == null)
					&& (item == null)) {
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		if (currentNode != null) {
			// Element is found in the list. Remove it
			count--;
			if (count == 0) {
				head = null;
				tail = null;
			} else if (prevNode == null) {
				head = currentNode.next;
			} else {
				prevNode.next = currentNode.next;
				if (currentNode.next != null) {
					(currentNode.next).previous = prevNode;
				} else {
					tail = currentNode.previous;
				}

			}
			return currentIndex;
		} else {
			// Element is not found in the list
			return -1;
		}
	}

	/**
	 * Searches for given element in the list
	 * 
	 * @param item
	 *            - the item you are searching for
	 * @return the index of the first occurrence of the element in the list or
	 *         -1 if not found
	 */
	public int indexOf(Object item) {
		int index = 0;
		Node current = head;
		while (current != null) {
			if ((current.element != null && current.element.equals(item))
					|| current.element == null && item == null) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}

	/**
	 * Searches for given element in the list
	 * 
	 * @param item
	 *            - the item you are searching for
	 * @return the index of the first occurrence of the element in the list or
	 *         -1 if not found
	 */
	public Object elementAt(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}

		int currentIndex = count;
		Node currentNode = this.tail;
		while (currentIndex - 1 > index) {
			currentNode = currentNode.previous;
			currentIndex--;
		}
		return currentNode.element;
	}

	/**
	 * @return linked list as array
	 */
	public Object[] toArray() {
		Object[] arrObj = new Object[count];
		Node currentNode = head;
		for (int i = 0; i < count; i++) {
			arrObj[i] = currentNode.element;
			currentNode = currentNode.next;
		}
		return arrObj;
	}

	/**
	 * 
	 * @return linked list length
	 */
	public int getLenght() {
		return count;
	}
	
	/**
	 * Sort the list
	 * @return sorted list
	 */
	public void sort(){
		Node currentNode = head;
		Node tempNode = currentNode;
		boolean flag = true;
		while (flag) { 
			flag = false;
			currentNode = head;
			while (currentNode.next != null) {
				if ((Integer)currentNode.element > (Integer)currentNode.next.element) {
					Object tempElem = currentNode.element;
					currentNode.element = currentNode.next.element;
					currentNode.next.element = tempElem;
					flag = true;
				}
				currentNode = currentNode.next;
			}
			
		}
	}

}
