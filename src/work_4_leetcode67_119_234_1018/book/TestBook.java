package work_4_leetcode67_119_234_1018.book;

import java.util.Arrays;
import java.util.regex.Pattern;

class Book {//创建 Book 类
    private String bName, isbn, publisher;
    private String[] authors;
    private int price, page;

    public void noteTheBook(int page, String content) {
        if (page > 0 && page <= this.page) {
            System.out.println("第" + page + "页的笔记为:" + content);
        } else {
            System.out.println("只能在 1~" + this.page + "页记笔记!");
        }
    }

    public void turnToPage(int page) {
        if (page > 0 && page <= this.page) {
            System.out.println("已翻到" + page);
        } else {
            System.out.println("该书不存在此页码!");
        }
    }

    @Override
    public String toString() {
        return getBookMainInfo() + price + "\t" + page;
    }

    public void printMainInfo() {
        System.out.println(getBookMainInfo());
    }

    public String getBookMainInfo() {
        return bName + "\t" + isbn + "\t" + publisher + "\t" + Arrays.toString(authors) + "\t";
    }

    public Book(String bName, String isbn, String publisher, String[] authors,
                int price, int page) {
        this(bName, isbn, publisher, authors);
        setPrice(price);
        setPage(page);
    }

    public Book(String bName, String isbn, String publisher, String[] authors) {
        setbName(bName);
        setIsbn(isbn);
        setPublisher(publisher);
        this.authors = authors;
    }

    public Book() {
    }

    public Book(String bName, int price) {
        setbName(bName);
        setPrice(price);
    }

    public Book(String bName, int price, int page) {
        this(bName, price);
        setPage(page);
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        if (bName.length() >= 2) {
            this.bName = bName;
        } else {
            this.bName = null;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (Pattern.matches("978-7-\\d{3,5}-\\d{3,5}-\\d", isbn)) {
            this.isbn = isbn;
        } else {
            this.isbn = null;
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (Pattern.matches("[ \u4e00-\u9fa5]{2,}出版社", publisher)) {
            this.publisher = publisher;

        } else {
            this.publisher = null;
        }
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 1 && price <= 1000) {
            this.price = price;
        } else {
            this.price = -1;
        }
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page >= 3 && page <= 800) {
            this.page = page;
        } else {
            this.page = -1;
        }
    }
}


public class TestBook {//创建 Book 类测试文件 TestBook

    public static void main(String[] args) {
        Book java = new Book("Java 程序设计", "978-7-5487-4722-2",
                "中南大学出版社", new String[]{"张三", "李四"});
        java.setPrice(68);
        java.setPage(380);
        System.out.println(java);
        java.turnToPage(289);
        java.noteTheBook(289, "环境保护,从我做起");
    }

}