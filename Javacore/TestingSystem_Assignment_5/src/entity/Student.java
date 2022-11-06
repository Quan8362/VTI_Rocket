package entity;

public class Student implements  IStudent{
    private int id;
    private String name;
    private int group;

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public void checkin() {
        System.out.println(getName() + " Điểm danh");
    }

    @Override
    public void study() {
        System.out.println(getName() + " Đang học bài");
    }

    @Override
    public void clean() {
        System.out.println(getName() + " Đang dọn vệ sinh");
    }
}
