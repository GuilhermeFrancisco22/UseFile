package application;

import products.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Atv1 {
    public static void main(String[] args) {
        List<Products> listProds = new ArrayList<>();
        String filePath = "C:\\temp\\dados.csv";
        String fileOutput = "C:\\temp\\summary.csv";
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String line = buffer.readLine();
            while (line != null) {
                String[] itens = line.split(",");
                System.out.println(itens[0]);
                System.out.println(itens[1]);
                System.out.println(itens[2]);
                listProds.add(new Products(itens[0], Double.parseDouble(itens[1]), Integer.parseInt(itens[2])));
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(fileOutput))) {
            for (Products prod : listProds) {
                bufferWriter.write(prod.getName() + "," + prod.total());
                bufferWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        for (Products prod : listProds) {
            System.out.println(prod.getName());
            System.out.println(prod.getPrice());
            System.out.println(prod.getQuantidy());
            System.out.println(prod.total());
        }

    }
}
