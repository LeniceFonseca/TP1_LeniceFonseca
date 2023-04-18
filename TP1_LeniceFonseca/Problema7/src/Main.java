import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String palavra = "dog";
        String combinacao = "vcxzxduybfdsobywuefgas";

        if (verificacao(palavra, combinacao)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }

    public static boolean verificacao(String palavra, String combinacao) {
        int index = 0;

        for (int i = 0; i < combinacao.length(); i++) {
            if (combinacao.charAt(i) == palavra.charAt(index)) {
                index++;
                if (index == palavra.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}