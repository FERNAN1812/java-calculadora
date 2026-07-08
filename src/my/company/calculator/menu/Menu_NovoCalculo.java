package my.company.calculator.menu;

import static my.company.calculator.validacao.ValidacaoNumeroInteiro.lerInteiroValido;

public class Menu_NovoCalculo {
    public static int menuNovoCalculo(){

        System.out.println("Deseja Fazer outro Calculo ? ");
        System.out.println("1-sim");
        System.out.println("2-Não");

        return  lerInteiroValido("Escolha");
    }
}
