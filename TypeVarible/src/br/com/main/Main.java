public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Run Main ///////>");
        Operadores operadores = new Operadores(10, 12);
        operadores.deferentNumber();
        operadores.number1BiggerThen();
        operadores.number2LessThan();
        operadores.equalsNuber();
        operadores.nameEqual("João", "Antonio");;
        operadores.conditins(false, true);
    }
}
