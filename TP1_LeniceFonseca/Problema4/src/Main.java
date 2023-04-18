import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int ROWS = 4;
    private static final int COLUMNS = 4;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new BufferedReader(new FileReader("/home/lenice/Documents/POO-23/TP1_LeniceFonseca/Problema4/src/numeros.txt")));
        int[][] myArray = new int[ROWS][COLUMNS];
        boolean a = false;

        while (scanner.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = scanner.nextLine().trim().split("," + " ");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 1; j < myArray.length; j++) {
                for (int k = 1; k <= 16; k++) {
                    if (myArray[i][j] == k) {
                        a = true;
                    }
                }
            }
        }

        System.out.println("Contem numeros de 1 a 16? " + a);

        if(ehQuadradoMagico(myArray)){
            System.out.println("Eh um quadrado mágico");
        } else {
            System.out.println("Não eh um quadrado mágico");
        }

    }

    public static boolean ehQuadradoMagico(int[][] matriz) {
        int primeiraLinha = 0;
        int primeiraColuna = 0;

        for (int i = 0; i < ROWS; i++){
            int totalLinha = 0;
            int totalColuna = 0;
            for (int j = 0; j < COLUMNS; j++){
                if(i == 0){
                    primeiraLinha += matriz[i][j];
                    primeiraColuna += matriz[j][i];
                }
                totalLinha += matriz[i][j];
                totalColuna += matriz[j][i];
            }
            if(totalLinha != primeiraLinha || totalLinha != totalColuna || totalColuna != primeiraColuna || primeiraColuna != primeiraLinha){
                return false;
            }
        }
        return true;
    }
}