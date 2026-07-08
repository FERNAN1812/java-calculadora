package my.company.calculator.validacao;

import my.company.calculator.util.Entrada;

public class ValidacaoNumeroInteiro {

    public static int lerInteiroValido(String mensagem) {


        int numero;
        while (true) {
            System.out.println(mensagem);
            if ( Entrada.entrada.hasNextInt()) {
                numero =  Entrada.entrada.nextInt();
                Entrada.entrada.nextLine();
                return numero;
            } else {
                System.out.println("Erro, Digite apenas numeros inteiros");
                Entrada.entrada.nextLine();

            }
        }

    }

}

