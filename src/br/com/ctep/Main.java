package br.com.ctep;

import br.com.ctep.telas.FrameHome;
import br.com.ctep.telas.FrameLogin;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    private static JFrame frameLogin;
    private static JFrame frameHome;

    public static void main(String[] args){

        frameLogin = new JFrame("Secretaria CTEP");
        frameLogin.setContentPane(new FrameLogin().panel);
        frameLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameLogin.pack();
        frameLogin.setSize(400, 300);
        frameLogin.setResizable(false);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setVisible(true);
        frameLogin.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(confirmacao == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });


        frameHome = new JFrame("Secretaria CTEP");
        frameHome.setContentPane(new FrameHome().panel);
        frameHome.pack();
        frameHome.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameHome.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frameHome.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(confirmacao == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });

    }

    public static void abreJanelaPrincipal(){

        frameHome.setVisible(true);
    }


}
