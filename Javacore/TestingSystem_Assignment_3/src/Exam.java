import java.time.LocalDate;

public class Exam {

    public int id;

    public String code;

    public String title;

    public CategoryQuestion[] category;

    public int duration;

    public Account creator;

    public LocalDate createDate;

    public Question[] question;

    public Exam exam1() {
        Exam exam = new Exam();
        exam.id = 1;
        exam.code = "VTI01";
        exam.title = "Java";
        exam.duration = 60;
        Account account = new Account();
        exam.creator = account.account1();
//        exam.createDate = LocalDate.parse("2022-10-20");
        exam.createDate = LocalDate.now();
        return exam;
    }
    public Exam exam2() {
        Exam exam = new Exam();
        exam.id = 2;
        exam.code = "VTI02";
        exam.title = "Python";
        exam.duration = 45;
        Account account = new Account();
        exam.creator = account.account2();
//        exam.createDate = LocalDate.parse("2022-02-25");
        exam.createDate = LocalDate.now();
        return exam;
    }
}
