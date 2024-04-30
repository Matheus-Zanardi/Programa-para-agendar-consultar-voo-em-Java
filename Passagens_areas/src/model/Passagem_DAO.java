package model;

import javax.swing.*;
import java.util.Objects;

public class Passagem_DAO {
    //criando os vetores armazenando os dados dos voos
    public static int[] voos_num = {111, 222};
    public static String[] voos_org = {"São Paulo", "Rio de Janeiro"};
    public static String[] voos_dst = {"Bahia", "Santa Catarina"};

    public static String[] assentosvoo1 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};
    public static String assentovoo1 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo1[0]+" "+assentosvoo1[1]+"\n"+assentosvoo1[2]+" "+assentosvoo1[3]+"\n"+assentosvoo1[4]+" "+assentosvoo1[5];
    public static String[] assentosvoo2 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};
    public static String assentovoo2 = "Este é o voo: 222\nOrigem: Rio de Janeiro\nDestino: Santa Catarina\n\n"+assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];

    //criando a função para consultar o status do voo
    public static void consultar(){
        String x = "", dest_voo = "", org_voo = "", str_num_voo = "";
        int op = 0, num_voo = 0;
        x = JOptionPane.showInputDialog(null, "Escolha uma das seguintes opções:\n1- Consultar por Número do voo\n2- Consultar por Origem do voo\n3- Consultar por Destino do voo");
        op = Integer.parseInt(x);

        if (op == 1){
            str_num_voo = JOptionPane.showInputDialog(null, "Digite o Número do voo");
            num_voo = Integer.parseInt(str_num_voo);

            if (num_voo == 111){
                JOptionPane.showMessageDialog(null, assentovoo1);
            } else if (num_voo == 222) {
                JOptionPane.showMessageDialog(null, assentovoo2);
            } else{
                JOptionPane.showMessageDialog(null, "Este voo não existe!");
            }

        } else if (op == 2) {
            org_voo = JOptionPane.showInputDialog(null, "Digite o Número do voo");

            if (org_voo.equals("São Paulo")){
                JOptionPane.showMessageDialog(null, assentovoo1);
            } else if (org_voo.equals("Rio de Janeiro")) {
                JOptionPane.showMessageDialog(null, assentovoo2);
            } else{
                JOptionPane.showMessageDialog(null, "Este voo não existe!");
            }

        } else if (op == 3) {
            dest_voo = JOptionPane.showInputDialog(null, "Digite o Número do voo");

            if (dest_voo.equals("Bahia")){
                JOptionPane.showMessageDialog(null, assentovoo1);
            } else if (dest_voo.equals("Santa Catarina")) {
                JOptionPane.showMessageDialog(null, assentovoo2);
            } else{
                JOptionPane.showMessageDialog(null, "Este voo não existe!");
            }

        }else {
            JOptionPane.showMessageDialog(null, "Insira um valor valido!");
            x = JOptionPane.showInputDialog(null, "Escolha uma das seguintes opções:\n1- Consultar por Número do voo\n2- Consultar por Origem do voo\n3- Consultar por Destino do voo");
            op = Integer.parseInt(x);
        }
    }
    public static void reservar(){
        String x = "";
        int num_voo = 0, esc = 0;

        x = JOptionPane.showInputDialog(null, "Digite o número do voo que deseja reservar");
        num_voo = Integer.parseInt(x);

        if (num_voo == 111){
            if(assentosvoo1[0].equals("1[x]") && assentosvoo1[1].equals("2[x]") && assentosvoo1[2].equals("3[x]") && assentosvoo1[3].equals("4[x]") && assentosvoo1[4].equals("5[x]") && assentosvoo1[5].equals("6[x]")){
                JOptionPane.showMessageDialog(null,"Voo está lotado");
            }else{
                x = JOptionPane.showInputDialog(null, assentovoo1+"\n\n\nEscolha um ascento livre para reservar\n");
                esc = Integer.parseInt(x);

                if (esc == 1){

                    if (Objects.equals(assentosvoo1[0], "1[ ]")){
                        assentosvoo1[0] = "1[x]";
                        assentovoo1 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo1[0]+" "+assentosvoo1[1]+"\n"+assentosvoo1[2]+" "+assentosvoo1[3]+"\n"+assentosvoo1[4]+" "+assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[0], "1[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 2) {
                    if (Objects.equals(assentosvoo1[1], "2[ ]")){
                        assentosvoo1[1] = "2[x]";
                        assentovoo1 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo1[0]+" "+assentosvoo1[1]+"\n"+assentosvoo1[2]+" "+assentosvoo1[3]+"\n"+assentosvoo1[4]+" "+assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[1], "2[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 3) {
                    if (Objects.equals(assentosvoo1[2], "3[ ]")) {
                        assentosvoo1[2] = "3[x]";
                        assentovoo1 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo1[0]+" "+assentosvoo1[1]+"\n"+assentosvoo1[2]+" "+assentosvoo1[3]+"\n"+assentosvoo1[4]+" "+assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[2], "3[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 4) {
                    if (Objects.equals(assentosvoo1[3], "4[ ]")) {
                        assentosvoo1[3] = "4[x]";
                        assentovoo1 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo1[0]+" "+assentosvoo1[1]+"\n"+assentosvoo1[2]+" "+assentosvoo1[3]+"\n"+assentosvoo1[4]+" "+assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[3], "4[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 5) {
                    if (Objects.equals(assentosvoo1[4], "5[ ]")) {
                        assentosvoo1[4] = "5[x]";
                        assentovoo1 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo1[0]+" "+assentosvoo1[1]+"\n"+assentosvoo1[2]+" "+assentosvoo1[3]+"\n"+assentosvoo1[4]+" "+assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[4], "5[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 6) {
                    if (Objects.equals(assentosvoo1[5], "6[ ]")) {
                        assentosvoo1[5] = "6[x]";
                        assentovoo1 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo1[0]+" "+assentosvoo1[1]+"\n"+assentosvoo1[2]+" "+assentosvoo1[3]+"\n"+assentosvoo1[4]+" "+assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[5], "6[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Esse lugar não existe no voo");
                }
            }

//realizando reserva no segundo voo
        } else if (num_voo == 222) {
            if(assentosvoo2[0].equals("1[x]") && assentosvoo2[1].equals("2[x]") && assentosvoo2[2].equals("3[x]") && assentosvoo2[3].equals("4[x]") && assentosvoo2[4].equals("5[x]") && assentosvoo2[5].equals("6[x]")){
                JOptionPane.showMessageDialog(null,"Voo está lotado");
            }else {

                x = JOptionPane.showInputDialog(null, assentovoo2+"\n\n\nEscolha um ascento livre para reservar\n");
                esc = Integer.parseInt(x);

                if (esc == 1){
                    if (Objects.equals(assentosvoo2[0], "1[ ]")){
                        assentosvoo2[0] = "1[x]";
                        assentovoo2 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[0], "1[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 2) {
                    if (Objects.equals(assentosvoo2[1], "2[ ]")){
                        assentosvoo2[1] = "2[x]";
                        assentovoo2 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[1], "2[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 3) {
                    if (Objects.equals(assentosvoo2[2], "3[ ]")) {
                        assentosvoo2[2] = "3[x]";
                        assentovoo2 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[2], "3[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 4) {
                    if (Objects.equals(assentosvoo2[3], "4[ ]")) {
                        assentosvoo2[3] = "4[x]";
                        assentovoo2 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[3], "4[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 5) {
                    if (Objects.equals(assentosvoo2[4], "5[ ]")) {
                        assentosvoo2[4] = "5[x]";
                        assentovoo2 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[4], "5[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 6) {
                    if (Objects.equals(assentosvoo2[5], "6[ ]")) {
                        assentosvoo2[5] = "6[x]";
                        assentovoo2 = "Este é o voo: 111\nOrigem: São Paulo\nDestino: Bahia\n\n"+assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[5], "6[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Esse lugar não existe no voo");
                }
            }

        } else{
            JOptionPane.showMessageDialog(null, "Este voo não existe!");
        }

    }
}
