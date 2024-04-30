package view;

import javax.swing.*;

public class Tela_GUI {
    public static void tela(){
        String x = " ";
        int op = 0;
        x = JOptionPane.showInputDialog(null, "Escolha uma das seguintes opções:\n1- Consultar\n2- Reservar\n3- Sair");
        op = Integer.parseInt(x);

        while (op != 3){
            if (op == 1){
                model.Passagem_DAO.consultar();
            } else if (op == 2) {
                model.Passagem_DAO.reservar();
            } else {
                JOptionPane.showMessageDialog(null, "Insira um valor valido");
            }
            x = JOptionPane.showInputDialog(null, "Escolha uma das seguintes opções:\n1- Consultar\n2- Reservar\n3- Sair");
            op = Integer.parseInt(x);
        }
        JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
    }
}
