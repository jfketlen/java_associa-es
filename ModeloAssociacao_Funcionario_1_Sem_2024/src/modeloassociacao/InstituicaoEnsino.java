package modeloassociacao;


public class InstituicaoEnsino {
    private String nome;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
     public InstituicaoEnsino(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String toString(){
        return "\n-------------------------------------" +
                "\n Nome: " + getNome() +
                "\n Endereço: " + getEndereco();
    }
}
