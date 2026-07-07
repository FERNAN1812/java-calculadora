package my.company.calculator.validacao;

import java.util.Scanner;

public class ValidacaoNumeroInteiro {

    public static int lerInteiroValido(String mensagem) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.println(mensagem);
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                entrada.nextLine();
                return numero;
            } else {
                System.out.println("Erro, Digite apenas numeros inteiros");
                entrada.nextLine();

            }
        }

    }

}

