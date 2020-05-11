package app;

import java.util.Scanner;

public class App {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int num1, num2, suma, resta, multi, div;

        System.out.println("Digite un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Digite un numero: ");
        num2 = teclado.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+div);
    }
}