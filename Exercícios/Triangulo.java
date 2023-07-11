package Luiza;

import java.util.Scanner;

/* 
 
Exercício: Fazer uma função que gera um triângulo lateral de altura 
2*(n+1) e largura n. Por exemplo, a saída para n = 4 seria:

    *
    **
    ***
    ****
    ***
    **
    *
    
*/

public class Triangulo {
    public static void main(String[] args) {
        int n;

        Scanner teclado = new Scanner(System.in);

        // Recebe n
        System.out.println("Entre com o número:");
        n = teclado.nextInt();

        // Imprime o triângulo
        triangulo(n);

        teclado.close();
    }

    static void triangulo(int numero) {
        // A partir desse número, o loop deve decrescer
        int decresce = (numero / 2) + 1;

        // quantas linhas deve imprimir
        for (int i = 1; i <= decresce+1; i++) {
            // quantos asteriscos deve imprimir
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        
        for (int i = decresce; i > 0; i--) {
            // quantos asteriscos deve imprimir
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
