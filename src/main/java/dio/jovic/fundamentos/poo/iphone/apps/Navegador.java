package dio.jovic.fundamentos.poo.iphone.apps;

public class Navegador {

    public void exibirPagina(boolean internetOn, String url) {
        if (internetOn) {
            System.out.println("Navegando para: " + url);
        } else {
            System.out.println("Sem conexão com a internet.");
        }
    }

    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("atualizando pagina...");
    }
}

