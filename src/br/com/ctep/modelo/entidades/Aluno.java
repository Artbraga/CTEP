package br.com.ctep.modelo.entidades;

import java.util.Calendar;

public class Aluno {
    private String nome;
    private Calendar dataDeNascimento;
    private String cpf;
    private String rg;
    private String orgaoEmissorRg;
    private String nomePai;
    private String nomeMae;

    private String email;
    private String telefone;
    private String celular;

    private Endereco enderecoAluno;

    private Curso curso;
    private Turma turma;
    private Calendar dataDeMatricula;
    private Calendar validade;
    private Boolean emitirNotaFiscal;

    private String cursoAnterior;
    private String matricula;

    private String informacoesAdicionais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoEmissorRg() {
        return orgaoEmissorRg;
    }

    public void setOrgaoEmissorRg(String orgaoEmissorRg) {
        this.orgaoEmissorRg = orgaoEmissorRg;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEndereco(Endereco endereco) {
        this.enderecoAluno = endereco;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Calendar getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Calendar dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }

    public Calendar getValidade() {
        return validade;
    }

    public void setValidade(Calendar validade) {
        this.validade = validade;
    }

    public Boolean getEmitirNotaFiscal() {
        return emitirNotaFiscal;
    }

    public void setEmitirNotaFiscal(Boolean emitirNotaFiscal) {
        this.emitirNotaFiscal = emitirNotaFiscal;
    }

    public String getCursoAnterior() {
        return cursoAnterior;
    }

    public void setCursoAnterior(String cursoAnterior) {
        this.cursoAnterior = cursoAnterior;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;

        Aluno aluno = (Aluno) o;

        return getMatricula() != null ? getMatricula().equals(aluno.getMatricula()) : aluno.getMatricula() == null;
    }

    @Override
    public int hashCode() {
        return getMatricula() != null ? getMatricula().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", orgaoEmissorRg='" + orgaoEmissorRg + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", celular='" + celular + '\'' +
                ", enderecoAluno=" + enderecoAluno.toString() +
                ", curso=" + curso +
                ", turma=" + turma +
                ", dataDeMatricula=" + dataDeMatricula +
                ", validade=" + validade +
                ", emitirNotaFiscal=" + emitirNotaFiscal +
                ", cursoAnterior='" + cursoAnterior + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
