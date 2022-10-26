import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise3 {
    static void question1() {
/*      Question 1:
        In ra thông tin Exam thứ 1 và property create date sẽ được format theo định dạng vietnamese*/
        Exam exam = new Exam();
        Exam ex1 = exam.exam1();
        LocalDateTime localDateTime = ex1.createDate.atStartOfDay();
        String newstring = localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Ngay tao : " + newstring);

    }

    static void question2() {
/*      Question 2:
        In ra thông tin: Exam đã tạo ngày nào theo định dạng Năm – tháng – ngày – giờ – phút – giây*/
        String pattern = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Exam exam = new Exam();
        Exam[] exams = {exam.exam1(), exam.exam2()};
        for (Exam ex : exams) {
            String date = simpleDateFormat.format(exam.createDate);
            System.out.println(date);

        }
    }
    public static void main(String[] args) {

        question1();
//        question2();
    }
}
