package br.com.ctep.telas;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by arthur on 30/06/17.
 */
public class FrameHome{
    public JPanel panel;

    private JLabel cadastrarAlunoLabel;
    private JLabel editarAlunoLabel;
    private JLabel consultarAlunoLabel;
    private JLabel excluirAlunoLabel;
    private JPanel alunosPanel;
    private JPanel coordenacaoPanel;
    private JPanel relatoriosPanel;


    public FrameHome(){
        cadastrarAlunoLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cadastrarAlunoLabel.setText("<html><font color='blue'>" + cadastrarAlunoLabel.getText() + "</font></html>");
            }
        });

    }
}
