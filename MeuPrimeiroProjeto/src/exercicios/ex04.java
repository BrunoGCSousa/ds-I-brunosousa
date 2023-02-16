/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class ex04 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Digite o valor de A: ");
        a = x.nextInt();
        System.out.println("Digite o valor de B: ");
        b = x.nextInt();
        
        int soma = a + b;
        
        System.out.println("A soma é: " + soma);
        System.out.println("A divisão é: " + (a / b));
        System.out.println("A subtração é: " + (a - b));
        System.out.println("A multiplicação é: " + (a * b));
    }
}
