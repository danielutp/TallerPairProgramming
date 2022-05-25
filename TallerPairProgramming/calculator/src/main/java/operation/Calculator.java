package operation;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private int numberOne;
    private int numberTwo;

    private  Logger log =Logger.getLogger(Calculator.class.getName());
    public void intro(){
        Scanner in = new Scanner(System.in);
        log.info("ingresar Numero 1: ");
        numberOne=in.nextInt();
        log.info("ingresar Numero 2: ");
        numberTwo= in.nextInt();
    }
    public void addition(){
        int result=(numberOne+numberTwo);

    }

    public void subtraction(){
        int result=(numberOne-numberTwo);
    }

    public void multiplied(){
        int result=(numberOne*numberTwo);
    }

    public void split(){
        int result=(numberOne+numberTwo);
    }

}