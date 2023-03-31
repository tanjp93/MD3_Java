package BaiTap1;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String sourcePathFile = "src/BaiTap1/source.txt";
        String targetPathFile = "src/BaiTap1/target.txt";
        String[] listStd = {
                "Nguyen Van 1",
                "Nguyen Van 2",
                "Nguyen Van 3",
                "Nguyen Van 4",
                "Nguyen Van 5",
                "Nguyen Van 6",
                "Nguyen Van 7",
                "Nguyen Van 8",
                "Nguyen Van 9",
                "Nguyen Van 10",
        };
        writeFile(sourcePathFile, listStd);
        String[] coppiedArr = readFile(sourcePathFile);
        System.out.println(Arrays.toString(coppiedArr));
        writeFile(targetPathFile, coppiedArr);
    }

    static void writeFile(String filePath, String[] arr) {
        try {
            FileWriter file = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (int i = 0; i < arr.length; i++) {
                bufferedWriter.write(arr[i] + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("Find 's not found.\n Create a new file !");
        }
        ;
    }

    static String[] readFile(String filePath) {
        String[] arr = new String[10];
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                arr[i] = line;
                i++;
            }
            return arr;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}