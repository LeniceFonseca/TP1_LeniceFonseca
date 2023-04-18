import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Texto: ");
        String texto = scanner.nextLine();

        System.out.print("Texto encriptado: ");
        rodarTexto(texto);
    }

    public static String rodarTexto(String texto) {
        int c = 0;
        char convert = ' ';

        for (int i = 0; i < texto.length(); i++) {
            c = texto.charAt(i);
            if ((c >= 97) && (c <= 109)){
                c += 13;
                convert = (char) c;
            }
            else if ((c >= 110) && (c <= 122)) {
                c -= 13;
                convert = (char) c;
            }
            if ((c >= 65) && (c <= 77)){
                c += 13;
                convert = (char) c;
            }
            else if ((c >= 78) && (c <= 90)) {
                c -= 13;
                convert = (char) c;
            }
            else if (c == ' ') {
                c = ' ';
                convert = (char) c;
            }
            System.out.print(convert);
        }
        System.out.println();
        return String.valueOf(convert);
    }
}