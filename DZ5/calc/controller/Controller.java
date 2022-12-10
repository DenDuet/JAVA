package calc.controller;

import calc.model.Complex;
import calc.model.Racional;
import java.util.logging.Level;

import calc.Main.Log;

public class Controller {
    private Complex complex = new Complex(0, 0);
    private Racional racional = new Racional();


    public Double controllerRacional(String sign, Double n1, Double n2) { 
        Double result=0.0;
        
        switch (sign) {
            case "+":
                result = racional.sum(n1, n2);
                break;
            case "-":
                result = racional.sub(n1, n2);
                break;      
            case "*":
                result = racional.mul(n1, n2);
                break;      
            case "/":
                if (n2!=0) {
                    try {
                        result = racional.div(n1, n2);
                    } catch (Exception e) {
                        Log.LOGGER.log(Level.INFO,"Divide by zero! Racional numbers.");
                        System.out.println(e);
                     }
                 }
                break;      
            default:
                break;
        }
        return result;        
    }    


    public Complex controllerComplex(String sign, Complex c1, Complex c2) {
        Complex resultComplex = new Complex(0.0, 0.0);;
        switch (sign) {
            case "+":
                resultComplex = complex.sum(c1, c2);
                break;
            case "-":
                resultComplex = complex.sub(c1, c2);
                break;      
            case "*":
                resultComplex = complex.mul(c1, c2);
                break;      
            case "/":

                try {
                    resultComplex = complex.div(c1, c2);
                } catch (Exception e) {
                    Log.LOGGER.log(Level.INFO,"Divide by zero! Complex numbers.");
                    e.printStackTrace();
                }

                break;      
            default:
                break;
        }
        return resultComplex;
    }

}
