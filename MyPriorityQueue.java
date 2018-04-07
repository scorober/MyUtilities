public class MyPriorityQueue<T extends Comparable> {
    @SuppressWarnings("unchecked")
    private T[] elements = (T[]) new Comparable[64];


    private int size;

    MyPriorityQueue() {
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    void insert(T item) {
        if (size == elements.length - 1) {
            resize();
        }
        size++;

        int i = percolateUp(size, item);
    }

    T deleteMin() throws ArrayIndexOutOfBoundsException{
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException();
        T returnValue = elements[1];
        int hole = percolateDown(1, elements[size]);
        size--;

        return returnValue;
    }

    private int percolateDown(int hole, T item) {
        int left, right, target;
        while (2 * hole <= size) {
            left = 2 * hole;
            right = left + 1;
            if (right > size || elements[left].compareTo(elements[right]) < 0) {
                target = left;
            } else {
                target = right;
            }
            if (elements[target].compareTo(item) < 0) {
                elements[hole] = elements[target];
                hole = target;
            } else {
                break;
            }
        }
        return hole;
    }

    private int percolateUp(int hole, T item) {
        while (hole > 1 && item.compareTo(elements[hole / 2]) < 0) {
            elements[hole] = elements[hole / 2];
            hole = hole / 2;
        }
        return hole;
    }

    private void resize() {

    }


}
