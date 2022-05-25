import operation.Calculator;

import java.util.Scanner;
import java.util.logging.Logger;


public class Main{

    public static void main(String[] args){
        Logger log = Logger.getLogger(Calculator.class.getName());
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        calculator.intro();
        log.info("""
                Ingrese que desea hacer con los numeros ingresados:\s
                1. Suma\s
                2. Resta\s
                3. Multiplicacion\s
                4. Division\s
                """);
        int option =in.nextInt();
        switch (option) {
            case 1 -> calculator.addition();
            case 2 -> calculator.subtraction();
            case 3 -> calculator.multiplied();
            case 4 -> calculator.split();
            default -> log.info("Error");
        }
    }
}