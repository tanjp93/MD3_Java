package ThucHanh.test2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTest2 {
        static List<String> listText = new ArrayList<>();
        public static void main(String[] args) {
            //Doc du lieu tu file Demo_SourceFile.txt
            readTextFromFile("src/ThucHanh/test2/Demo_TargetFile.txt");
            //Ghi du lieu ra file Demo_TargetFile.txt
            writeTextToFile("src/ThucHanh/test2/Output_Demo_TargetFile.txt");
        }
        public static void readTextFromFile(String path) {
            File file = null;
            FileInputStream fis = null;
            InputStreamReader isr = null;
            BufferedReader br = null;
            try {
                //1. Khoi  tao doi tuong File
                file = new File(path);
                //2. Khoi tao cac doi tuong InputStream
                fis = new FileInputStream(file);
                isr = new InputStreamReader(fis);
                br = new BufferedReader(isr);
                //3. Doc du lieu tu file
                String line = br.readLine();
                while (line != null) {
                    listText.add(line);
                    line = br.readLine();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                    if (isr != null) {
                        isr.close();
                    }
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static void writeTextToFile(String path) {
            File file = null;
            FileOutputStream fos = null;
            OutputStreamWriter osw = null;
            BufferedWriter bw = null;
            try {
                //1. Khoi tao doi tuong file
                file = new File(path);
                System.out.println(file.getAbsolutePath());
                //2. Khoi tao cac doi tuong outputStream
                fos = new FileOutputStream(file,true);
                osw = new OutputStreamWriter(fos);
                bw = new BufferedWriter(osw);
                //3. Ghi du lieu text ra file
                for (String line : listText) {
                    bw.write(line);
                    //Khoi tao dong moi de ghi
                    bw.newLine();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                //4. Dong ket noi
                try {
                    if (bw!=null){
                        bw.close();
                    }
                    if (osw!=null){
                        osw.close();
                    }
                    if (fos!=null){
                        fos.close();
                    }
                }catch (IOException ex2){
                    ex2.printStackTrace();
                }
            }
        }
}
