package my.company.calculator.validacao;

import my.company.calculator.menu.Menu_NovoCalculo;

import static my.company.calculator.validacao.ValidacaoNumeroInteiro.lerInteiroValido;
public class ValidaNovoCalculo {
    public static int validaroNovocalculo(){

        int opcaoNovocalculo = Menu_NovoCalculo.menuNovoCalculo();

        while (opcaoNovocalculo <1 || opcaoNovocalculo > 2){
            System.out.println("Operação inválida. Escolha um número de 1 a 2.");
            opcaoNovocalculo = lerInteiroValido("Digite 1 ou 2");

        }
        return opcaoNovocalculo;

    }

}
