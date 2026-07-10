package my.company.calculator.menu;

import my.company.calculator.util.Entrada;

public class Menu_Usuario {

    public static int mostrar_menu(){

        System.out.println("=== Calculadora 2.5 ===");
        System.out.println("1-Argumento");
        System.out.println("2-Scanner");
        int escolhamenu;

        while (true) {
            System.out.println("Digite a opção desejada:");

            if (Entrada.entrada.hasNextInt()) {
                escolhamenu = Entrada.entrada.nextInt();
                Entrada.entrada.nextLine();
                break;
            } else {
                System.out.println("Erro, Digite apenas numeros inteiros 1 ou 2");
                Entrada.entrada.nextLine();
            }
        }
        return escolhamenu;
    }
}