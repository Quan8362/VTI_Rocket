public class Engineer extends Staff {
    private String specialized;

    public Engineer(String name, int age, Gender gender, String address, String specialized) {
        super(name, age, gender, address);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public String toString() {
        return "Engineer{" +super.toString()+
                "specialized='" + specialized + '\'' +
                '}';
    }
}
