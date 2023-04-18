import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        try {
            PrintStream out = new PrintStream(new FileOutputStream("/home/lenice/Documents/POO-23/TP1_LeniceFonseca/Problema3/src/file.txt"));

            out.print("Array [ ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
                out.print(arr[i] + " ");
            }
            out.println("]");

            out.print("Indice Par [ ");
            for (int j = 0; j < arr.length; j++) {
                if (j%2 == 0) {
                    out.print(arr[j] + " ");

                }
            }
            out.println("]");

            out.print("Elementos Pares [ ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2 == 0) {
                    out.print(arr[i] + " ");
                }
            }
            out.println("]");

            out.print("Array inverso [ ");
            for (int i = arr.length - 1; i >= 0; i--) {
                out.print(arr[i] + " ");
            }
            out.println("]");

            out.print("Primeiro elemento = " + arr[0] + " & ");
            out.print("Ultimo elemento = " + arr[arr.length - 1]);

            out.flush();
            out.close();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException " + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("IOException " + e.getMessage());
        }
    }
}