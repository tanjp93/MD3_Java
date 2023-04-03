package ThucHanh.test3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("src/ThucHanh/test3/test3.txt"));
            outputStream.writeUTF("John");
            outputStream.writeDouble(85.5);
            outputStream.writeObject(new  java.util.Date());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
