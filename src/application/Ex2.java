package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        //Abertura de arquivo para leitura, utiloizando o BufferedRead e FileReader
        String filePath = "C:\\temp\\exemplo1.txt";
        BufferedReader buffer = null;
        FileReader file = null;

        try {
            file = new FileReader(filePath);
            buffer = new BufferedReader(file);
            String line = buffer.readLine();
            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (buffer != null) {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
