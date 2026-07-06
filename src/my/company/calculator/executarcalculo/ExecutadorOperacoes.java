package my.company.calculator.executarcalculo;
import my.company.calculator.operacoes.Adicao;
import my.company.calculator.operacoes.Divisao;
import my.company.calculator.operacoes.Multiplicacao;
import my.company.calculator.operacoes.Subtracao;


public class ExecutadorOperacoes {
    public static double executador(int numero1, int numero2, int escolhamenuOperacao) {
// Menu Operacoes com a seleçao das operacoes

        switch (escolhamenuOperacao) {
            //Adicao
            case 1:
                System.out.println("Voce escolheu adiçao");
                return   Adicao.somar(numero1, numero2);
            //Multiplicacao
            case 2:
                System.out.println("Voce Escolheu Multiplicaçao");
                return  Multiplicacao.multiplicar(numero1, numero2);

            //Subitracao
            case 3:
                System.out.println("Voce escolheu Subitraçao");
                return Subtracao.subitrair(numero1, numero2);

            //Divisao
            case 4:
                System.out.println("Voce escolheu divisao");
                return Divisao.dividir(numero1, numero2);

            default:
                try {
                    throw new Exception("Escolha um numero entre 1 a 4");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }


    }
}
