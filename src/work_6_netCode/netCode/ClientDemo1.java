package work_6_netCode.netCode;

import netCode.ClientReaderThread;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * 通过TCP实现消息通信-----客户端
 */
public class ClientDemo1 {
    // 2人实现消息通信
    public static void main(String[] args) throws Exception {

            System.out.println("====客户端启动===");
            //对方的ip地址，和端口号
            Socket socket = new Socket(InetAddress.getByName("192.168.0.190"), 6868);

            // 1.为客户端分配一个独立的线程负责读取它收到的消息
            new ClientReaderThread(socket).start();

            // 2、从socket通信管道中得到一个字节输出流 负责发送数据
            OutputStream os = socket.getOutputStream();

            // 3、把低级的字节流包装成打印流
            PrintStream ps = new PrintStream(os);

            Scanner sc =  new Scanner(System.in);
            while (true) {
                System.out.println("请输入：");
                String msg = sc.nextLine();
                // 4、发送消息
                ps.println(msg);
                ps.flush();
            }



    }
}
