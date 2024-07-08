import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite a sua agência");
        String agencia = scanner.next();
        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();
     
        System.out.println("Olá " + nome + " ,obrigado por confiar em nosso banco e criar uma conta, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está liberado para saque.");
    }
}
