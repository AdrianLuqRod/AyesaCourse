package _07ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        File archivo = new File("numeros.txt");
        File archivoPares = new File("pares.txt");
        File archivoImpares = new File("impares.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(archivo));
                PrintWriter pwPares = new PrintWriter(new FileWriter(archivoPares, true));
                PrintWriter pwImpares = new PrintWriter(new FileWriter(archivoImpares, true))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                if (numero % 2 == 0) {
                    pwPares.println(numero);
                } else {
                    pwImpares.println(numero);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader(archivoPares);
                BufferedReader brPares = new BufferedReader(fr)) {
            System.out.println("Pares: ");
            String linea;
            while ((linea = brPares.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        try (FileReader fr = new FileReader(archivoImpares);
                BufferedReader brImpares = new BufferedReader(fr)) {
            System.out.println("Impares: ");
            String linea;
            while ((linea = brImpares.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
