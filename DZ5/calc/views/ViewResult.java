package calc.views;
// package calc.controller;

import java.util.Scanner;

import calc.controller.Controller;
import calc.model.Complex;

public class ViewResult {
    private Controller controller;

    public ViewResult(Controller controller) {
        this.controller = controller;
    }
    public void viewRacional(String operation, Double n1, Double n2, Double result) {
        System.out.printf("%f %s %f = %f", n1, operation, n2, result);
    }
    public void viewComplex(String operation, Complex n1, Complex n2, Complex result) {
        System.out.printf("%f %s %f = %f", n1, operation, n2, result);
    }
    public void run() throws Exception {
        while (true) {
            System.out.println("\nС какими числами работаем (0 - рациональные, 1 - комплексные, 2 - выход): ");
            Scanner sc = new Scanner(System.in);
            int var = sc.nextInt();
            switch (var) {
                case 0:
                    controller.controllerRacional();
                    break;

                case 1:
                    controller.controllerComplex();
                    break;
                
                case 2:
                    return;
                default:
                    break;
            }
        }
    }
}
