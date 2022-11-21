package work_6_netCode.tcp;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * tcp客户端。实现信息发送
 */
public class tcpClient {
    public static void main(String[] args) throws Exception{
        System.out.println("==客户端启动==");
        //注册端口,获得通信管道
        Socket socket=new Socket("192.168.0.190",7777);
        //获得输出流
        OutputStream outputStream=socket.getOutputStream();
        //包装输出流
        PrintStream ps=new PrintStream(outputStream);

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("请输入：");
            String str=sc.nextLine();
            //发送数据
            ps.println(str);
            ps.close();
        }

    };
}
