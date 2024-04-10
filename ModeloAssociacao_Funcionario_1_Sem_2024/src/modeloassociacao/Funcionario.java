package modeloassociacao;


public class Funcionario {
    private int matricula;
    private String nome;
    private Endereco endereco;
    private Salario salario;
    private Cargo cargo;
    private Dependente dependente;
    private Formacao formacao;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    public Funcionario(int matricula, String nome, Endereco endereco, Salario salario, Cargo cargo, Dependente dependente, 
            Formacao formacao){
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.cargo = cargo;
        this.dependente = dependente;
        this.formacao = formacao;
    }
    
    public String toString(){
        return  "\n-------------------------------------" +
                "\n Matrícula: " + getMatricula() +
                "\n Nome: " + getNome() +
                "\n Endereço: " + getEndereco() +
                "\n Salário: " + getSalario() +
                "\n Cargo: " + getCargo() +
                "\n Dependente: " + getDependente() +
                "\n Formação: " + getFormacao();
    }
}
