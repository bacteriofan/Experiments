package collections;

public class Cat implements Comparable<Cat>{

    public String name;
    public int age;

    public Cat(int age) {

    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }
}
