package br.com.rangeldev;

import java.time.LocalDate;

import br.com.rangeldev.domain.Bootcamp;
import br.com.rangeldev.domain.Curso;
import br.com.rangeldev.domain.Dev;
import br.com.rangeldev.domain.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" +
                devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" +
                devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" +
                devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" +
                devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" +
                devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" +
                devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}





/*public class Main {
    public static void main(String[] args) {
        String target = "teamtime";
        String search = "time";


        boolean result = target.contains(search);
        System.out.println("Resultado: " + result); // Verifica se "time" está em "teamtime"
    }
}
*/
/*
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String target = "teamtime";
        String search = "time";

        boolean result = containsAllCharacters(target, search);
        System.out.println("Resultado: " + result); // Deve imprimir true
    }

    public static boolean containsAllCharacters(String target, String search) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Contar caracteres na string alvo
        for (char c : target.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Verificar se todos os caracteres da string de busca estão presentes na string alvo
        for (char c : search.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        return true;
    }
}*/
/*
import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }

    public void imprimirValidacao(boolean isValidPassword) {

        if (isValidPassword) {
            System.out.println("Cofre aberto!");
        }
        if (!isValidPassword) {
            System.out.println("Senha incorreta!");
        }
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            startDigitalCofre(scanner);
        }

        if (tipoCofre.equalsIgnoreCase("fisico")) {
            startCofreFisico();
        }
        scanner.close();
    }

    private static void startCofreFisico() {
        CofreFisico cofre = new CofreFisico();
        cofre.imprimirInformacoes();
    }

    private static void startDigitalCofre(Scanner scanner) {
        int senha = scanner.nextInt();
        CofreDigital cofre = new CofreDigital(senha);
        int password = scanner.nextInt();
        boolean isValidPassword = cofre.validarSenha(password);
        cofre.imprimirInformacoes();
        cofre.imprimirValidacao(isValidPassword);
        scanner.close();
    }
}

*/

/*
 * import java.text.DecimalFormat;
 * import java.text.Format;
 * import java.util.Scanner;
 * 
 * public class Desafio {
 * 
 * public static void main(String[] args) {
 * // Lendo os dados de Entrada:
 * Scanner scanner = new Scanner(System.in);
 * String titular = scanner.next();
 * int numeroConta = scanner.nextInt();
 * double saldo = scanner.nextDouble();
 * double taxaJuros = scanner.nextDouble();
 * 
 * ContaPoupanca contaPoupanca = new ContaPoupanca( titular,numeroConta, saldo,
 * taxaJuros);
 * 
 * System.out.println("Conta Poupanca:");
 * contaPoupanca.exibirInformacoes();
 * 
 * scanner.close();
 * }
 * }
 * 
 * interface IConta {
 * public void exibirInformacoes();
 * public void formatSaldo();
 * }
 * 
 * class ContaBancaria implements IConta {
 * protected int numero;
 * protected String titular;
 * protected double saldo;
 * 
 * public ContaBancaria(int numero, String titular, double saldo) {
 * this.numero = numero;
 * this.titular = titular;
 * this.saldo = saldo;
 * }
 * 
 * @Override
 * public void exibirInformacoes() {
 * System.out.println(titular);
 * System.out.println(numero);
 * formatSaldo();
 * }
 * 
 * @Override
 * public void formatSaldo() {
 * DecimalFormat decimalFormat = new DecimalFormat("#.0");
 * System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
 * }
 * 
 * 
 * }
 * 
 * class ContaPoupanca extends ContaBancaria {
 * private double taxaJuros;
 * 
 * public double getTaxaJuros() {
 * return taxaJuros;
 * }
 * 
 * public void setTaxaJuros(double taxaJuros) {
 * this.taxaJuros = taxaJuros;
 * }
 * 
 * public ContaPoupanca( String titular,int numero, double saldo, double
 * taxaJuros) {
 * super(numero, titular, saldo);
 * this.taxaJuros = taxaJuros;
 * }
 * 
 * public void exibirInformacoes() {
 * super.exibirInformacoes();
 * setTaxaJuros();
 * 
 * }
 * 
 * 
 * public void setTaxaJuros() {
 * Format decimalFormat = new DecimalFormat("#.0");
 * System.out.println("Taxa de juros: "+decimalFormat.format(this.taxaJuros)+"%"
 * );
 * }
 * }
 */

/*
 * import java.util.Scanner;
 * 
 * public class MainContaBancaria {
 * 
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * double saldoInicial = scanner.nextDouble();
 * ContaBancaria conta = new ContaBancaria(saldoInicial);
 * 
 * double valorDeposito = scanner.nextDouble();
 * conta.depositar(valorDeposito);
 * 
 * // Lê a Entrada com o valor do saque e aciona o método "sacar"
 * double valorSaque = scanner.nextDouble();
 * conta.sacar(valorSaque);
 * 
 * // Fechar o scanner para evitar vazamentos de recursos
 * scanner.close();
 * }
 * }
 * 
 * class ContaBancaria {
 * private double saldo;
 * 
 * public ContaBancaria(double saldoInicial) {
 * this.saldo = saldoInicial;
 * //imprimirSaldo('n');
 * }
 * 
 * public void depositar(double valor) {
 * this.saldo+=valor;
 * imprimirSaldo('d');
 * }
 * 
 * public void sacar(double valor) {
 * if(this.saldo >= valor){
 * this.saldo -=valor;
 * imprimirSaldo('s');
 * return;
 * }
 * System.out.println("Saldo insuficiente. Saque não realizado.");
 * }
 * 
 * private void imprimirSaldo(char tipo) {
 * if (tipo == 'd') {
 * System.out.println("Deposito feito.");
 * 
 * }
 * if (tipo == 's') {
 * System.out.println("Saque feito.");
 * }
 * System.out.printf("Saldo atual: %.1f\n", this.saldo);
 * }
 * 
 * }
 */

