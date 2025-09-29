package dio.jovic.fundamentos.sintaxe.tv;

import java.util.Scanner;

public class Tv {

    boolean isOn = false;
    int canal = 0;
    int volume = 0;

    public static boolean LigarTelevisao(boolean isOn){
        isOn = !isOn;
        return isOn;
    }

    public static int AlmentarCanal(int canal){
        canal ++;
        return canal;
    };

    public static int DiminuirCanal(int canal){
        canal --;
        return canal;
    }

    public static int ChoseCanal(int canal){
        Scanner sc = new Scanner(System.in);
        canal = sc.nextInt();
        return canal;
    }
}