package br.com.rangeldev.device;

import br.com.rangeldev.device.phone.IPhone;
import br.com.rangeldev.device.playmusic.IPlayMusic;
import br.com.rangeldev.device.webbrowser.IWebBrowser;

public class Divece implements IPhone , IWebBrowser,IPlayMusic  {

    @Override
    public String ligar(String number) {
        System.out.println("Discando: "+ number);
        return "Discando";
    }
    
    @Override
    public String atender() {
        System.out.println("Atenderder");
        return "Atenderder";
    }

    @Override
    public String iniciarCorreioDeVoz() {
        System.out.println("iniciar Correio De Voz");
        return "iniciar Correio De Voz";
    }

    @Override
    public String tocar() {
        System.out.println("Executando Musica");
        return "Executando Musica";
    }

    @Override
    public String pausar() {
        System.out.println("Execução de Musica Pausada");
        return "Execução de Musica Pausada";
    }
    @Override
    public String selecionarMusica(){
        System.out.println("Selecionar Musica");
        return "Selecionar Musica";
    };

    @Override
    public String exibirPagina(String url) {
        System.out.println("Navegando: "+url);
        return "Navegando";
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionarNovaAba : "+1);

    }

    @Override
    public String atualisarPage() {
        System.out.println("atualisarPage");
        return "atualisarPage";
    }


}


