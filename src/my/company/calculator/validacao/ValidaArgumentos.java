package my.company.calculator.validacao;

public class ValidaArgumentos {

    public static int[] validarArgumentos(String []args){

int numero1;
int numero2;

        if (args.length != 2) {
            System.out.println("voce precisa informar dois numeros ");
            return null;
        } try {
            numero1 = Integer.parseInt(args[0]);
            numero2 = Integer.parseInt(args[1]);

        } catch (NumberFormatException e) {
            System.out.println("Argumentos inválidos. Informe dois números inteiros. ");
            return null;
        }
        return new int[]{ numero1, numero2};
    }
}
