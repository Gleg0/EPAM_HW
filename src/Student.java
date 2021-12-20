public final class Student {
    private final String name;
    private final int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
