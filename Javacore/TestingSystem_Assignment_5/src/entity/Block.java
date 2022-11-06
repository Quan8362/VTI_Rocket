package entity;

public class Block {
    private String name;
    private String subject;

    public Block(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        switch (this.name){
            case "A":
                this.subject = "Toán, Lý, Hoá";
                break;
            case "B":
                this.subject = "Toán, Hoá, Sinh";
                break;
            case "C":
                this.subject = "Văn, Sử, Địa";
                break;
        }
        return this.subject;
    }

    @Override
    public String toString() {
        return  name + ", subject = " + getSubject();
    }
}
