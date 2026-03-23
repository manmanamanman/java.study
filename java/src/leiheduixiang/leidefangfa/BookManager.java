package leiheduixiang.leidefangfa;

public class BookManager {
    //保存图书管理系统的功能

    //设置初始图书
    Book[] books = new Book[10]; //设置对象数组，保存图书内容

    public void initBook() {
        Book book1 = new Book();
        book1.bookname = "西游记";
        book1.bookauthor = "吴承恩";
        book1.price = 35;
        books[0] = book1;

        Book book2 = new Book();
        book2.bookname = "红楼梦";
        book2.bookauthor = "施耐庵";
        book2.price = 45;
        books[1] = book2;
    }

    //1、显示图书列表
    public void bookList() {
        System.out.println("这里是图书列表");
        System.out.println("书名\t\t\t\t作者\t\t\t\t价格");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].bookname + "\t\t\t" + books[i].bookauthor + "\t\t\t" + books[i].price);
            }
        }
    }

    //2、添加图书
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("添加成功！");
                break;
            }
        }
    }
}
