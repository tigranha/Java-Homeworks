package com.aca.homework.week5.customcollections.arraylist;

import java.util.Comparator;
import java.util.Stack;


@SuppressWarnings("unchecked")
public class CustomArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_CAPACITY = 1000;
    private Object[] data;
    private int size;

    public CustomArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(final int initialCapacity) {
        if (initialCapacity < 0 || initialCapacity > MAX_CAPACITY) {
            throw new IllegalArgumentException("Initial capacity cant be: " + initialCapacity);
        } else {
            this.data = new Object[initialCapacity];
        }
    }

    public int size() {
        return this.size;
    }

    public void addAtBeginning(final E e) {
        this.addAtIndex(0, e);
    }

    public void addAtIndex(final int index, final E e) {
        checkIndexRange(index);
        increaseCapacityIfNeeded();

        for (int i = size - 1; i >= index; i--) {
            this.data[i + 1] = this.data[i];
        }
        this.data[index] = e;
        this.size++;
    }

    public void add(final E e) {
        this.addAtIndex(size, e);
    }

    public boolean contains(final E target) {
        if (target == null) {
            for (Object elem : this.data) {
                if (elem == null) {
                    return true;
                }
            }
        } else {
            for (Object elem : this.data) {
                if (target.equals(elem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean remove(final E target) {
        if (target == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.data[i] == null) {
                    remove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (target.equals(this.data[i])) {
                    remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public E remove(final int index) {
        checkIndexRange(index);

        final E returnValue = (E) data[index];

        for (int i = index; i < this.size; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[size--] = null;
        return returnValue;
    }

    public int findIndexByValue(final E target) {
        if (target == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.data[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (target.equals(this.data[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public E findValueByIndex(final int index) {
        checkIndexRange(index);
        return (E) this.data[index];
    }

    public CustomArrayList<E> copy() {
        CustomArrayList<E> copy = new CustomArrayList<>(this.data.length);
        copy.size = this.size;

        copyData(this.data, copy.data);

        return copy;
    }

    public void sortBubble(final Comparator<? super E> comparator) {
        if (this.size > 1) {
            E temp;

            for (int i = 0; i < this.size; i++) {
                for (int j = 1; j < this.size - i; j++) {
                    int compare = comparator.compare((E) this.data[j - 1], (E) this.data[j]);

                    if (compare > 0) {
                        temp = (E) this.data[j];
                        this.data[j] = this.data[j - 1];
                        this.data[j - 1] = temp;
                    }
                }
            }
        }
    }

    public void sortQuick(final Comparator<? super E> comparator) {
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int end = this.size - 1;

        stack.push(start);
        stack.push(end);

        while (!stack.isEmpty()) {
            end = stack.pop();
            start = stack.pop();

            int pivotIndex = partition((E[]) this.data, start, end, comparator);

            if (pivotIndex - 1 > start) {

                stack.push(start);
                stack.push(pivotIndex - 1);
            }

            if (pivotIndex + 1 < end) {
                stack.push(pivotIndex + 1);
                stack.push(end);
            }
        }
    }

    public String compareBubbleAndQuickSortTimes(final CustomArrayList<E> list, final Comparator<? super E> comparator) {

        long timeElapsedBubble;
        long timeElapsedQuick;
        long differance;
        StringBuilder sb = new StringBuilder();

        CustomArrayList<E> copy1 = list.copy();
        CustomArrayList<E> copy2 = list.copy();

        timeElapsedBubble = measureBubbleTime(copy1, comparator);
        timeElapsedQuick = measureQuickTime(copy2, comparator);
        differance = timeElapsedBubble > timeElapsedQuick ?
                timeElapsedBubble - timeElapsedQuick :
                timeElapsedQuick - timeElapsedBubble;

        sb.append("Bubble Sort finished in ")
                .append(timeElapsedBubble)
                .append(" nanoseconds\n")
                .append("Quick Sort finished in ")
                .append(timeElapsedQuick)
                .append(" nanoseconds\n")
                .append("Differance is ")
                .append(differance)
                .append(" nanoseconds");

        return sb.toString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.size - 1; i++) {
            sb.append(this.data[i].toString()).append(", ");
        }
        sb.append(this.data[this.size - 1].toString()).append(" ]");
        return sb.toString();
    }

    // Helper methods

    private void increaseCapacityIfNeeded() {
        if (this.size == MAX_CAPACITY) {
            throw new IllegalArgumentException("Reached max size");
        }
        if (this.size == this.data.length) {
            final int newCapacity = Math.min(this.size * 2, MAX_CAPACITY);

            final Object[] increasedCapData = new Object[newCapacity];

            this.data = copyData(this.data, increasedCapData);
        }
    }

    private Object[] copyData(final Object[] from, final Object[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
        return to;
    }

    private void checkIndexRange(final int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("Wrong index: " + index);
        }
    }

    private int partition(final E[] arr, final int start, final int end, final Comparator<? super E> comparator) {

        int index = start;
        final E pivot = arr[end];

        for (int i = start; i < end; i++) {
            int compare = comparator.compare(pivot, arr[i]);

            if (compare >= 0) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, index, end);

        return index;
    }

    private void swap(E[] data, int index, int i) {
        E temp = data[i];
        data[i] = data[index];
        data[index] = temp;
    }

    private long measureBubbleTime(final CustomArrayList<E> list, final Comparator<? super E> comparator) {
        final long startTime = System.nanoTime();
        list.sortBubble(comparator);
        return System.nanoTime() - startTime;
    }

    private long measureQuickTime(final CustomArrayList<E> list, final Comparator<? super E> comparator) {
        final long startTime = System.nanoTime();
        list.sortQuick(comparator);
        return System.nanoTime() - startTime;
    }
}
