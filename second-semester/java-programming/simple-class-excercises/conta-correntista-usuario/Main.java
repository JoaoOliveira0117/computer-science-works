import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?\n");
        String correntistaNome = scanner.nextLine();

        System.out.println("Qual o seu Endereço?\n");
        String correntistaEndereco = scanner.nextLine();

        System.out.println("Qual o número da conta?\n");
        int contaNumero = scanner.nextInt();

        System.out.println("Qual o saldo da conta?\n");
        double contaSaldo = scanner.nextDouble();

        Conta conta = new Conta(contaNumero, contaSaldo);
        Correntista correntista = new Correntista(correntistaNome, correntistaEndereco);
        
        conta.setCorrentista(correntista);
        correntista.setC(conta);

        System.out.println(
            "O(A) correntista: " + correntista.getNome() + ", dono(a) da conta n°: "
            + conta.getNumero() + " tem como saldo: \n" +
            "R$ " + conta.getSaldo()
        );
    }
}
