package my.company.calculator.validacao;

import my.company.calculator.menu.Menu_Operacoes;

public class ValidaMenuOperacao {


   public static int operacaoescolhida(){
      int escolhamenuOp = Menu_Operacoes.menuOperacoes();

       while (escolhamenuOp <1 || escolhamenuOp > 4){
        System.out.println("Operação inválida. Escolha um número de 1 a 4.");
        escolhamenuOp = Menu_Operacoes.menuOperacoes();

       }
       return escolhamenuOp;
   }
}
