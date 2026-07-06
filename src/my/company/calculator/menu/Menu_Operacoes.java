package my.company.calculator.menu;

import java.util.Scanner;

public class Menu_Operacoes {

   public static int menuOperacoes() {
       Scanner entrada = new Scanner(System.in);

       System.out.println("=== Operações === ");
       System.out.println("1 - Adição  ");
       System.out.println("2 - Multiplicação ");
       System.out.println("3 - Subitração ");
       System.out.println("4 - Divisão ");

       int escolhamenuOp;
       while (true) {

           if (entrada.hasNextInt()) {
               escolhamenuOp = entrada.nextInt();
               entrada.nextLine();
               break;
           } else {
               System.out.println("Erro, Digite apenas numeros inteiros de 1 a 4");
               entrada.nextLine();
           }
       }
       return escolhamenuOp;
   }
}
