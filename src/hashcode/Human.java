package hashcode;

import java.util.Objects;

public class Human {

    String name;
    String national;
    int age;

    public Human(String name, String national, int age) {
        this.name = name;
        this.national = national;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(name, human.name) &&
                Objects.equals(national, human.national);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, national, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
