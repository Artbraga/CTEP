package br.com.ctep.modelo.DAO;

import br.com.ctep.modelo.entidades.Turma;

import java.util.List;

public class DAOTurma {
    public List<Turma> getListaTurmas(){
        return Dados.listaTurmas;
    }

    public boolean salvarTurma(Turma turma){
        if(turma.getCodigo() == null){
            Integer codigo = Dados.listaAlunos.size() +1;
            turma.setCodigo(codigo.toString());
            Dados.listaTurmas.add(turma);
        }
        return true;
    }

    public boolean removerTurma(Turma turma){
        Dados.listaTurmas.remove(turma);
        return true;
    }
}
