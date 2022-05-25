package operation;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private int numberOne;
    private int numberTwo;

    private final Logger log =Logger.getLogger(Calculator.class.getName());
    public void intro(){
        Scanner in = new Scanner(System.in);
        log.info("ingresar Numero 1: ");
        numberOne=in.nextInt();
        log.info("ingresar Numero 2: ");
        numberTwo= in.nextInt();
    }
    public void addition(){
        int result=(numberOne+numberTwo);
        String resultado = "El resultado de la suma es : " + result;
        log.info(resultado);
    }

    public void subtraction(){
        int result=(numberOne-numberTwo);
        String resultado = "El resultado de la resta: " + result;
        log.info(resultado);
    }

    public void multiplied(){
        int result=(numberOne*numberTwo);
        String resultado = "El resultado de la multiplicacion : " + result;
        log.info(resultado);
    }

    public void split(){
        int result=(numberOne/numberTwo);
        String resultado = "El resultado  de la division : " + result;
        log.info(resultado);
    }
}