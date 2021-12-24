package HW_2;

import java.util.Arrays;

public final class Student {
    private final String name;
    private final int age;
    private int[] marks;
    Student(String name, int age, int[] marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int[] getMarks() {
        return Arrays.copyOf(marks,marks.length);
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result += age;
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        if (age != that.age) return false;
        return name.equals(that.name);
    }
}
