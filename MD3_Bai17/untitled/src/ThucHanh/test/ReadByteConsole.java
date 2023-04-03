package ThucHanh.test;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        String sourcePath="src/ThucHanh/test/CodeGym.txt";
        String destPath="src/ThucHanh/test/target.txt";
        File source=new File(sourcePath);
        File target=new File(destPath);
//        copyFileUsingStream(source,target);
        coppyFileUsingJava7Files(source,target);
    }
    static void coppyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(),StandardCopyOption.REPLACE_EXISTING);
    }
    static void copyFileUsingStream(File source, File dest){
        InputStream is =null;
        OutputStream os=null;

        try {
            is =new FileInputStream(source);
            os= new FileOutputStream(dest);
            byte[]buffer =new byte[1024];
            int length;
            while ((length=is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
