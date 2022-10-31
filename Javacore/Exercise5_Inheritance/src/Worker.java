public class Worker extends Staff {
    private int rank;

    public Worker(String name, int age, Gender gender, String address, int rank) {
        super(name, age, gender, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString()+
                "rank=" + rank +
                '}';
    }
}
