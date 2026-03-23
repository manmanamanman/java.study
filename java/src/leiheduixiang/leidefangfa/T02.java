package leiheduixiang.leidefangfa;

import java.util.Scanner;

public class T02 {
    public static void menu() {
        System.out.println("欢迎来到图书管理系统！");
        System.out.println("1、图书列表");
        System.out.println("2、添加图书");
        System.out.println("3、退出");
        System.out.println("请选择您需要办理的事务：");
    }

    public static void main(String[] args) {
        //图书管理系统主程序入口
        Scanner input = new Scanner(System.in);
        BookManager bookmanager = new BookManager();
        bookmanager.initBook(); //加载图书
        Book book = new Book();
        int num;
        while (true) {
            //进入系统界面
            menu();
            //接收用户
            num = input.nextInt();

            if (num == 1) {
                bookmanager.bookList();
                System.out.println("=====================");
            } else if (num == 2) {
                System.out.println("请输入图书名称：");
                book.bookname = input.next();
                System.out.println("请输入图书作者：");
                book.bookauthor = input.next();
                System.out.println("请输入图书价格：");
                book.price = input.nextInt();
                bookmanager.addBook(book);
                System.out.println("=====================");
            } else if (num == 3) {
                System.out.println("感谢您的使用！");
                break;
            } else {
                System.out.println("您输入的数字不对，请重新输入！");
                System.out.println("=====================");
            }
        }
    }
}