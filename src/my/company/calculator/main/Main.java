package my.company.calculator.main;

import my.company.calculator.operacoes.Adicao;
import my.company.calculator.operacoes.Divisao;
import my.company.calculator.operacoes.Multiplicacao;
import my.company.calculator.operacoes.Subtracao;
import my.company.calculator.validacao.ValidaMenuUsuario;
import my.company.calculator.validacao.ValidaMenuOperacao;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Puxando do menu.U menu do usuario seleciona o modo que sera executado
        int numero1 = 0;
        int numero2 = 0;
        int escolhamenuOperacao;
        int escolhamenuUsuario;
//validaMneuUsuario.java
        escolhamenuUsuario = ValidaMenuUsuario.modousuarioescolhido();

        if (escolhamenuUsuario == 1) {
            System.out.println("voce escolheu Argumentos");


            if (args.length != 2) {
                System.out.println("voce precisa informar dois numeros ");
                return;
            }
            numero1 = Integer.parseInt(args[0]);
            numero2 = Integer.parseInt(args[1]);
        }
        //ValidaMenuOperacao
        escolhamenuOperacao = ValidaMenuOperacao.operacaoescolhida();

        if (escolhamenuUsuario == 2) {
            System.out.println("Digite um numero");
            numero1 = entrada.nextInt();
            System.out.println("Digite um segundo numero ");
            numero2 = entrada.nextInt();
        }

// Menu Operacoes com a seleçao das operacoes
        switch (escolhamenuOperacao) {
            //Adicao
            case 1:
                System.out.println("Voce escolheu adiçao");
                double resultado = Adicao.somar(numero1, numero2);
                System.out.println("Resultado " + resultado);
                break;
            //Multiplicacao
            case 2:
                System.out.println("Voce Escolheu Multiplicaçao");
                double resultadomultiplicacao = Multiplicacao.multiplicar(numero1, numero2);
                System.out.println("Resultado " + resultadomultiplicacao);
                break;
            //Subitracao
            case 3:
                System.out.println("Voce escolheu Subitraçao");
                double resultadosubitracao = Subtracao.subitrair(numero1, numero2);
                System.out.println("Resultado " + resultadosubitracao);
                break;
            //Divisao
            case 4:
                System.out.println("Voce escolheu divisao");

                double resultadodivisao = Divisao.dividir(numero1, numero2);
                System.out.println("Resultado " + resultadodivisao);
                break;
            default:

        }

    }
}
