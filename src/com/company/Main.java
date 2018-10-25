package com.company;

import java.util.Scanner;

public class Main {

    public static double divideModulo(double numero1, double numero2){
        double resultado=numero1%numero2;
        return resultado;
    }
    public static void main(String[] args) {
        //Pedimos los dos números por consola y los asignamos a sus variables.
        System.out.println("Introduzca el primer número \"A\":\n");
        Scanner sc=new Scanner(System.in);
        double numeroA=sc.nextDouble();
        System.out.println("Introduzca el segundo número \"B\":\n");
        double numeroB=sc.nextDouble();
        //Declaramos resto, la variable que usaremos para comprobar si un numero es multiplo del otro.
        double resto;
        //Comparamos los números para ver cual es mas grande, ya que el pequeño nunca puede ser multiplo del grande,
        //en función de eso, calculamos el resto y lo comparamos a cero para saber si uno es multiplo del otro.
        if(numeroA>numeroB){
            resto=divideModulo(numeroA, numeroB);
            if(resto==0){
                System.out.println("A es multiplo de B:\nB no es multiplo de A.");
            }else{
                System.out.println("A no es multiplo de B:\nB no es multiplo de A.");
            }
        }else{
            resto=divideModulo(numeroB, numeroA);
            if (resto== 0) {
                System.out.println("A no es multiplo de B\nB es multiplo de A.");
            } else {
                System.out.println("A no es multiplo de B\nB no es multiplo de A.");
            }
        }
    }
}
