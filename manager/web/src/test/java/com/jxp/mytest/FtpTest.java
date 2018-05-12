package com.jxp.mytest;

import org.apache.commons.net.ftp.FTPClient;
import sun.net.ftp.FtpClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/22
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class FtpTest {
    public static void main(String[] args) throws IOException {
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("192.168.88.181", 21);
        ftpClient.login("ftpuser", "root");
        // String remote 服务端文件名, InputStream local 文件流
        InputStream inputStream=new FileInputStream("d:\\1.png");
        ftpClient.changeWorkingDirectory("/5");
        ftpClient.storeFile("5.png",inputStream);
        ftpClient.logout();
    }
}
