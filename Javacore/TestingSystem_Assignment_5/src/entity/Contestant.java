package entity;

public class Contestant {
    private static int count = 0;
    private int idNumber;
    private String name;
    private String address;
    private int priority;
    private Block block;

    public Contestant(String name, String address, int priority, Block block) {
        count++;
        this.idNumber = count;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.block = block;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "idNumber= " + idNumber +
                ", name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", priority = " + priority +
                ", block= " + block +
                '}';
    }
}
