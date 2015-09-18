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
public class ClasseAnamnese {

    //atribtos
    //Queixa principal
    int idAnamnese;
    String queixaPrincipal;
    //Questionario da saúde
    int p1SofreDoenca;
    String p1SofreDoencaTxt;
    int p2TratamentoAtualmente;
    String p2TratamentoAtualmenteTxt;
    int p3UsaMedicacao;
    String p3UsaMedicacaoTxt;
    String p4NomeMedicoTxt;
    int p5Gravidez;
    int p6Alergia;
    String p6AlergiaTxt;
    int p7Operado;
    String p7OperadoTxt;
    int p8Cicatrizacao;
    int p9Anestesia;
    int p10Hemorragia;
    //Doenças
    int d1Reumatica;
    int d2Renal;
    int d3Cardiaco;
    int d4Hipertensao;
    int d5Respiratorio;
    int d6Reumatismo;
    int d7Gastrico;
    int d8Diabete;
    int d9Alergico;
    String habito;
    //Antecedentes
    String antecedentesFamiliares;
    //Obs
    String outrasObs;

    //Construtor
    public ClasseAnamnese(int idAnamnese, String queixaPrincipal, int p1SofreDoenca, String p1SofreDoencaTxt, int p2TratamentoAtualmente, String p2TratamentoAtualmenteTxt, int p3UsaMedicacao, String p3UsaMedicacaoTxt, String p4NomeMedicoTxt, int p5Gravidez, int p6Alergia, String p6AlergiaTxt, int p7Operado, String p7OperadoTxt, int p8Cicatrizacao, int p9Anestesia, int p10Hemorragia, int d1Reumatica, int d2Renal, int d3Cardiaco, int d4Hipertensao, int d5Respiratorio, int d6Reumatismo, int d7Gastrico, int d8Diabete, int d9Alergico, String habito, String antecedentesFamiliares, String outrasObs) {
        this.idAnamnese = idAnamnese;
        this.queixaPrincipal = queixaPrincipal;
        this.p1SofreDoenca = p1SofreDoenca;
        this.p1SofreDoencaTxt = p1SofreDoencaTxt;
        this.p2TratamentoAtualmente = p2TratamentoAtualmente;
        this.p2TratamentoAtualmenteTxt = p2TratamentoAtualmenteTxt;
        this.p3UsaMedicacao = p3UsaMedicacao;
        this.p3UsaMedicacaoTxt = p3UsaMedicacaoTxt;
        this.p4NomeMedicoTxt = p4NomeMedicoTxt;
        this.p5Gravidez = p5Gravidez;
        this.p6Alergia = p6Alergia;
        this.p6AlergiaTxt = p6AlergiaTxt;
        this.p7Operado = p7Operado;
        this.p7OperadoTxt = p7OperadoTxt;
        this.p8Cicatrizacao = p8Cicatrizacao;
        this.p9Anestesia = p9Anestesia;
        this.p10Hemorragia = p10Hemorragia;
        this.d1Reumatica = d1Reumatica;
        this.d2Renal = d2Renal;
        this.d3Cardiaco = d3Cardiaco;
        this.d4Hipertensao = d4Hipertensao;
        this.d5Respiratorio = d5Respiratorio;
        this.d6Reumatismo = d6Reumatismo;
        this.d7Gastrico = d7Gastrico;
        this.d8Diabete = d8Diabete;
        this.d9Alergico = d9Alergico;
        this.habito = habito;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.outrasObs = outrasObs;
    }

    ClasseAnamnese() {

    }

    //Getters and Setters
    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public int getP1SofreDoenca() {
        return p1SofreDoenca;
    }

    public void setP1SofreDoenca(int p1SofreDoenca) {
        this.p1SofreDoenca = p1SofreDoenca;
    }

    public String getP1SofreDoencaTxt() {
        return p1SofreDoencaTxt;
    }

    public void setP1SofreDoencaTxt(String p1SofreDoencaTxt) {
        this.p1SofreDoencaTxt = p1SofreDoencaTxt;
    }

    public int getP2TratamentoAtualmente() {
        return p2TratamentoAtualmente;
    }

    public void setP2TratamentoAtualmente(int p2TratamentoAtualmente) {
        this.p2TratamentoAtualmente = p2TratamentoAtualmente;
    }

    public String getP2TratamentoAtualmenteTxt() {
        return p2TratamentoAtualmenteTxt;
    }

    public void setP2TratamentoAtualmenteTxt(String p2TratamentoAtualmenteTxt) {
        this.p2TratamentoAtualmenteTxt = p2TratamentoAtualmenteTxt;
    }

