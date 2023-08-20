package TECHNOHACKS_EDUTECH;

import java.util.Scanner;

class Calculation{
    double result = 0;
    public void add(double a){
        result += a;
    }
    public void sub(double a){
        result -= a;
    }
    public void mul(double a){
        result *= a;
    }
    public void div(double a){
        result /= a;
    }
    public void result(){
        System.out.println("Value is: "+result);
    }

}

class Display{

    public void dis(){

        Scanner sc = new Scanner(System.in);
        Calculation calculation = new Calculation();
        double s,a;
        System.out.print("Enter value: ");
        double b = sc.nextDouble();
        calculation.result=b;

        do {

            System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Result\nEnter Your Choice: ");
            int n = sc.nextInt();

            switch (n){

                case 1-> {
                    System.out.print("Enter Value: ");
                    a = sc.nextDouble();
                    calculation.add(a);
                }
                case 2->{
                    System.out.print("Enter Value: ");
                    a = sc.nextDouble();
                    calculation.sub(a);
                }
                case 3->{
                    System.out.print("Enter Value: ");
                    a = sc.nextDouble();
                    calculation.mul(a);
                }
                case 4->{
                    System.out.print("Enter Value: ");
                    a = sc.nextDouble();
                    calculation.div(a);
                }
                case 5->calculation.result();

            }

            System.out.print("Enter one to take more value for calculation otherwise press other number: ");
            s = sc.nextInt();

        }while (s==1);

    }

}

public class calculator {
    public static void main(String[] args) {

        Display display = new Display();
        display.dis();

    }
}
