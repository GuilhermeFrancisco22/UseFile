package application;

import java.io.*;

public class Atv1 {
    public static void main(String[] args) {
        String filePath = "C:\\temp\\dados.csv";
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String line = buffer.readLine();
            while (line != null) {
                line = buffer.readLine();
                String test = line;
                try {
                    String[] dados = test.split(",");
                    for (int i = 0; i < dados.length; i++) {
                        System.out.println(dados[i]);
                    }
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
