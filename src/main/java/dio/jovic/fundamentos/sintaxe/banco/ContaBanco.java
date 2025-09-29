package dio.jovic.fundamentos.sintaxe.banco;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o numero da agencia: ");
        String agencia = sc.next();

        sc.nextLine();

        System.out.println("Digite seu nome");
        String nomeCliente = sc.nextLine().toUpperCase();

        System.out.println("Digite seu saldo");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
