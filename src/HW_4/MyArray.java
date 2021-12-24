package HW_4;

import java.util.Iterator;

public class MyArray<E> implements MyArrayInterface<E> {

    private E[] values;

    public MyArray(){
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try{
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp,0,values,0,temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException exp){
            exp.printStackTrace();
        }
        return false;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(values);
    }
}
