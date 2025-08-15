import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Funcionario {
    String nome;
    double salario;
    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
public class Exercicios2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        String continuar;
        do {
            System.out.print("Digite o nome do funcionário: ");
            String nome = sc.nextLine();
            System.out.print("Digite o salário do funcionário: ");
            double salario = sc.nextDouble();
            sc.nextLine(); // Consumir a nova linha
            funcionarios.add(new Funcionario(nome, salario));
            System.out.print("Deseja adicionar outro funcionário? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.salario;
        }
        double mediaSalarial = funcionarios.size() > 0 ? totalSalarios / funcionarios.size() : 0;
        System.out.printf("Total gasto com a folha de pagamento: R$ %.2f%n", totalSalarios);
        System.out.printf("Média salarial dos funcionários: R$ %.2f%n", mediaSalarial);
    }
}