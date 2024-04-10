package modelo_associacao_3;


public class Editora {
    private String codigo, nome;
    private Endereco endereco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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
    
    public Editora(String nome, String codigo, Endereco endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String toString(){
        return "\n Nome: " + getNome() +
                "\n Código: " + getCodigo() +
                "\n Endereço: " + getEndereco();
    } 
}
