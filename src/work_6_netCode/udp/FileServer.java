package work_6_netCode.udp;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class FileServer {
    public static void main(String[] args) throws Exception{

        // �������˵Ķ˿�
        DatagramSocket ss = new DatagramSocket(8090);
        byte bytes[] = new byte[1024];

        // �������˽��տͻ��˷��͹��������ݲ����浽 "E:\BaiduNetdiskDownload\XMind\m.mp4"�ļ���
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\BaiduNetdiskDownload\\XMind\\mbt.mp4"));

        // ʹ��һ������Ϊbytes.length���ֽ�����洢�ӿͻ��˷��͹���������
        DatagramPacket data = new DatagramPacket(bytes,0,bytes.length);

        //���տͻ��˷��͹���������
        do {
            Thread.sleep(1);
            ss.receive(data);
            bytes = data.getData();

            bos.write(bytes,0, data.getLength());
            bos.flush();
        }while (data.getLength()!="exit".length());

        bos.close();
        ss.close();
        System.out.println("------------����-----------");
    }
}
