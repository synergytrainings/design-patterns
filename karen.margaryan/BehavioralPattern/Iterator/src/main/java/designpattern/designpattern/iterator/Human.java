package designpattern.designpattern.iterator;

/**
 * Created by Karen on 3/13/2015.
 */
public class Human {
    private String name;
    private Sex sex;

    public Human(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Human human = (Human) obj;

        if ((name == null && human.name != null) || (name != null && human.name == null)) {
            return false;
        }

        return name.equals(human.name) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
