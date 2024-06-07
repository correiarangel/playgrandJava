package br.com.rangeldev;

import br.com.rangeldev.domain.DadosLocalizacao;
import br.com.rangeldev.domain.Email;
import br.com.rangeldev.domain.Formato;

public class Mocks {
    public final static String cepMock = "13880-000";

    public final static String cepErrorMock = "1388";
    public static DadosLocalizacao dadosMock = new DadosLocalizacao(
            "SP",
            "Vargem Grande do Sul",
            "Rua Grajaúna",
            "casa",
            "Lago Azul"
    );
    
    public final static Email  email = new  Email("meuemal@com.br", "Oi oi oi", Formato.TEXTO);
}
