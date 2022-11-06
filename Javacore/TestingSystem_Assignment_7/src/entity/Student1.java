package entity;

public class Student1 {

    private final int id = 1;
    private String name;

    public Student1(String name) {
        this.name = name;
    }

    public final void study() {
        System.out.println("Đang học bài...");
    }
    // abc@gmail.com
    // 3 method rieng nhuwng cung 1 thong bao

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
