package dio.jovic.fundamentos.sintaxe.controleDeFLuxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = scanner.nextInt();

        try{
           contar(n1, n2);
        } catch (ParameterInvalidException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void contar(int n1, int n2) throws ParameterInvalidException {
        if (n1 > n2) {
            for (int i = 0; i <= n1 - n2; i++) {
                System.out.println("Imprimindo o numero: " + (i));
            }
        } else {
            throw new ParameterInvalidException("Parametros invalidos");
        }
    }
}
