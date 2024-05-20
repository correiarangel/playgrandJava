package br.com.main;
// Definição de um enum para representar cores
 enum Cor {
    VERMELHO,
    VERDE,
    AZUL,
    AMARELO,
    LARANJA,
    ROXO,
}

// Definição de um enum para representar configurações do sistema
 enum Thema {
    TEMA_CLARO,
    TEMA_ESCURO,
}

// Exemplo de uso dos enums de cores e configurações do sistema
public class ExemploEnums {
    public static void main(String[] args) {
        // Usando o enum de cores
        Cor corFundo = Cor.AZUL;
        Cor corTexto = Cor.AMARELO; // Note que BRANCO não está definido, isso gera um erro de compilação

        // Usando o enum de configurações do sistema
        Thema configuracaoAtual = Thema.TEMA_CLARO;
        if (configuracaoAtual == Thema.TEMA_CLARO) {
            // Lógica para configurar o tema claro
            System.out.println("\nTema cloro esta ativo\n");
        } else if (configuracaoAtual == Thema.TEMA_ESCURO) {
            System.out.println("\nTema cloro esta ativo\n");
        }

        System.out.println("\nCores do Sistema\n");
        // Exemplo de iteração sobre todos os valores do enum de cores
        for (Cor cor : Cor.values()) {
            System.out.println(cor);
        }
    }
}