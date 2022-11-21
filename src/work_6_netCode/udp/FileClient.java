package work_6_netCode.udp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 文件传输UDP----客户端
 */
public class FileClient {
    public static void main(String[] args) throws Exception{
        //建立客户端
        DatagramSocket datagramSocket=new DatagramSocket(8008);
        //获取缓冲输入流
        FileInputStream inputStream= new FileInputStream("D:\\Javaweb资料\\day01-MySQL基础\\00-JavaWeb整体介绍.mp4");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);

        //每次传输1024个字节
        byte[] buffers=new byte[1024];
        //读取视频
        int len=0;
        while((len=bufferedInputStream.read(buffers))!=-1){
            DatagramPacket data=new DatagramPacket(buffers,0,buffers.length, InetAddress.getByName("192.168.0.190"),8080);
             datagramSocket.send(data);
        }

        //向服务端发送退出指令
        //字节数组空出后，存入退出指令
        buffers="exit".getBytes();
        datagramSocket.send(new DatagramPacket(buffers,0,buffers.length,InetAddress.getByName("192.168.0.190"),8080));
        System.out.println("传输成功！");


    }
}
