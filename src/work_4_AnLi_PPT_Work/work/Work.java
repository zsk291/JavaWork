package work_4_AnLi_PPT_Work.work;

class Person {
    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", phone=" + phone + "]";
    }

    public void eat() {
        System.out.println("我喜欢吃!");
    }
}

class Student extends Person {
    //创建 Person 类的子类 Student
    private String id, grade, major, school;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student() {
    }

    public Student(String name, String phone, String id, String grade, String major, String school) {
        super(name, phone);
        this.id = id;
        this.grade = grade;
        this.major = major;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", grade=" + grade + ", " + "major=" + major + ", school=" + school + "]";
    }

    public void study() {
        System.out.println(getName() + "在学习!");
    }

    public void doHomework() {
        System.out.println(getName() + "在做作业!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "喜欢吃苹果!");
    }
}

class Teacher extends Person {
    //创建 Person 类的子类 Teacher
    private String title, teachCourse, school;
    private double salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeachCourse() {
        return teachCourse;
    }

    public void setTeachCourse(String teachCourse) {
        this.teachCourse = teachCourse;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    public Teacher(String name, String phone, String title,
                   String teachCourse, String school, double salary) {
        super(name, phone);
        this.title = title;
        this.teachCourse = teachCourse;
        this.school = school;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher[title=" + title + ",teachCourse=" + teachCourse +
                ",school=" + school + ",salary=" + salary + "]";
    }

    public void teach() {
        System.out.println(getName() + "老师在教授" + teachCourse + "课程");
    }

    public void correctExe() {
        System.out.println(getName() + "老师在批改学生作业!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "老师喜欢吃香蕉!");
    }
}

public class Work {//创建测试类 Work

    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三", "13015486452", "副教授",
                "Java", "长江大学", 10000);
        System.out.println(teacher);
        teacher.teach();
        teacher.correctExe();
        teacher.eat();
        Student student = new Student("李四", "13122222222", "21010101",
                "大一", "软件工程", "中南大学");
        System.out.println(student);
        student.study();
        student.doHomework();
        student.eat();
    }
}

