public class MyPriorityQueue<T extends Comparable> {

    private T[] elements = (T[]) new Object[64];

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

    void deleteMin() {}

    private int percolateUp(int hole, T item) {



    }

    private void resize() {

    }


}
