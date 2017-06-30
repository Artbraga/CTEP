package br.com.ctep.telas;

import br.com.ctep.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class FrameLogin {

    public JPanel panel;
    private JButton fecharButton;
    private JButton entrarButton;
    private JTextField loginTextField;
    private JPasswordField senhaPasswordField;
    public FrameLogin() {
        entrarButton.addActionListener((event) -> {
                String login = loginTextField.getText();
                char[] senha = senhaPasswordField.getPassword();
                if(senha.length == 0) {
                    JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), "Digite uma senha!", "Login", JOptionPane.DEFAULT_OPTION);
                    senhaPasswordField.requestFocus();
                    return;
                }
                LoginEnum logado = verificaLogin(login, senha);
                if(logado.equals(LoginEnum.LOGIN_INEXISTENTE)){
                    loginTextField.setText("");
                    loginTextField.requestFocus();
                    senhaPasswordField.setText("");
                    JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), "Login incorreto!", "Login", JOptionPane.DEFAULT_OPTION);
                }
                else if(logado.equals(LoginEnum.SENHA_INCORRETA)){
                    senhaPasswordField.setText("");
                    senhaPasswordField.requestFocus();

                    JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), "Senha incorreta!", "Login", JOptionPane.DEFAULT_OPTION);
                }
                else {
                    Main.abreJanelaPrincipal();
                }
            });
        fecharButton.addActionListener((event) -> {
                int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(confirmacao == JOptionPane.YES_OPTION)
                    System.exit(0);
            });

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

    private enum LoginEnum {
        LOGIN_INEXISTENTE,
        SENHA_INCORRETA,
        LOGIN_CORRETO;
    }
}
