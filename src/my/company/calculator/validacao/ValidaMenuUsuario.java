package my.company.calculator.validacao;

import my.company.calculator.menu.Menu_Usuario;

public class ValidaMenuUsuario {

    public static int modousuarioescolhido(){
        int escolhaMenu = Menu_Usuario.mostrar_menu();

        while (escolhaMenu < 1 || escolhaMenu >2) {
            System.out.println("Operação inválida. Escolha um número de 1 a 2.");
            escolhaMenu = Menu_Usuario.mostrar_menu();
        }
        return escolhaMenu;
    }

}
