package br.com.ctep;

import br.com.ctep.telas.JanelaLogin;
import br.com.ctep.telas.JanelaPrincipal;

import javax.swing.*;

/**
 * Created by arthur on 16/06/17.
 */
public class Main {
    public static JanelaPrincipal janelaPrincipal;
    public static JanelaLogin janelaLogin;

    public static void main(String[] args){

        janelaLogin = new JanelaLogin();
        janelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaLogin.setSize(400, 300);
        janelaLogin.setResizable(false);
        janelaLogin.setVisible(true);


        janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //janelaPrincipal.setVisible(true);

    }


}
