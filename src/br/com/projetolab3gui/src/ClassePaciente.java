/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetolab3gui.src;

/**
 *
 * @author Raul
 */
public class ClassePaciente {

    //Atributos
    int idPaciente;
    String nomeCompleto;
    String dataCadastro;
    String diaNasc;
    String mesNasc;
    String anoNasc;
    String dataNascimento;
    String idade;
    String nomePai;
    String nomeMae;
    String sexo;
    String estadoCivil;
    String rg;
    String cpf;
    String profissao;
    String empresa;
    String endereco;
    Integer numeroCasa;
    String cep;
    String complemento;
    String bairro;
    String cidade;
    String estado;
    String telCelular;
    String telResidencial;
    String telRecado;
    String comentario;

    //Construtores
    public ClassePaciente(int idPaciente, String nomeCompleto, String dataCadastro, String diaNasc, String mesNasc, String anoNasc, String dataNascimento, String idade, String nomePai, String nomeMae, String sexo, String estadoCivil, String rg, String cpf, String profissao, String empresa, String endereco, Integer numeroCasa, String cep, String complemento, String bairro, String cidade, String estado, String telCelular, String telResidencial, String telRecado, String comentario) {
        this.idPaciente = idPaciente;
        this.nomeCompleto = nomeCompleto;
        this.dataCadastro = dataCadastro;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.rg = rg;
        this.cpf = cpf;
        this.profissao = profissao;
        this.empresa = empresa;
        this.endereco = endereco;
        this.numeroCasa = numeroCasa;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = cidade;
        this.telCelular = telCelular;
        this.telResidencial = telResidencial;
        this.telRecado = telRecado;
        this.comentario = comentario;

    }

    public ClassePaciente() {
    }

    //Getters and Setters
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(Integer numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    public String getTelRecado() {
        return telRecado;
    }

    public void setTelRecado(String telRecado) {
        this.telRecado = telRecado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(String diaNasc) {
        this.diaNasc = diaNasc;
    }

    public String getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(String mesNasc) {
        this.mesNasc = mesNasc;
    }

    public String getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(String anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     *
     * @param id
     * @return
     */
}
