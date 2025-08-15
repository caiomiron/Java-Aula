import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ArrayUnidimensional {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();
        Set<Integer> numerosGerados = new HashSet<>();

        for (int i = 0; i < vetor.length; i++) {
            int numero;
            do {
                numero = random.nextInt(100); // Gera números entre 0 e 99
            } while (numerosGerados.contains(numero));
            vetor[i] = numero;
            numerosGerados.add(numero);
        }

        // Imprime o vetor
        System.out.print("Vetor: ");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
    }
}