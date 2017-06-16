package br.com.ctep.modelo.DAO;

import br.com.ctep.modelo.entidades.Aluno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;


public class DAOAluno {
    public List<Aluno> getListaAlunos(){
        return Dados.listaAlunos;
    }

    public boolean salvarAluno(Aluno aluno){
        if(aluno.getMatricula() == null){
            Integer matricula = Dados.listaAlunos.size() +1;
            aluno.setMatricula(matricula.toString());
            Dados.listaAlunos.add(aluno);
        }
        return true;
    }

    public boolean removerAluno(Aluno aluno){
        Dados.listaAlunos.remove(aluno);
        return true;
    }


}
