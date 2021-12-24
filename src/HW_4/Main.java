package HW_4;

import static HW_4.Method.method;

public class Main {
    public static void main(String[] args) {
        //Task 1
        MyArray<Integer> mas = new MyArray<>();

        mas.add(1);
        mas.add(1);
        mas.add(1);
        mas.add(2);
        mas.add(2);
        mas.add(3);
        mas.add(4);
        mas.add(4);
        mas.add(4);
        mas.add(4);
        //Task 2
        System.out.println(method(mas));
    }
}
