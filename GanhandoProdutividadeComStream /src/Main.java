
import java.util.Arrays;
import java.util.List;

import br.com.rangeldev.functional_interface.BinaryOperatorImpl;
import br.com.rangeldev.functional_interface.ConsumerImpl;
import br.com.rangeldev.functional_interface.FunctionImpl;
import br.com.rangeldev.functional_interface.PredicateImpl;
import br.com.rangeldev.functional_interface.SupplierImpl;
import br.com.rangeldev.optional.OptionalImpl;

public class Main {
    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 10);

    public static void main(String[] args) throws Exception {
        // consumerImplTest();
        // binaryOperatorRunTest();
        // supplierRunTest();
        // functionRunTest();
        //predicateRunTest();
        OptionalRunTest();
    }
    

    public static void OptionalRunTest() throws Exception {

        OptionalImpl optional = new OptionalImpl();
        //optional.optionalOf();
       // optional.optionalOfNullable(null);
       // optional.optionalEmpty(); 
      //  optional.optionalIsPresent(); 
      //  optional.optionalOfNullableJdk11(null);
      //  optional.optionalOfSdk11(null);
     //   optional.optionalOfOrElse(null);
     //   optional.optionalOfOrElseGet(null);
        optional.optionalifPresentSDK11("Hiii!");
        // optional.optionalOfOrElseThrow(null);
         
    }

    public static void predicateRunTest() throws Exception {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
        PredicateImpl predicateImpl = new PredicateImpl();
        predicateImpl.run(palavras,7);
    }

    public static void functionRunTest() throws Exception {
        FunctionImpl functionImpl = new FunctionImpl();
        functionImpl.run();
        functionImpl.dobrarRun(123);
    }

    public static void supplierRunTest() throws Exception {
        SupplierImpl supplier = new SupplierImpl();
        supplier.run(10);
    }

    public static void binaryOperatorRunTest() throws Exception {
        BinaryOperatorImpl operatorRun = new BinaryOperatorImpl();
        operatorRun.binaryOperatorRun(numeros);
    }

    public static void consumerImplTest() throws Exception {

        ConsumerImpl consumer = new ConsumerImpl();
        consumer.imprimirNumeroParLambda(numeros);

        consumer.imprimirNumeroParStream(numeros);
    }

}