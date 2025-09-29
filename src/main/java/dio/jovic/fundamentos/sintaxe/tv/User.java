package dio.jovic.fundamentos.sintaxe.tv;

import static dio.jovic.fundamentos.sintaxe.tv.Tv.*;

public class User {
    public static void main(String[] args) {

        Tv televisao = new Tv();

        System.out.println(televisao.isOn);
        televisao.isOn = LigarTelevisao(televisao.isOn);
        System.out.println(televisao.isOn);
        televisao.canal = AlmentarCanal(televisao.canal);
        System.out.println(televisao.canal);
        televisao.canal = DiminuirCanal(televisao.canal);
        System.out.println(televisao.canal);
        televisao.canal = ChoseCanal(televisao.canal);
        System.out.println(televisao.canal);

    }
}
