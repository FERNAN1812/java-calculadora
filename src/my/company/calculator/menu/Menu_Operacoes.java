package my.company.calculator.menu;

import my.company.calculator.util.Entrada;

public class Menu_Operacoes {

   public static int menuOperacoes() {
       System.out.println("=== Operações === ");
       System.out.println("1 - Adição  ");
       System.out.println("2 - Multiplicação ");
       System.out.println("3 - Subitração ");
       System.out.println("4 - Divisão ");

       int escolhamenuOp;
       while (true) {

           if (Entrada.entrada.hasNextInt()) {
               escolhamenuOp = Entrada.entrada.nextInt();
               Entrada.entrada.nextLine();
               break;
           } else {
               System.out.println("Erro, Digite apenas numeros inteiros de 1 a 4");
               Entrada.entrada.nextLine();
           }
       }
       return escolhamenuOp;
   }
}
