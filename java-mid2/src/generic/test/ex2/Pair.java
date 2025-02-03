package generic.test.ex2;

public class Pair<T, T1> {

    private T first;
    public T1 second;

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T1 second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T1 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
