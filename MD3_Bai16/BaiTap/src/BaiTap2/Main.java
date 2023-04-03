package BaiTap2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String infoPath="src/BaiTap2/inforBase.csv";
        String outputCountry="src/BaiTap2/country.csv";
        List<String> importList=callFile(infoPath);
        List<Country> list=new ArrayList<>();
        for (int i = 0; i < importList.size(); i++) {
            String []tempArrs=importList.get(i).replaceAll("\"","").split(",");
            int countryId=Integer.parseInt(tempArrs[0]);
            String countryCode=tempArrs[1];
            String countryName=tempArrs[2];
            Country country=new Country(countryId,countryCode,countryName);
            list.add(country);
        }
        List<String>listCountryExport=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            listCountryExport.add( list.get(i).getCountryName()) ;
        }
        printFile(outputCountry,listCountryExport);
    }

    static List<String> callFile(String filePath){
        List<String> list=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(filePath);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    static void printFile(String filePath,List<String>list){
        try {
            FileWriter fileWriter=new FileWriter(filePath);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i)+"\n");
            }
            bufferedWriter.write("List have "+ list.size()+"bytes");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
