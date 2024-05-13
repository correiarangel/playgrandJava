package br.com.rangeldev.device;

public class Main {

    public static void main(String[] args) throws Exception {
        Divece divece = new Divece();
        divece.ligar("19991306907");
        divece.atender();
        divece.tocar();
        divece.pausar();
        divece.selecionarMusica();
        divece.exibirPagina("https://app.diagrams.net/?src=about#");
    }
}
