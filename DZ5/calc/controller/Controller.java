package calc.controller;

import java.util.Scanner;

import calc.model.Complex;
import calc.model.Racional;
import calc.views.ViewResult;

public class Controller {
    private Complex complex;
    private Racional racional;
    private ViewResult viewResult;

    public Controller() {
    }   

    public Controller(Racional racional) {
        this.racional = racional;
    }

    public Controller(Complex complex) {
        this.complex = complex;
    }
    public void controllerRacional() { //throws Exception
        Double result = 0.0;
        Double n1 = racional.number();
        Double n2 = racional.number();
        String sign = sign();
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
                    result = racional.sub(n1, n2);
                } else {
                    System.out.println("Деление на 0!");
                }
                break;      
            default:
                break;
        }
        viewResult.viewRacional(sign, n1, n2, result);
       
    }

    public void controllerComplex() {

        Complex n1 = new Complex();
        Complex n2 = new Complex();

        Complex result = new Complex(0.0, 0.0);

        String sign = sign();
        switch (sign) {
            case "+":
                result = complex.sum(n1, n2);
                break;
            case "-":
                result = complex.sub(n1, n2);
                break;      
            case "*":
                result = complex.mul(n1, n2);
                break;      
            case "/":
                // if (n2.getImage()!=0 && n2.getReal()!=0) {
                    result = complex.sub(n1, n2);
                // } else {
                    // System.out.println("Деление на 0!");
                    // return -1000000.0;
                // }
                break;      
            default:
                break;
        }
        viewResult.viewComplex(sign, n1, n2, result);
    }

    public String sign() {
        System.out.println("Введите знак действия (+, -, *, /): ");
        Scanner sc = new Scanner(System.in);
        String sign = sc.nextLine();
        return sign;
    }



}
