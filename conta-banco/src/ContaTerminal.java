import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Por favor, digite o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        String numAgencia = sc.nextLine();
        System.out.println("Por favor, digite o número: ");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nome + ", número de Usuário: " + numero + ". Obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + " e seu saldo é " +
        saldo + "! Já está disponível para saque.");

        sc.close();
    }
}  