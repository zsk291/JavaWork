package work_4_3_Abstract_functionDemo;

import work_4_3_Abstract_functionDemo.exception.MyException;

import java.util.Scanner;

public abstract class AbsCal {

    /**
     * 求某个函数的[a，b]区间的定积分
     *
     * @param a
     * @param b
     * @return
     */
    public double call(double a, double b,int n) {
        //求法就是求function区域下的a，b区间的面积
        double sum = 0;//面积总和
//        //把区间切成n份
//        int n = 100000;
        //计算切片面积
        double deltaX = (double) (b - a) / n;
        for (int i = 0; i < n; i++) {
            sum = sum + deltaX * (function(a + i * deltaX));
        }
        return sum;
    }

    /**
     * 被积函数
     *
     * @param x
     * @return
     */
    public abstract double function(double x);
}

class AbsCalTest {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;
        int n = 0;
        System.out.println("请输入被积函数左端");
        a = scanner.nextDouble();
        System.out.println("请输入被积函数右端");
        b = scanner.nextDouble();
        System.out.println("请输入要切成多少份");
        n = scanner.nextInt();

        //a,b大小关系判断的异常
        if (a>b) throw new MyException();

        if (n<=0){
            throw new MyException("输入的切片数不可为非正数");
        }

        try {
            if(n<10){ throw new MyException("输入的切片数较小"); }
        } catch (MyException e) {
            e.printStackTrace();
        }
        //匿名内部类重写抽象方法
        //被积函数1
        AbsCal absCal = new AbsCal() {
            @Override
            public double function(double x) {
                return x * x + 2 * x;
            }
        };
        double result = absCal.call(a, b,n);
        System.out.println("函数x*x+2*x在[" + a + "," + b + "]区间的积分面积为" + result);

        //被积函数2
        AbsCal absCal2 = new AbsCal() {
            @Override
            public double function(double x) {
                return x * x * x + 3 * x;
            }
        };
        double result2 = absCal2.call(a, b,n);
        System.out.println("函数x*x*x+3*x在[" + a + "," + b + "]区间的积分面积为" + result2);

        //被积函数3
        AbsCal absCal3 = new AbsCal() {
            @Override
            public double function(double x) {
                return x * x * x + 5 * x * x;
            }
        };
        double result3 = absCal3.call(a, b,n);
        System.out.println("函数x*x*x+5*x*x在[" + a + "," + b + "]区间的积分面积为" + result3);
    }
}
