package my.company.calculator.FluxoCalculadora;

import my.company.calculator.executarcalculo.ExecutadorOperacoes;
import my.company.calculator.validacao.ValidaArgumentos;
import my.company.calculator.validacao.ValidaMenuOperacao;
import my.company.calculator.validacao.ValidaMenuUsuario;
import my.company.calculator.validacao.ValidaNovoCalculo;


import static my.company.calculator.validacao.ValidacaoNumeroInteiro.lerInteiroValido;


public class FluxoCalculadora {

    public static void iniciarcalculadora(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int opcaoNovocalculo = 0;
        int escolhamenuUsuario;
        int escolhamenuOperacao;

        do {

            escolhamenuUsuario = ValidaMenuUsuario.modousuarioescolhido();
            escolhamenuOperacao = ValidaMenuOperacao.operacaoescolhida();

            if (escolhamenuUsuario == 1) {
                System.out.println("voce escolheu Argumentos");

                int[] numeros = ValidaArgumentos.validarArgumentos(args);
                if (numeros == null) {
                    return;
                }
                numero1 = numeros[0];
                numero2 = numeros[1];

            } else {
                numero1 = lerInteiroValido("Digite o Primeiro numero");
                numero2 = lerInteiroValido("digite o segundo numero");
            }

            double resultado = ExecutadorOperacoes.executador(numero1, numero2, escolhamenuOperacao);
            System.out.println("Resultado " + resultado);
            opcaoNovocalculo = ValidaNovoCalculo.validaroNovocalculo();

        } while (opcaoNovocalculo != 2);
        System.out.println("Muinto obrigado por usar a Calculadora 2.5!");


    }
}
