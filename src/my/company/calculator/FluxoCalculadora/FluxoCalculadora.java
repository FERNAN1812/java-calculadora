package my.company.calculator.FluxoCalculadora;
import my.company.calculator.executarcalculo.ExecutadorOperacoes;
import my.company.calculator.validacao.ValidaMenuOperacao;
import my.company.calculator.validacao.ValidaMenuUsuario;
import my.company.calculator.validacao.ValidaNovoCalculo;


import static my.company.calculator.validacao.ValidacaoNumeroInteiro.lerInteiroValido;


public class FluxoCalculadora {

    public static void iniciarcalculadora(String [] args){
        int opcaoNovocalculo = 0;
        int numero1 = 0;
        int numero2 = 0;
        int escolhamenuUsuario;
        int escolhamenuOperacao;

        do {

            escolhamenuUsuario = ValidaMenuUsuario.modousuarioescolhido();
            escolhamenuOperacao = ValidaMenuOperacao.operacaoescolhida();

            if (escolhamenuUsuario == 1) {
                System.out.println("voce escolheu Argumentos");

                if (args.length != 2) {
                    System.out.println("voce precisa informar dois numeros ");
                    return;
                }
                numero1 = Integer.parseInt(args[0]);
                numero2 = Integer.parseInt(args[1]);
            } else {
                numero1 = lerInteiroValido("Digite o Primeiro numero");
                numero2 = lerInteiroValido("digite o segundo numero");
            }

            double resultado = ExecutadorOperacoes.executador(numero1, numero2, escolhamenuOperacao);
            System.out.println("Resultado " + resultado);
            opcaoNovocalculo = ValidaNovoCalculo.validaroNovocalculo();

        } while (opcaoNovocalculo != 2);
        System.out.println("Muinto obrigado por usar a Calculadora 2.4!");


    }
}
