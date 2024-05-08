import java.util.Scanner;

public class ContaTerminal {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        String nome;
        String agencia;
        int numero;
        double saldo = 237.48;

        System.out.println("Por favor, Digite sua agencia: ");
        agencia = scan.next();

        System.out.println("Por favor, Digite o numero da conta: ");
        numero = scan.nextInt();

        System.out.println("Por favor, Digite o seu nome: ");
        nome = scan.next();

        System.out.println("Olá "+ (nome) +", obrigado por criar uma conta em nosso banco, sua agência é "
        + (agencia) + ", conta " +(numero) + ", e seu saldo é " + (saldo) + " já esta disponivel para saque.");


    }

}
