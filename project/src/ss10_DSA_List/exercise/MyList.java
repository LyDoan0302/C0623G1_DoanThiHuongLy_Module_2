package ss10_DSA_List.exercise;

import java.util.Arrays;
import java.util.Objects;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        elements = new Object[capacity];
    }

    public void add(int index, Object element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        if(index == size()) {
            ensureCapacity();
        }else{

            for (int i = elements.length-1; i > index ; i--) {
                this.elements[i] = this.elements[i-1];
            }
            this.elements[index] = element;
            //size++;
        }
    }

    public void ensureCapacity() {
        float newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, (int) newSize);
    }

    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size()-1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        cropCapacity();

        return (E) this.elements[index];
    }
    public void cropCapacity() {
        elements = Arrays.copyOf(elements, size() - 1);
    }

    public int size() {
        return elements.length;
    }

    public E clone(E newElements) {
        return newElements = (E) elements;
    }

    public boolean contains(E o) {
        return Objects.equals(o, elements);
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (Objects.equals(o, elements)) {
                return i;
            }
        }
        return -1;
    }
    public void setElements(int index, Object element) {
     this.elements[index] = element;
    }

    public E getElements() {
        return (E) this.elements;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + this.size() +
                ", elements=" + Arrays.toString(this.elements) +
                '}';
    }
}
