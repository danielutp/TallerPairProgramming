import operation.Calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main{
    /**
     *        Contiene el metodo main  instanciamos logger calculator y scaner
     *        Scanner: poder capturar  lo que ingresa el usuario en los number one y numerberTwo
     *        logger: mostrar mensaje en consola
     *        Calculator: instancia el objeto para usar sus metedos
     *             case 1 -> calculator.addition();
     *             case 2 -> calculator.subtraction();
     *             case 3 -> calculator.multiplied();
     *             case 4 -> calculator.split();
     *
     * @author Daniel Steven Gil Cruz (danistcruz@gmail.com) - Yeferson Valencia (alejandro.yandd@gmail.com)
     * @since 1.0.0
     */
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