package br.com.ctep.modelo.DAO;

import br.com.ctep.modelo.entidades.Curso;

import java.util.List;

/**
 * Created by arthur on 10/04/17.
 */
public class DAOCurso {
    public List<Curso> getLista(){
        return Dados.listaCursos;
    }

    public boolean salvarCurso(Curso curso){
        if(curso.getCodigo() == null){
            Integer codigo = Dados.listaCursos.size() +1;
            curso.setCodigo(codigo);
            Dados.listaCursos.add(curso);
        }
        return true;
    }

    public boolean removerCurso(Curso curso){
        Dados.listaCursos.remove(curso);
        return true;
    }
}
