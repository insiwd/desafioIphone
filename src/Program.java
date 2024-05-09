

import interfaces.iphone.Iphone;

public class Program {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        // dar espaço
        System.out.println();

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreio();

        System.out.println();


        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
