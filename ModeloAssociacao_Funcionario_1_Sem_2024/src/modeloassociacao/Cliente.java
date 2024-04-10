
package modeloassociacao;

public class Cliente {
    private String cpf, nome;
    private Venda venda;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    public Cliente(String cpf, String nome, Venda venda){
        this.cpf = cpf;
        this.nome = nome;
        this.venda = venda;
    }
    
    public String toString(){
        return  "\n-------------------------------------" +
                "\n CPF: " + getCpf() +
                "\n Nome: " + getNome() +
                "\n Venda: " + getVenda();
    }
}
