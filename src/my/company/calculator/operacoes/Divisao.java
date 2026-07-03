package my.company.calculator.operacoes;


public class Divisao {
    public static double dividir(int Numero1,int Numero2){

        if (Numero1 <= 0 || Numero2 <= 0) {
            System.out.println("Operação inválida. Não da para Dividir por zero");
            return (Double.NaN);
        }else {
            return  (double) Numero1 / Numero2;
        }
    }

}
