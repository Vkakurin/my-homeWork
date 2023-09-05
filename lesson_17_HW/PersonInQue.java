package students.Vkakurin.lesson_17_HW;

public class PersonInQue implements Comparable<PersonInQue>  {
    private String name;
    private int priority;

    public PersonInQue(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "PersonInQue{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(PersonInQue o) {
        return o.getPriority()-this.priority;
    }
}
