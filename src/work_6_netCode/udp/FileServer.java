package work_6_netCode.udp;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class FileServer {
    public static void main(String[] args) throws Exception{

        // 服务器端的端口
        DatagramSocket ss = new DatagramSocket(8090);
        byte bytes[] = new byte[1024];

        // 服务器端接收客户端发送过来的数据并保存到 "E:\BaiduNetdiskDownload\XMind\m.mp4"文件中
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\BaiduNetdiskDownload\\XMind\\mbt.mp4"));

        // 使用一个长度为bytes.length的字节数组存储从客户端发送过来的数据
        DatagramPacket data = new DatagramPacket(bytes,0,bytes.length);

        //接收客户端发送过来的数据
        do {
            Thread.sleep(1);
            ss.receive(data);
            bytes = data.getData();

            bos.write(bytes,0, data.getLength());
            bos.flush();
        }while (data.getLength()!="exit".length());

        bos.close();
        ss.close();
        System.out.println("------------结束-----------");
    }
}
