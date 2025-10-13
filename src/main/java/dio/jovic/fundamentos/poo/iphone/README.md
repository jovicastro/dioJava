```mermaid
classDiagram
    class IPhone {
        +ReprodutorMusical reprodutor
        +Navegador navegador
        +Telefone telefone
    }

    class ReprodutorMusical {
        -String musica
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica(String musica)
    }

    class Navegador {
        -String url
        +exibirPag(String url)
        +newTab()
        +reloadTab()
    }

    class Telefone {
        -String numero
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    IPhone o-- ReprodutorMusical
    IPhone o-- Navegador
    IPhone o-- Telefone
