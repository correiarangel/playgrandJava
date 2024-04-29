public class Operadores {
    private int number1;
    private int number2;

    public Operadores(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void equalsNuber() {
        boolean equals = number1 == number2;
        System.out.println("Os Numeros são IGUAIS :" + equals);
        System.out.println("\n");
    }

    public void deferentNumber() {
        boolean equals = number1 != number2;
        System.out.println("Os Numeros são DIFERENTES :" + equals);
        System.out.println("\n");
    }

    public void number1BiggerThen() {
        boolean equals = number1 > number2;
        System.out.println("Os Numeros 1 é MAIOR :" + equals);
        System.out.println("\n");
    }

    public void number2LessThan() {
        boolean equals = number1 < number2;
        System.out.println("Os Numeros 2 é MAIOR :" + equals);
        System.out.println("\n");
    }

    public void nameEqual(String name1, String name2) {
        boolean isEquals = name1.equals(name2);
        if (isEquals) {
            System.out.println("Os nomes são iguais :" + isEquals);
            System.out.println("\n");
            return;
        }
        System.out.println("Os nomes são Diferentes :" + isEquals);
        System.out.println("\n");
    }

    public void conditins(boolean conditins1, boolean conditins2) {
        if (conditins1 && conditins2) {
            System.out.println("As duas condições são VERDADEIRAS");
            System.out.println("\n");
            return;
        }
        if (conditins1 || conditins2) {
            System.out.println("Uma condições  é VERDADEIRAS");
            System.out.println("\n");
            return;
        }
        System.out.println("As duas condições são FALSAS");
        System.out.println("\n");
    }
}
