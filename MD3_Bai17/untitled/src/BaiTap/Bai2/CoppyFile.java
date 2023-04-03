package BaiTap.Bai2;

import BaiTap.Bai1.Product;

import java.io.*;
import java.util.List;

public class CoppyFile {
    public static void main(String[] args)   {
        String sourcePath = "src/BaiTap/Bai2/source.txt";
        String targetPath = "src/BaiTap/Bai2/target.txt";
        try {
            coppyFile(sourcePath, targetPath);
            System.out.println("Copy done!");
        } catch (IOException e) {
            System.out.println("can't copy the file");
            System.out.println(e.getMessage());
        }
    }

    public static void coppyFile(String sourcePath, String targetPath) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is=new FileInputStream(sourcePath);
            os=new FileOutputStream(targetPath);
            byte [] buffer=new byte[1024];
            int lenght;
            while ((lenght=is.read(buffer))>0){
                os.write(buffer,0,lenght);
            }
        }finally {
            is.close();
            os.close();
        }
    }
}
