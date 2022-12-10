package calc.views;
// package calc.controller;


import java.util.Scanner;
import java.util.logging.Level;

import calc.Main.Log;
import calc.controller.Controller;
import calc.model.Complex;

public class ViewResult {
    private Controller controller;

    public ViewResult(Controller controller) {
        this.controller = controller;
    }
    public void viewRacional(String operation, Double n1, Double n2, Double result) {
        String view = String.format("%.2f %s %.2f = %.2f", n1, operation, n2, result);
        System.out.println(view);
        Log.LOGGER.log(Level.INFO,view);
    }
    public void viewComplex(String operation, Complex n1, Complex n2, Complex result) {
        String view = String.format("(%s) %s (%s) = %s", n1, operation, n2, result);
        System.out.println(view);
        Log.LOGGER.log(Level.INFO,view);
    }
    public void run() throws Exception {
        String sign = "";
        Double result = 0.0;

        while (true) {
            System.out.println("\n\nС какими числами работаем (0 - рациональные, 1 - комплексные, 2 - выход): ");
            Scanner scan = new Scanner(System.in);
            while (!scan.hasNextInt()) {
                System.out.println("Это не число! Введите 0 - рациональные, 1 - комплексные, 2 - выход: ");
                Log.LOGGER.log(Level.INFO,"Trouble with choosing...");
                scan.next();
            }
            int var = scan.nextInt();
            switch (var) {
                case 0:
                  
                    Double n1 = prompt("Введите вещественное число: ");
                    Double n2 = prompt("Введите вещественное число: ");
                    sign = sign();
                    Log.LOGGER.log(Level.INFO,"begin - controllerRacional");
                    result = controller.controllerRacional(sign,n1,n2);
                    Log.LOGGER.log(Level.INFO,"begin - viewRacional");
                    viewRacional(sign, n1, n2, result);
                    break;

                case 1:
                    double real = prompt("Введите действительную часть комплексного числа: ");
                    double image = prompt("Введите мнимую часть комплексного числа: ");
                    Complex c1 = new Complex(real, image);
                    System.out.printf("Первое комплексное число: %s\n", c1);
                    double real1 = prompt("Введите действительную часть комплексного числа: ");
                    double image1 = prompt("Введите мнимую часть комплексного числа: ");
                    Complex c2 = new Complex(real1, image1);
                    System.out.printf("Второе комплексное число: %s\n", c2);
            
                    Complex resultComplex = new Complex(0.0, 0.0);
                    sign = sign();
                    Log.LOGGER.log(Level.INFO,"begin - controllerComplex");
                    resultComplex = controller.controllerComplex(sign, c1, c2);
                    Log.LOGGER.log(Level.INFO,"begin - viewComplex");
                    viewComplex(sign, c1, c2, resultComplex);
                    break;
                
                case 2:
                    Log.LOGGER.log(Level.INFO,"Exit");
                    return;
                default:
                    break;
            }
        }
    }


    public Double prompt(String promptString) {
            double num;
            Scanner scan = new Scanner(System.in);
            System.out.println(promptString);
            while (!scan.hasNextDouble()) {
                System.out.println("Это не число! Введите вещественное число: ");
                Log.LOGGER.log(Level.INFO,"False input, try again!");
                scan.next();
            }
            num = scan.nextDouble();

            return num;
        }    

    public String sign() {
        System.out.println("Введите знак действия (+, -, *, /): ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            String sign = scan.nextLine();
            if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
                return sign;
            }
            System.out.println("Введите знак действия (+, -, *, /): ");
            Log.LOGGER.log(Level.INFO,"False input, try again!");
        }
    }

    }

