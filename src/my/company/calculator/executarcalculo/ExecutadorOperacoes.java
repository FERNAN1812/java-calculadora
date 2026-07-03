package my.company.calculator.executarcalculo;

import my.company.calculator.operacoes.Adicao;
import my.company.calculator.operacoes.Divisao;
import my.company.calculator.operacoes.Multiplicacao;
import my.company.calculator.operacoes.Subtracao;


public class ExecutadorOperacoes {
    public static double executador(int numero1, int numero2, int escolhamenuOperacao) {
// Menu Operacoes com a seleçao das operacoes
double resultado = 0;

        switch (escolhamenuOperacao) {
            //Adicao
            case 1:
                System.out.println("Voce escolheu adiçao");
                resultado = Adicao.somar(numero1, numero2);
                break;
            //Multiplicacao
            case 2:
                System.out.println("Voce Escolheu Multiplicaçao");
                resultado = Multiplicacao.multiplicar(numero1, numero2);
                break;
            //Subitracao
            case 3:
                System.out.println("Voce escolheu Subitraçao");
                resultado = Subtracao.subitrair(numero1, numero2);
                break;
            //Divisao
            case 4:
                System.out.println("Voce escolheu divisao");
                 resultado = Divisao.dividir(numero1, numero2);
                break;
            default:
        }


        return resultado;
    }
}
