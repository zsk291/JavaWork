package work_4_AnLi_PPT_Work.extendDemo1_AnLi;

class Student {
    String name;
    public void speak(){//定义一个说话的方法
        System.out.println("我是长江大学的学生");
    }
}
//定义一个软件系学生的继承学生类
class SoftStudent extends Student {
    //定义一个学习方法，可以获取父类属性
    public void learn(){
        System.out.println("我是"+name+",我正在学习Java");
    }
}

public class AnLi {
    public static void main(String[] args) {
        SoftStudent ss = new SoftStudent();//创建一个SoftStudent类对象
        ss.name = "张三";//为SoftwareStudent中的name属性赋值
        ss.speak();//调用从父类继承的speak()方法
        ss.learn();//调用自己的learn()方法
    }
}
