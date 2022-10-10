package work_4_3_Abstract_functionDemo.exception;

public class MyException extends Exception{
    //默认抛出信息
    public MyException() {
        super("a，b关系不满足a<b");
    }
    public MyException(String str) {
        super(str);
    }
}
