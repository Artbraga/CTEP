package br.com.ctep.telas;

import com.sun.tools.javac.comp.Flow;

import javax.swing.*;
import java.awt.*;

public class JanelaLogin extends JFrame{

    public JanelaLogin(){
        super("Login CTEP");
        criarFormulario();

    }

    private void criarFormulario(){
        setLayout(new BorderLayout());

        //Titulo
        JPanel painelTitulo = new JPanel();
        painelTitulo.setLayout(new FlowLayout());
        JLabel titulo = new JLabel("Entrar no sistema");
        titulo.setFont(new Font("Arial Black", Font.BOLD, 20));
        painelTitulo.add(titulo);

        //Corpo
        JPanel painelLogin = new JPanel();
        painelLogin.setLayout(new FlowLayout());
        JLabel loginLabel = new JLabel("Login:\t");
        JTextField loginTextField = new JTextField(15);
        painelLogin.add(loginLabel);
        painelLogin.add(loginTextField);
        painelLogin.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel painelSenha = new JPanel();
        painelSenha.setLayout(new FlowLayout());
        JLabel senhaLabel = new JLabel("Senha:\t");
        JTextField senhaTextField = new JTextField(15);
        painelSenha.add(senhaLabel);
        painelSenha.add(senhaTextField);

        JPanel painelCorpo = new JPanel();
        painelCorpo.setLayout(new FlowLayout());
        painelCorpo.add(painelLogin);
        painelCorpo.add(painelSenha);
        painelCorpo.setAlignmentX(Component.LEFT_ALIGNMENT);


        //Botoes
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        JButton entrar = new JButton("Entrar");
        JButton fechar = new JButton("Fechar");
        painelBotoes.add(entrar);
        painelBotoes.add(fechar);

        add(painelTitulo, BorderLayout.NORTH);
        add(painelCorpo, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }

}
