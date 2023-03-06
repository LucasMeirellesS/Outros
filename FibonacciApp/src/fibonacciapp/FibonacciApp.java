package fibonacciapp;

import java.util.Scanner;

public class FibonacciApp {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número que deseja verificar se está na sequência:");
        int numero = Integer.parseInt(teclado.nextLine());
        fibonacci.fibonacci(numero);
        fibonacci.mostraFibonacci();
        fibonacci.verificaNumero(numero);
    }
    
}
