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
public class ex05 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int base, altura;

        System.out.println("Qual o valor da base do triângulo: ");
        base = x.nextInt();

        System.out.println("Qual o valor da altura do triângulo");
        altura = x.nextInt();
        
        int area = base * (altura / 2);

        System.out.println("A área do triangulo é: " + area);
    }
}
