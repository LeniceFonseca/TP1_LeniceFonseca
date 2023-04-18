import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Ponto x: ");
            double x = scanner.nextDouble();
            arrayList.add(x);

            System.out.print("Ponto y: ");
            double y = scanner.nextDouble();
            arrayList.add(y);

            System.out.println();
        }

        scanner.close();

        System.out.println("Array: " + arrayList);

        System.out.println();

        for (int i = 0; i < 12; i+=4) {
            System.out.println("Distancia: " + distanciaDePontos(arrayList.get(i), arrayList.get(i+1), arrayList.get(i+2), arrayList.get(i+3)));
        }

    }

    private static double distanciaDePontos(double x1, double y1, double x2, double y2){
        double distancia = 0;
        double x = x2 - x1;
        double y = y2 - y1;

        distancia = (double) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return distancia;
    }
}