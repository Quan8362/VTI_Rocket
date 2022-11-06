package frontend;

import entity.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    /*  c) Tạo chương trình demo có tên là MyNews và tạo một menu lựa chọn gồm các mục sau:
            Insert news
            View list news
            Average rate
            Exit
   Nếu người dùng chọn 1 từ bàn phím thì tạo một object của class News và nhập giá trị cho các
   thuộc tính Title, PublishDate, Author, Content sau đó yêu cầu người dùng nhập vào 3 đánh giá để lưu vào Rates.
   Nếu người dùng chọn 2 từ bàn phím thì thực thi method Display().
   Nếu người dùng chọn 3 từ bàn phím thì thực hiện method Calculate() để tính đánh giá trung bình,
   sau đó thực thi method Display(). Trường hợp người dùng chọn 4 thì sẽ thoát khỏi chương trình.*/
    private Scanner sc;
    private ArrayList<News> listNews;

    public MyNews() {
        sc = new Scanner(System.in);
        listNews = new ArrayList<>();
    }

    public void menu() {
        while (true) {
            System.out.println("==============================================================");
            System.out.println("============ Lựa chọn chức năng bạn muốn sử dụng =============");
            System.out.println("===                 1. Insert news                         ===");
            System.out.println("===                 2. View list news                      ===");
            System.out.println("===                 3. Average rate                        ===");
            System.out.println("===                 4. Exit                                ===");
            System.out.println("==============================================================");
            int choose;
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    insertNews();
                    break;
                case 2:
                    showNews();
                    break;
                case 3:
                    averageRate();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Choose again!");
            }
        }
    }

    private void averageRate() {
        System.out.println("Đánh giá trung bình của tin tin:");
        for (News new1 : listNews) {
            System.out.println("Tiêu đề: " + new1.getTitle() + ", Đánh giá trung bình: " + new1.calculate());
        }
    }

    private void showNews() {
        for (News new1 : listNews) {
            new1.display();
        }
    }

    private void insertNews() {
        System.out.println("Mời bạn nhập vào tiêu đề: ");
        String title = sc.next();
        System.out.println("Mời bạn nhập ngày xuất bản: ");
        String publishDate = sc.next();
        System.out.println("Mời bạn nhập tác giả: ");
        String author = sc.next();
        System.out.println("Mời bạn nhập nội dung: ");
        String content = sc.next();
        System.out.println("Mời bạn nhập đánh giá 1: ");
        int rate1 = sc.nextInt();
        System.out.println("Mời bạn nhập đánh giá 2: ");
        int rate2 = sc.nextInt();
        System.out.println("Mời bạn nhập đánh giá 3: ");
        int rate3 = sc.nextInt();
        int[] rates = {rate1, rate2, rate3};
        News news = new News(title, publishDate, author, content, rates);
        listNews.add(news);
    }
}
