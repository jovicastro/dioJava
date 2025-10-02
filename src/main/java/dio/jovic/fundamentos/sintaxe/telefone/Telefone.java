package dio.jovic.fundamentos.sintaxe.telefone;

//Programa para testar o aprendizado de estruturas de repeticao

import java.util.Random;

public class Telefone {
    public static void main(String[] args) {
        do {
            System.out.println("tocando...");
        }while (tocando());
    }

    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        if (atendeu){
            System.out.println("atendeu");
        } else {
            System.out.println("nn atendeu");
        }
        return ! atendeu;
    };
}


