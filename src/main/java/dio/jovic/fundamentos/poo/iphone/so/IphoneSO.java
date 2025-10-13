package dio.jovic.fundamentos.poo.iphone.so;

import dio.jovic.fundamentos.poo.iphone.apps.Navegador;
import dio.jovic.fundamentos.poo.iphone.apps.Telefone;
import dio.jovic.fundamentos.poo.iphone.apps.TocadorDeMusica;

import java.util.Random;

public class IphoneSO {
    public static void main(String[] args) {

        Random random = new Random();

        TocadorDeMusica appMusica = new TocadorDeMusica();
        appMusica.tocarMusica(Musicas[random.nextInt(Musicas.length)]);

        Navegador appNavegador = new Navegador();
        appNavegador.exibirPagina(internetIsOn, url);

        Telefone appTelefone = new Telefone();
        appTelefone.ligar(telNum);

    }

    static boolean internetIsOn = true;
    static String[] Musicas = {"Paranoid", "Future Games", "Unforgiven"};
    static String url = "www.google.com";
    static String telNum = "11915405817";
}
