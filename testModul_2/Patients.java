package students.Vkakurin.testModul_2;

public class Patients implements Comparable<Patients> {
    private int numberQueue;
    private String name;
   // private String timeQue;

    public Patients(int numberQueue, String name) {
        this.numberQueue = numberQueue;
        this.name = name;
    }

    public int getNumberQueue() {
        return numberQueue;
    }

    public void setNumberQueue(int numberQueue) {
        this.numberQueue = numberQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "numberQueue=" + numberQueue +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Patients o) {
        return this.numberQueue-o.getNumberQueue();
    }
}
