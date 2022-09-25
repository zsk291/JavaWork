package work_4_AnLi_PPT_Work.extendDemo2_PPT;

class human{

    String idCard;
    String name;
    char sex;
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void walk(){
        System.out.println("人可以走路");
    }
}

class Student extends human{
    String idCard;
    String stuClass;
    double score;
    public void attendClass(){
        System.out.println("学生要上课");
    }
    public void attendTest(){
        System.out.println("学生要考试");
    }
}
class Teacher extends human{
    String staffId;
    String workName;
    double salaryId;
    public void teach(){
        System.out.println("老师要讲课");
    }
    public void batch(){
        System.out.println("老师要批卷");
    }
}
class Police extends human{
    String policeId;
    String depart;
    double rank;
    public void onDuty(){
        System.out.println("警察要执勤");
    }
    public void train(){
        System.out.println("警察要训练");
    }
}

public class PPT {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        student.sleep();
        student.walk();
        student.attendClass();
        student.attendTest();
        System.out.println("-----------------------------------");
        Teacher teacher = new Teacher();
        teacher.eat();
        teacher.sleep();
        teacher.walk();
        teacher.teach();
        teacher.batch();
        System.out.println("-----------------------------------");
        Police police = new Police();
        police.eat();
        police.sleep();
        police.walk();
        police.onDuty();
        police.train();
    }
}