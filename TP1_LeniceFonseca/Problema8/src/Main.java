import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> resistencias = new ArrayList<Double>();
        double rn = 330;
        double tol = 10;

        double intervaloI = rn - (rn * (tol / 100));
        double intervaloS = rn + (rn * (tol / 100));

        System.out.printf("Resistencia minima: %.2f" + intervaloI);
        System.out.print("Resistencia maxima: %.2f" + intervaloS);

        for (double i = intervaloI; i < intervaloS; i++) {
            resistencias.add(i);
        }
        Collections.shuffle(resistencias);

        System.out.print("Resistencias validas(10): ");
        for (int i = 0; i < 10; i++) {
            System.out.print(resistencias.get(i) + "  ");
        }
    }
}