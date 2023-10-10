package application;

import java.io.*;

public class Ex4Write {
    public static void main(String[] args) {
        String filePath = "C:\\temp\\banana.txt";
        String[] nomes = new String[]{"Guilerhem Santos", "Diego", "Guilherme Sampaio", "João"};
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line: nomes){
                buffer.write(line);
                buffer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Função para String (split)

        String test = "Guilherme,99244-2343,22/01/2005,Rua qualquer - 23";
//        test.split(",");
        String[] dados = test.split(",");
        for (int i = 0; i < dados.length; i++){
            System.out.println(dados[i]);
        }
    }
}
