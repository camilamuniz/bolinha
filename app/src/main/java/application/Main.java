package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for(int con=0; con<numeros.length; con++) {
            try {
                System.out.println("Digite um número inteiro:");
                Scanner sc = new Scanner(System.in);
                numeros[con] = sc.nextInt();
                    }   catch (InputMismatchException ex) {
                System.out.println("tipo de dado invalido");
                con--;
            }
        }

        System.out.println("Valores Válidos: ");
        for(int val : numeros) {
            System.out.print(val + " ");
        }
    }
}

