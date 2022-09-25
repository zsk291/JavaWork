package work_4_leetcode67_119_234_1018.extendDemo2;

class Student {
    String name;
    public void speak(){//定义一个说话的方法
        System.out.println("我是长江大学的学生");
    }
}
//学生子类软件工程学生
class SoftStudent extends Student {
    public void learn(){
        System.out.println("我是软件工程系的"+name+",我正在学习Java");
    }
}
//学生子类计算机技术系学生
class ComStudent extends Student {
    public void learn(){
        System.out.println("我是计算机技术系的"+name+",我正在学习Java");
    }
}
//软件工程系学生子类软件技术专业学生
class SoftTecStudent extends SoftStudent {
    public void writeCode(){
        System.out.println("我是软件技术专业的"+name+",我正在写代码");
    }
}
//软件工程系学生子类软件应用专业学生
class SoftAppStudent extends SoftStudent {
    public void writeCode(){
        System.out.println("我是软件应用专业的"+name+",我正在写代码");
    }
}
//计算机技术系学生子类计算机控制专业学生
class ComControlStudent extends ComStudent {
    public void writeCode(){
        System.out.println("我是计算机控制专业的"+name+",我正在写代码");
    }
}
//计算机技术系学生子类网络专业学生
class NetStudent extends ComStudent {
    public void writeCode(){
        System.out.println("我是网络专业的"+name+",我正在写代码");
    }
}

public class TestExtends2 {
    public static void main(String[] args) {
        //软件技术专业学生
        SoftTecStudent softTecStudent = new SoftTecStudent();
        softTecStudent.speak();
        softTecStudent.learn();
        softTecStudent.writeCode();
        //软件应用专业学生
        SoftAppStudent softAppStudent = new SoftAppStudent();
        softAppStudent.speak();
        softAppStudent.learn();
        softAppStudent.writeCode();
        //计算机控制专业学生
        ComControlStudent comControlStudent = new ComControlStudent();
        comControlStudent.speak();
        comControlStudent.learn();
        comControlStudent.writeCode();
        //网络专业学生
        NetStudent netStudent = new NetStudent();
        netStudent.speak();
        netStudent.learn();
        netStudent.writeCode();
    }
}