/*
 * import java.util.ArrayList;
 * import java.util.List;
 * import java.util.Scanner;
 * import java.util.stream.Collectors;
 * 
 * public class RegistroTransacoesComStream {
 * 
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * double saldo = scanner.nextDouble();
 * int quantidadeTransacoes = scanner.nextInt();
 * 
 * List<Transacao> transacoes = new ArrayList<>();
 * 
 * for (int i = 1; i <= quantidadeTransacoes; i++) {
 * 
 * char tipoTransacao = scanner.next().toLowerCase().charAt(0);
 * double valorTransacao = scanner.nextDouble();
 * 
 * if (tipoTransacao == 'd') {
 * saldo += valorTransacao;
 * transacoes.add(new Transacao(tipoTransacao, valorTransacao, saldo));
 * }
 * 
 * if (tipoTransacao == 's') {
 * saldo -= valorTransacao;
 * transacoes.add(new Transacao(tipoTransacao, valorTransacao, saldo));
 * }
 * 
 * }
 * 
 * display(transacoes, saldo);
 * scanner.close();
 * }
 * 
 * static void display(List<Transacao> transacoes, double saldo) {
 * 
 * System.out.println("\nSaldo : " + saldo);
 * System.out.println("Transacoes:");
 * transacoes.stream()
 * .map(t -> t.getTipo() + " de " + t.getValor())
 * .collect(Collectors.toList())
 * .forEach(System.out::println);
 * 
 * transacoes.stream().map(t -> t.getTipo() + " de " +
 * t.getValor()).collect(Collectors.toList());
 * }
 * }
 * 
 * class Transacao {
 * private char tipo;
 * private double valorTrans;
 * private double saldo;
 * 
 * public Transacao(char tipo, double valor, double saldo) {
 * this.tipo = tipo;
 * this.valorTrans = valor;
 * }
 * 
 * public double getSaldo() {
 * return saldo;
 * }
 * 
 * public char getTipo() {
 * return tipo;
 * }
 * 
 * public double getValor() {
 * return valorTrans;
 * }
 * }
 */

/*
 * import java.util.ArrayList;
 * import java.util.List;
 * import java.util.Scanner;
 * 
 * public class RegistroTransacoesBancarias {
 * 
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * // Lê a Entrada que informa o saldo inicial da conta
 * double saldo = scanner.nextDouble();
 * 
 * // Lê a Entrada com a quantidade total de transações
 * int quantidadeTransacoes = scanner.nextInt();
 * 
 * // Lista para armazenar as transações
 * List<Transacao> transacoes = new ArrayList<>();
 * 
 * // Loop para iterar sobre as transações
 * for (int i = 1; i <= quantidadeTransacoes; i++) {
 * // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
 * // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
 * char tipoTransacao = scanner.next().toUpperCase().charAt(0);
 * // Lê a Entrada com o valor da transação
 * double valorTransacao = scanner.nextDouble();
 * 
 * // Atualiza o saldo da conta e adicionar a transação à lista
 * if (tipoTransacao == 'D') {
 * saldo += valorTransacao;
 * transacoes.add(new Transacao('D', saldo, valorTransacao));
 * } else if (tipoTransacao == 'S') {
 * saldo -= valorTransacao;
 * transacoes.add(new Transacao('S', saldo, valorTransacao));
 * } else {
 * System.out.println("Opção inválida. Utilize D para depósito ou S para saque."
 * );
 * i--; // Decrementa o índice para repetir a iteração
 * }
 * }
 * 
 * finalizarTransacao(transacoes);
 * 
 * scanner.close();
 * }
 * 
 * static void finalizarTransacao(List<Transacao> transacoes) {
 * double dep = 0;
 * double saq = 0;
 * double saldo = 0;
 * for (Transacao item : transacoes) {
 * if (item.tipo == 'D') {
 * dep = +item.valorTransacao;
 * }
 * if (item.tipo == 'S') {
 * saq = +item.valorTransacao;
 * }
 * saldo = item.saldo;
 * }
 * System.out.println("Saldo: " + saldo);
 * System.out.println("Transacoes:");
 * setViews(dep, saq);
 * }
 * 
 * static void setViews(double dep, double saq) {
 * int num = 0;
 * if (dep > 0) {
 * num = 1;
 * System.out.println(num + ". Deposito de " + dep);
 * }
 * if (saq > 0 ){
 * if (num == 0 && dep == 0 ){
 * num=1;
 * System.out.println(num + ". Saque de " + saq);
 * }else{
 * System.out.println("2. Saque de " + saq);
 * }
 * 
 * }
 * }
 * }
 * 
 * class Transacao {
 * 
 * double saldo;
 * double valorTransacao;
 * char tipo;
 * 
 * public Transacao(char tipo, double saldo, double valorTransacao) {
 * this.valorTransacao = valorTransacao;
 * this.saldo = saldo;
 * this.tipo = tipo;
 * }
 * }
 */

