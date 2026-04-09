package jihekuangjia.t06;

public class Student {
    private String stuNo;
    private String stuName;
    private String stuClass;

    public Student(){

    }
    public Student(String stuNo,String stuName,String stuClass){
        this.stuNo=stuNo;
        this.stuName=stuName;
        this.stuClass=stuClass;
    }
    public void setStuNo(String stuNo){
        this.stuNo=stuNo;
    }
    public String getStuNo(){
        return this.stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }
}
