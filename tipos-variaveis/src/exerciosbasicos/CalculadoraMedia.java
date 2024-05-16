/*
 * Escreva um programa que calcule a média de três números fornecidos pelo usuário.
 * 
 * Entrada: 3 números
 * Saída: média dos números 
 * 
 */

package exerciosbasicos;

import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, numero3, media;
        // recebe 1º número
        System.out.printf("Informe a primeira nota: ");
        numero1 = entrada.nextDouble();
        // recebe 2º número
        System.out.printf("Informe a primeira nota: ");
        numero2 = entrada.nextDouble();
        // recebe 3º número
        System.out.printf("Informe a primeira nota: ");
        numero3 = entrada.nextDouble();

        // calcula a média
        media = (numero1+numero2+numero3) / 3;

        // resultado da média
        System.out.printf("A média dos números é: %.2f", media);
        // System.out.printf("%f, %f, %f",nota1, nota2, nota3);

        
    }
    
}
