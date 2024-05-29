package br.com.rangeldev;

import br.com.rangeldev.domain.DadosLocalizacao;

public class Mocks {
    public final static String cepMock = "13880-000";

    public final static String cepErrorMock = "1388";
    public static DadosLocalizacao dadosMock = new DadosLocalizacao(
            "SP",
            "Vargem Grande do Sul",
            "Rua Grajaúna",
            "casa",
            "Lago Azul");
}
