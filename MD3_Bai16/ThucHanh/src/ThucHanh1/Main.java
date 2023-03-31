package ThucHanh1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/ThucHanh1/thucHanh1.txt";
        createFile(filePath);
        readFileText(filePath);
    }

    static void createFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("5\n");
            fileWriter.write("3\n");
            fileWriter.write("6\n");
            fileWriter.write("1\n");
            fileWriter.write("8\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFileText(String filePath) {
        try{
            File file=new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while (( line=bufferedReader.readLine())!=null){
                System.out.println(line );
                sum+=Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tong : "+sum);
        }catch (Exception e){
            System.err.println("This File is not exist");
        }
    }
}
