package my.company.calculator.main;


import my.company.calculator.executarcalculo.ExecutadorOperacoes;
import my.company.calculator.validacao.ValidaMenuOperacao;
import my.company.calculator.validacao.ValidaMenuUsuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int escolhamenuUsuario;
        int escolhamenuOperacao;

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
        }else {
            System.out.println("digite um numero");
            numero1 = entrada.nextInt();
            System.out.println("digite um segundo numero");
            numero2 = entrada.nextInt();
        }
        double resultado = ExecutadorOperacoes.executador(numero1, numero2,escolhamenuOperacao);
        System.out.println("Resultado " + resultado);
    }

}
