package br.com.projetolab3gui.src;

public class ClasseCadastro {

    int id;
    String nomeCompleto;
    String cpf;

    ClassePaciente paciente = new ClassePaciente();
    ClasseAnamnese anamnese = new ClasseAnamnese();

    //Construtor
    public ClasseCadastro(int id, String nomeCompleto, String cpf) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
    }

    ClasseCadastro() {

    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ClassePaciente getPaciente() {
        return paciente;
    }

    public void setPaciente(ClassePaciente paciente) {
        this.paciente = paciente;
    }

    public ClasseAnamnese getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(ClasseAnamnese anamnese) {
        this.anamnese = anamnese;
    }

}
