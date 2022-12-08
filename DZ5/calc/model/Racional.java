package calc.model;

import java.util.Scanner;

public class Racional {
    Double racionalNumber;

    public Racional() {
        this.racionalNumber = 0.0;
    }
    
    public Double number() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите рациональное число: ");
        double num = scan.nextDouble();
        return num;
    }    

    public Double sum(Double n1, Double n2) {
        return n1+n2;
    }
    public Double sub(Double n1, Double n2) {
        return n1-n2;
    }
    public Double mul(Double n1, Double n2) {
        return n1*n2;
    }
    public Double dev(Double n1, Double n2) throws Exception {
        return n1/n2;

    }
}
