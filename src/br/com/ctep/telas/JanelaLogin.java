package br.com.ctep.telas;

import br.com.ctep.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class JanelaLogin extends JFrame{

    private enum LoginEnum {
        LOGIN_INEXISTENTE,
        SENHA_INCORRETA,
        LOGIN_CORRETO;
    }

    private JTextField loginTextField;
    private JPasswordField senhaPasswordField;
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
        loginTextField = new JTextField(15);
        painelLogin.add(loginLabel);
        painelLogin.add(loginTextField);
        painelLogin.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel painelSenha = new JPanel();
        painelSenha.setLayout(new FlowLayout());
        JLabel senhaLabel = new JLabel("Senha:\t");
        senhaPasswordField = new JPasswordField(15);
        painelSenha.add(senhaLabel);
        painelSenha.add(senhaPasswordField);

        JPanel painelCorpo = new JPanel();
        painelCorpo.setLayout(new FlowLayout());
        painelCorpo.add(painelLogin);
        painelCorpo.add(painelSenha);
        painelCorpo.setAlignmentX(Component.LEFT_ALIGNMENT);

        EntrarAction entrarAction = new EntrarAction();
        FecharAction fecharAction = new FecharAction();

        //Botoes
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        JButton entrar = new JButton("Entrar");
        entrar.addActionListener(entrarAction);
        JButton fechar = new JButton("Fechar");
        fechar.addActionListener(fecharAction);
        painelBotoes.add(entrar);
        painelBotoes.add(fechar);

        add(painelTitulo, BorderLayout.NORTH);
        add(painelCorpo, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }

    private class EntrarAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String login = loginTextField.getText();
            char[] senha = senhaPasswordField.getPassword();
            if(senha.length == 0) {
                JOptionPane.showConfirmDialog(getRootPane(), "Digite uma senha!", "Login", JOptionPane.DEFAULT_OPTION);
                senhaPasswordField.requestFocus();
                return;
            }
            LoginEnum logado = verificaLogin(login, senha);
            if(logado.equals(LoginEnum.LOGIN_INEXISTENTE)){
                loginTextField.setText("");
                loginTextField.requestFocus();
                senhaPasswordField.setText("");
                JOptionPane.showConfirmDialog(getRootPane(), "Login incorreto!", "Login", JOptionPane.DEFAULT_OPTION);
            }
            else if(logado.equals(LoginEnum.SENHA_INCORRETA)){
                senhaPasswordField.setText("");
                senhaPasswordField.requestFocus();

                JOptionPane.showConfirmDialog(getRootPane(), "Senha incorreta!", "Login", JOptionPane.DEFAULT_OPTION);
            }
            else {
                Main.abreJanelaPrincipal();
            }

        }
    }

    private class FecharAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if(confirmacao == JOptionPane.YES_OPTION)
                System.exit(0);
        }
    }

    private LoginEnum verificaLogin(String login, char[] senha){
        if(login.equalsIgnoreCase("admin")) {
            if (Arrays.equals(senha, "1234".toCharArray()))
                return LoginEnum.LOGIN_CORRETO;
            else
                return LoginEnum.SENHA_INCORRETA;
        }
        try{
            Scanner input = new Scanner(new FileInputStream(new File("arq.bin")));
            while (input.hasNext()){
                String loginLido = input.nextLine();
                String senhaLida = input.nextLine();
                if(loginLido.equalsIgnoreCase(login)){
                    if(Arrays.equals(senha, senhaLida.toCharArray())) return LoginEnum.LOGIN_CORRETO;
                    else return LoginEnum.SENHA_INCORRETA;
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return LoginEnum.LOGIN_INEXISTENTE;
    }

}
