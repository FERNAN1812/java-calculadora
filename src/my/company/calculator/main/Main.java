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
        } else {
            while (true) {
                System.out.println("Digite o primeiro numero");

                if (entrada.hasNextInt()) {
                   numero1 = entrada.nextInt();
                    entrada.nextLine();
                    break;
                } else {
                    System.out.println("Erro, Digite apenas numeros inteiros");
                    entrada.nextLine();
                }
            }

            while (true) {
                System.out.println("Digite o segundo numero:");

                if (entrada.hasNextInt()) {
                    numero2 = entrada.nextInt();
                    entrada.nextLine();
                    break;
                } else {
                    System.out.println("Erro, Digite apenas numeros inteiros");
                    entrada.nextLine();
                }
            }
        }
        double resultado = ExecutadorOperacoes.executador(numero1, numero2, escolhamenuOperacao);
        System.out.println("Resultado " + resultado);



    }
}
