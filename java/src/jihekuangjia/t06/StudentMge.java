package jihekuangjia.t06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMge {
    //创建保存学生的容器
    Map<String,Student> map=new HashMap<String,Student>();

    //添加学生
    public void addStu(String stuNo,Student stu){
        try {
            map.put(stuNo,stu);
            System.out.println("添加成功");
            System.out.println("================");
        }catch (Exception ex){
            System.out.println("添加失败");
            ex.printStackTrace();
            System.out.println("================");
        }
    }
    //查询某个学生
    public void selectStu(String stuNo){
        boolean flag=map.keySet().contains(stuNo);
        if(flag){
            Student student = map.get(stuNo);
            System.out.println("学生姓名:"+student.getStuName()+",学生所在班级:"+student.getStuClass());
            System.out.println("================");
        }else {
            System.out.println("未查询到该学生信息");
            System.out.println("================");
        }
    }
    //查询所有学生
    public void selectStu(){
        Collection<Student> values = map.values();
        System.out.println("学号\t\t\t姓名\t\t班级");
        for(Student p:values){
            System.out.println(p.getStuNo()+"\t\t"+p.getStuName()+"\t\t"+p.getStuClass());
        }
        System.out.println("================");
    }

}
