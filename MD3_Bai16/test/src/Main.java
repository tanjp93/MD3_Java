import java.io.*;

public class Main {
    public static void main(String[] args) {
        String pathFile = "src/rikkei/academy/database/test.html";
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            fileWriter.write("Rikkei\n" + "Academy\r" + "Java11\n");
            fileWriter.write("<button>OK</button>");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("File khong ton tai !");
        }
        readFile(pathFile);
    }

    public static void readFile(String pathFile) {
        try {
            File file = new File(pathFile);
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                System.out.println("line : "+line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File khonh ton tai");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
    }
}