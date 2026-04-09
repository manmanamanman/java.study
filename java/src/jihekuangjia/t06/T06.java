package jihekuangjia.t06;

import java.util.Scanner;

public class T06 {
    static void menu(){
        System.out.println("欢迎使用学生管理系统");
        System.out.println("1、添加学生信息");
        System.out.println("2、查询学生信息");
        System.out.println("3、查询所有学生信息");
        System.out.println("0、退出");
        System.out.print("请输入你需要办理的业务:");
    }
    public static void main(String[] args) {
        StudentMge mge=new StudentMge();
        Scanner input=new Scanner(System.in);

        boolean flag=true;
        while (flag){
            menu();
            int num=input.nextInt();
            switch (num){
                case 0:
                    System.out.println("感谢您的使用");
                    flag=false;
                    break;
                case 1:
                    System.out.print("请输入学生学号:");
                    String stuNo1=input.next();
                    System.out.print("请输入学生姓名:");
                    String stuName=input.next();
                    System.out.print("请输入学生班级:");
                    String stuClass=input.next();
                    Student stu=new Student(stuNo1,stuName,stuClass);
                    mge.addStu(stuNo1,stu);
                    break;
                case 2:
                    System.out.print("请输入学生学号:");
                    String stuNo2=input.next();
                    mge.selectStu(stuNo2);
                    break;
                case 3:
                    mge.selectStu();
                    break;
                default:
                    System.out.println("该选项不在所给范围中，请重新选择");
                    break;
            }
        }
    }
}
