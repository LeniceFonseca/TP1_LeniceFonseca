import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Double> sales = new ArrayList<>();
        ArrayList<String> client = new ArrayList<>();

        BufferedReader readCli = new BufferedReader(new FileReader("/home/lenice/Documents/POO-23/TP1_LeniceFonseca/Problema5/src/clientes.txt"));
        BufferedReader readComp = new BufferedReader(new FileReader("/home/lenice/Documents/POO-23/TP1_LeniceFonseca/Problema5/src/compra.txt"));


        Scanner scanner = new Scanner(readCli);
        while (scanner.hasNext()) {
            if (scanner.hasNextLine()) {
                String cli = scanner.nextLine();
                client.add(cli);
            }
            else {
                scanner.next();
            }
        }

        Scanner scanner1 = new Scanner(readComp);
        while (scanner1.hasNext()) {
            if (scanner1.hasNextDouble()) {
                double comp = scanner1.nextDouble();
                sales.add(comp);
            }
            else {
                scanner1.next();
            }
        }

        readComp.close();
        readCli.close();

        System.out.print("Clientes: ");
        client.forEach(a -> System.out.print(a + ", "));

        System.out.println();

        System.out.print("Compras: ");
        sales.forEach(b -> System.out.print(b + ", "));

        System.out.println();
        System.out.println("Cliente com maior compra: " + nameOfBestCustomer(sales, client));
    }

    static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers) throws IOException {

        Double maior = 0.0;
        for (int i = 0; i < sales.size(); i++) {
            if (sales.get(i) > maior) {
                maior = sales.get(i);
            }
        }

        int indice = sales.indexOf(maior);
        String nome = customers.get(indice);

        return nome;
    }
}