package entity;

import java.lang.reflect.Array;

public class News implements INews {

    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averaRate;
    private int[] rate;

    private static int count = 0;

    public News(String title, String publishDate, String author, String content, int[] rate) {
        count++;
        this.id = count;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averaRate = averaRate;
        this.rate = rate;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAveraRate() {
        return averaRate;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averaRate=" + averaRate +
                '}';
    }

    /* Implement các method trong interface INews như sau:
    a) Method Display() sẽ in ra Title, PublishDate, Author, Content và AverageRate của tin tức ra console.
    b) Method có tên Calculate() để thiết đặt thuộc tính Khai báo một array có tên Rates kiểu int
    gồm 3 phần tử AverageRate là trung bình cộng của 3 phần tử của array Rates.*/
    @Override
    public void display() {
        System.out.println("New(" + "Title: " + title + ", Publish: " + publishDate + ", Author: " + author +
                ", Content: " + content + ", AverageRate: " + averaRate + ")");
    }

    @Override
    public float calculate() {
        averaRate = ((rate[0] + rate[1] + rate[2]) / 3);
        return averaRate;
    }
}
