package fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String path = "C:\\Users\\syful\\Desktop\\testfile2.txt";
        try {
            fr = new FileReader(path);
        } catch (Exception ex) {
            System.out.println("File not found");
        }
        try {
            br = new BufferedReader(fr);
            String data = "C:\\Users\\syful\\Desktop\\testfile1.txt";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception ex) {
            System.out.println("File is not readable");


        }
    }
}
