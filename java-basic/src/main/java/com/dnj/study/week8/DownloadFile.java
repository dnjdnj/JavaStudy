package com.dnj.study.week8;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName DownLoadFile
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/30
 **/
public class DownloadFile {

    public static void main(String[] args) {
        try{
            download("https://exp-picture.cdn.bcebos.com/f7e6410f822b74ee828267aeda2c8cf1d9a74a0a.jpg?x-bce-process=image%2Fresize%2Cm_lfit%2Cw_500%2Climit_1","downloadFile.jpg","C:\\Users\\dnj\\Desktop");
        }catch (IOException e){
            System.err.println("文件下载出现异常");
        }
    }

    /**
     * 将网络文件下载到本地
     *
     * @param urlString 文件到url路径
     * @param fileName 保存的文件名
     * @param savePath 保存路径
     * @throws IOException
     */
    public static void download(String urlString,String fileName,String savePath)throws IOException{
        //构造url
        URL url = new URL(urlString);
        //打开连接
        URLConnection conn = url.openConnection();
        //设置请求超时
        conn.setConnectTimeout(5000);
        //构建输入流
        InputStream is = conn.getInputStream();
        //定义数据缓冲
        byte[] bytes = new byte[1024];
        //读取数据长度
        int len;
        //创建文件对象
        File file = new File(savePath);
        if(!file.exists()){
            file.mkdir();
        }
        //构建输出文件流
        OutputStream os = new FileOutputStream(file.getPath() + File.separator + fileName);
        //开始读取，每次读取缓冲区大小的字节数
        while((len = is.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        //关闭连接
        os.close();
        is.close();
    }
}
