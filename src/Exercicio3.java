import java.util.Arrays;
import java.util.Random;

public class Exercicio3 {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();

        // Preencher o vetor com valores aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100); // Números aleatórios entre 0 e 99
        }

        // Imprimir o vetor antes da ordenação
        System.out.println("Vetor antes da ordenação: " + Arrays.toString(vetor));

        // Ordenar o vetor em ordem crescente
        Arrays.sort(vetor);

        // Imprimir o vetor após a ordenação
        System.out.println("Vetor após a ordenação: " + Arrays.toString(vetor));
    }
}
