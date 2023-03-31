package ThucHanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/ThucHanh2/numbers.txt";
        String resulPath = "src/ThucHanh2/result.txt";
        List<Integer> numbers =readFile(filePath);
        int max=findMax(numbers);
        write(resulPath,max);

    }

    private static int findMax(List<Integer> numbers) {
        int max= numbers.get(0);
        for (int i = 0; i < numbers.size() ; i++) {
            if (max< numbers.get(i)){
                max= numbers.get(i);
            }
        }
//        System.out.println("Max of List is :"+max);
        return max;
    }

    public static List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        String line = "";
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File 's not found !");
        }
        System.out.println(numbers);
        return numbers;
    }
    public static void write(String filePath,int max){
        try {
            FileWriter fileWriter=new FileWriter(filePath);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Max of Array is " +max );
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Not found ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}