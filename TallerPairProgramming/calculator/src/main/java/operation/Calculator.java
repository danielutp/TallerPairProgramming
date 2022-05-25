package operation;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Ejercicio Taller Pair programming
 *         contien la clase calculator  con sus metodos
 *                    1 -> addition();
 *      *             2 -> subtraction();
 *      *             3 -> multiplied();
 *      *             4 -> split();
 *
 * @version 1.0.0 2022-05-25
 * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Yeferson Valencia (alejandro.yandd@gmail.com)
 * @since 1.0.0
 */
public class Calculator {
    private int numberOne;
    private int numberTwo;

    private final Logger log =Logger.getLogger(Calculator.class.getName());

    /**
     * 1 -> intro(); este nos permite agregar los numeros
     *               para posterios mente darle valos
     *               a los atributos numberOne y numberTwo
     *
     * @version 1.0.0 2022-05-25
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Yeferson Valencia (alejandro.yandd@gmail.com)
     * @since 1.0.0
     */
    public void intro(){
        Scanner in = new Scanner(System.in);
        log.info("ingresar Numero 1: ");
        numberOne=in.nextInt();
        log.info("ingresar Numero 2: ");
        numberTwo= in.nextInt();
    }

    /**
     * 1 -> addition(); hace la suma entre numberOne y numberTwo
     *
     * @version 1.0.0 2022-05-25
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Yeferson Valencia (alejandro.yandd@gmail.com)
     * @since 1.0.0
     */
    public void addition(){
        int result=(numberOne+numberTwo);
        String resultado = "El resultado de la suma es : " + result;
        log.info(resultado);
    }

    /**
     * 1 -> addition(); hace la resta entre numberOne y numberTwo
     *
     * @version 1.0.0 2022-05-25
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Yeferson Valencia (alejandro.yandd@gmail.com)
     * @since 1.0.0
     */
    public void subtraction(){
        int result=(numberOne-numberTwo);
        String resultado = "El resultado de la resta: " + result;
        log.info(resultado);
    }

    /**
     * 1 -> addition(); hace la multiplicacion entre numberOne y numberTwo
     *
     * @version 1.0.0 2022-05-25
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Yeferson Valencia (alejandro.yandd@gmail.com)
     * @since 1.0.0
     */
    public void multiplied(){
        int result=(numberOne*numberTwo);
        String resultado = "El resultado de la multiplicacion : " + result;
        log.info(resultado);
    }

    /**
     * 1 -> addition(); hace la division entre numberOne y numberTwo
     *
     * @version 1.0.0 2022-05-25
     * @author Daniel Steven Gil Cruz <danistcruz@gmail.com> - Yeferson Valencia (alejandro.yandd@gmail.com)
     * @since 1.0.0
     */
    public void split(){
        int result=(numberOne/numberTwo);
        String resultado = "El resultado  de la division : " + result;
        log.info(resultado);
    }
}