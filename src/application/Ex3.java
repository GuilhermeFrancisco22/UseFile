package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) {
        String filePath = "C:\\temp\\exemplo1.txt";
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
