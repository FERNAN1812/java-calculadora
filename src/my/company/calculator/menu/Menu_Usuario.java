package my.company.calculator.menu;

import java.util.Scanner;

public class Menu_Usuario {

    public static int mostrar_menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== Calculadora 2.0 ===");
        System.out.println("1-Argumento");
        System.out.println("2-Scanner");
        System.out.println("Escolha:");
        int escolhamenu;
        escolhamenu = entrada.nextInt();
        return escolhamenu;
    }



}