    public int getP3UsaMedicacao() {
        return p3UsaMedicacao;
    }

    public void setP3UsaMedicacao(int p3UsaMedicacao) {
        this.p3UsaMedicacao = p3UsaMedicacao;
    }

    public String getP3UsaMedicacaoTxt() {
        return p3UsaMedicacaoTxt;
    }

    public void setP3UsaMedicacaoTxt(String p3UsaMedicacaoTxt) {
        this.p3UsaMedicacaoTxt = p3UsaMedicacaoTxt;
    }

    public String getP4NomeMedicoTxt() {
        return p4NomeMedicoTxt;
    }

    public void setP4NomeMedicoTxt(String p4NomeMedicoTxt) {
        this.p4NomeMedicoTxt = p4NomeMedicoTxt;
    }

    public int getP5Gravidez() {
        return p5Gravidez;
    }

    public void setP5Gravidez(int p5Gravidez) {
        this.p5Gravidez = p5Gravidez;
    }

    public int getP6Alergia() {
        return p6Alergia;
    }

    public void setP6Alergia(int p6Alergia) {
        this.p6Alergia = p6Alergia;
    }

    public String getP6AlergiaTxt() {
        return p6AlergiaTxt;
    }

    public void setP6AlergiaTxt(String p6AlergiaTxt) {
        this.p6AlergiaTxt = p6AlergiaTxt;
    }

    public int getP7Operado() {
        return p7Operado;
    }

    public void setP7Operado(int p7Operado) {
        this.p7Operado = p7Operado;
    }

    public String getP7OperadoTxt() {
        return p7OperadoTxt;
    }

    public void setP7OperadoTxt(String p7OperadoTxt) {
        this.p7OperadoTxt = p7OperadoTxt;
    }

    public int getP8Cicatrizacao() {
        return p8Cicatrizacao;
    }

    public void setP8Cicatrizacao(int p8Cicatrizacao) {
        this.p8Cicatrizacao = p8Cicatrizacao;
    }

    public int getP9Anestesia() {
        return p9Anestesia;
    }

    public void setP9Anestesia(int p9Anestesia) {
        this.p9Anestesia = p9Anestesia;
    }

    public int getP10Hemorragia() {
        return p10Hemorragia;
    }

    public void setP10Hemorragia(int p10Hemorragia) {
        this.p10Hemorragia = p10Hemorragia;
    }

    public int getD1Reumatica() {
        return d1Reumatica;
    }

    public void setD1Reumatica(int d1Reumatica) {
        this.d1Reumatica = d1Reumatica;
    }

    public int getD2Renal() {
        return d2Renal;
    }

    public void setD2Renal(int d2Renal) {
        this.d2Renal = d2Renal;
    }

    public int getD3Cardiaco() {
        return d3Cardiaco;
    }

    public void setD3Cardiaco(int d3Cardiaco) {
        this.d3Cardiaco = d3Cardiaco;
    }

    public int getD4Hipertensao() {
        return d4Hipertensao;
    }

    public void setD4Hipertensao(int d4Hipertensao) {
        this.d4Hipertensao = d4Hipertensao;
    }

    public int getD5Respiratorio() {
        return d5Respiratorio;
    }

    public void setD5Respiratorio(int d5Respiratorio) {
        this.d5Respiratorio = d5Respiratorio;
    }

    public int getD6Reumatismo() {
        return d6Reumatismo;
    }

    public void setD6Reumatismo(int d6Reumatismo) {
        this.d6Reumatismo = d6Reumatismo;
    }

    public int getD7Gastrico() {
        return d7Gastrico;
    }

    public void setD7Gastrico(int d7Gastrico) {
        this.d7Gastrico = d7Gastrico;
    }

    public int getD8Diabete() {
        return d8Diabete;
    }

    public void setD8Diabete(int d8Diabete) {
        this.d8Diabete = d8Diabete;
    }

    public int getD9Alergico() {
        return d9Alergico;
    }

    public void setD9Alergico(int d9Alergico) {
        this.d9Alergico = d9Alergico;
    }

    public String getHabito() {
        return habito;
    }

    public void setHabito(String habito) {
        this.habito = habito;
    }

    public String getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void setAntecedentesFamiliares(String antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public String getOutrasObs() {
        return outrasObs;
    }

    public void setOutrasObs(String outrasObs) {
        this.outrasObs = outrasObs;
    }

    public int getIdAnamnese() {
        return idAnamnese;
    }

    public void setIdAnamnese(int idAnamnese) {
        this.idAnamnese = idAnamnese;
    }

}
