package com.datastructures.LinkedList;

public class LinkedList {

	private Node tial;
	private Node head;
	private int size = 0;

	public LinkedList() {

	}

	public void addFirst(int element) {
		Node temp = new Node();

		temp.setData(element);
		temp.setNext(head);
		setHead(temp);
		size++;
	}

	public void add(int element) {
		if (head == null) {
			Node temp = new Node();
			temp.setData(element);
			setHead(temp);
			setTial(temp);
			size++;
		} else {
			Node temp = new Node();
			temp.setData(element);
			tial.setNext(temp);
			setTial(temp);
			size++;
		}
	}

	public void addEnd(int element) {

		Node temp = new Node();
		temp.setData(element);
		tial.setNext(temp);
		setTial(temp);
		size++;

	}

	public void add(int index, int data) {

		Node temp = new Node();
		if (index == 1) {
			temp.setData(data);
			Node after = inexOf(index);
			temp.setNext(after);
			setHead(temp);
			size++;

		} else {

			temp.setData(data);
			Node befure = inexOf(index - 1);
			Node after = inexOf(index);
			temp.setNext(after);
			befure.setNext(temp);
			size++;
		}
	}

	public Node find(int element) {
		Node temp = this.head;
		while (temp != null) {
			if (element == temp.getData()) {

				return temp;

			} else {
				temp = temp.getNext();
			}
		}

		return null;
	}

	public boolean remove(int element) {
		Node temp = this.head;
		Node r = find(element);
		while (temp != null) {

			if (temp.getNext() != r) {
				if (temp == r) {

					setHead(temp.getNext());
					size--;
					return true;
				}
				temp = temp.getNext();

			} else {
				temp.setNext(temp.getNext().getNext());
				size--;
				return true;
			}

		}

		return false;
	}

	public void edit(int oldElement, int newElement) {
		Node temp = find(oldElement);
		if (temp != null) {
			temp.setData(newElement);
		}

	}

	public Node inexOf(int index) {
		Node temp = this.head;
		for (int i = 1; i <= index; i++) {
			find(temp.getData());
			if (i < index)
				temp = temp.getNext();
			if (i == index) {
				return temp;
			}
		}

		return null;
	}

	public int elementOf(int element) {
		Node temp = head;

		for (int i = 1; i <= size; i++) {

			if (temp.getData() == element) {
				return i;
			}
			temp = temp.getNext();
		}

		return -1;
	}

	public int size() {
		return size;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData() + "   ");
			temp = temp.getNext();
		}
	}

	public void clear() {
		head = null;
		size = 0;
	}

	public Node getTial() {
		return tial;
	}

	public void setTial(Node tial) {
		this.tial = tial;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
