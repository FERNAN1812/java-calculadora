package my.company.calculator.operacoes;


public class Divisao {
    public static double dividir(int numero1,int numero2){

        if (numero2 == 0) {
            System.out.println("Operação inválida. Não da para Dividir por zero");
            return (Double.NaN);
        }else {
            return  (double) numero1 / numero2;
        }
    }

}
