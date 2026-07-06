package my.company.calculator.menu;

import java.util.Scanner;

public class Menu_Usuario {

    public static int mostrar_menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== Calculadora 2.0 ===");
        System.out.println("1-Argumento");
        System.out.println("2-Scanner");
        int escolhamenu;
        while (true) {
            System.out.println("Digite a opção desejada:");

            if (entrada.hasNextInt()) {
                escolhamenu = entrada.nextInt();
                entrada.nextLine();
                break;
            } else {
                System.out.println("Erro, Digite apenas numeros inteiros 1 ou 2");
                entrada.nextLine();
            }
        }
        return escolhamenu;
    }
}