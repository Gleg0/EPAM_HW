package HW_4;

public interface MyArrayInterface<E> extends Iterable<E> {
    boolean add(E e);
    E get(int index);
    int size();
    void update(int index, E e);
}
