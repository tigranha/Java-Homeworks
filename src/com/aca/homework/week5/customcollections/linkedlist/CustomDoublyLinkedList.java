package com.aca.homework.week5.customcollections.linkedlist;

public class CustomDoublyLinkedList<E> {
    private int size;
    private Node<E> firstNode;
    private Node<E> lastNode;


    public int size() {
        return this.size;
    }

    public void add(final E e) {
        validateElement(e);

        final Node<E> newNode = new Node<>(this.lastNode, null, e);

        if (this.lastNode == null) {
            this.firstNode = newNode;
        } else {
            final Node<E> copyOfLast = this.lastNode;
            copyOfLast.next = newNode;
        }
        this.lastNode = newNode;
        size++;
    }

    public void addAtBeginning(final E e) {
        validateElement(e);

        final Node<E> newNode = new Node<>(null, this.firstNode, e);

        if (this.firstNode == null) {
            this.lastNode = newNode;
        } else {
            final Node<E> copyOfFirst = this.firstNode;
            copyOfFirst.previous = newNode;
        }
        this.firstNode = newNode;
        size++;
    }

    public void add(final int index, final E e) {
        if (index <= 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        validateElement(e);

        if (index == size) {
            add(e);
        } else {
            Node<E> temp;
            if (index < this.size / 2) {
                temp = this.firstNode;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
            } else {
                temp = this.lastNode;
                for (int i = this.size - 1; i > index; i--) {
                    temp = temp.previous;
                }
            }

            final Node<E> newNode = new Node<>(temp.previous, temp, e);
            final Node<E> prev = temp.previous;
            prev.next = newNode;
            temp.previous = newNode;
            size++;

        }
    }

    public int indexOf(final E e) {

        if (this.size == 0) {
            return -1;
        }

        int index = 0;
        Node<E> temp = this.firstNode;

        if (e == null) {
            while (temp != null) {
                if (temp.element == null) {
                    return index;
                }
                index++;
                temp = temp.next;
            }
        } else {
            while (temp != null) {
                if (e.equals(temp.element)) {
                    return index;
                }
                index++;
                temp = temp.next;
            }
        }
        return -1;
    }

    public void remove(final E e) {
        Node<E> temp = this.firstNode;
        if (e == null) {
            while (temp != null) {
                if (temp.element == null) {
                    delete(temp);
                    return;
                }
                temp = temp.next;
            }
        } else {
            while (temp != null) {
                if (e.equals(temp.element)) {
                    delete(temp);
                    return;
                }
                temp = temp.next;
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        Node<E> temp = this.firstNode;
        sb.append("[");

        for (int i = 1; i < this.size; i++) {
            sb.append(temp.element.toString()).append(", ");
            temp = temp.next;
        }
        sb.append(this.lastNode.element.toString()).append("]");
        return sb.toString();
    }

    private static class Node<E> {
        Node<E> previous;
        Node<E> next;
        E element;

        public Node(Node<E> previous, Node<E> next, E element) {
            this.previous = previous;
            this.next = next;
            this.element = element;
        }
    }

    // helper methods

    private void delete(Node<E> target) {

        final Node<E> previous = target.previous;
        final Node<E> next = target.next;

        if (previous == null) {
            this.firstNode = next;
        } else {
            previous.next = next;
            target.previous = null;
        }

        if (next == null) {
            this.lastNode = previous;
        } else {
            next.previous = previous;
            target.next = null;
        }

        target.element = null;
        size--;

    }

    private void validateElement(final E e) {
        if (indexOf(e) >= 0) {
            throw new IllegalArgumentException("Cant have duplicate elements");
        }
    }

}
