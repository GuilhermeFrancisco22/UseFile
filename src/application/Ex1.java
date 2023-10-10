package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\exemplo1.txt");
        //Objeto vazio/Reserva um espaçe em memoria para um Scanner
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("To aqui men...");
            if(sc != null){
                sc.close();
                System.out.println("Bye Bye...");
            }
        }

    }
}