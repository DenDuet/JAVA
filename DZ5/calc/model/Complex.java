package calc.model;

import java.util.Scanner;

public class Complex {
    double real; // реальная часть
    double image; // мнимая часть
   
    public Complex () {// Конструктор без параметров
       Scanner input = new Scanner(System.in);
       double real = input.nextDouble();
       double image = input.nextDouble();
       this.real = real;
       this.image = image;
       
   }


    public Complex (double real, double image) {// конструктор с параметрами
       this.real = real;
       this.image = image;
   }

   public double getReal() {
       return real;
   }

   public void setReal(double real) {
       this.real = real;
   }

   public double getImage() {
       return image;
   }

   public void setImage(double image) {
       this.image = image;
   }

    public Complex sum(Complex n1, Complex n2) {
        return new Complex(n1.getReal()+n2.getReal(),n1.getImage()+n2.getImage());
    }
    public Complex sub(Complex n1, Complex n2) {
        return new Complex(n1.getReal()-n2.getReal(),n1.getImage()-n2.getImage());
    }
    public Complex mul(Complex n1, Complex n2) {
        return new Complex(n1.getReal()*n2.getReal(),n1.getImage()*n2.getImage());
    }
    public Complex div(Complex n1, Complex n2) throws Exception {
        return new Complex(n1.getReal()+n2.getReal(),n1.getImage()+n2.getImage());
    

    }



}
