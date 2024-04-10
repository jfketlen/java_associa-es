package modeloassociacao;


public class Cargo {
    private String nome;
    private Gratificacao gratificacao;
    private Atribuicao atribuicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public Gratificacao getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Gratificacao gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Atribuicao getAtribuicao() {
        return atribuicao;
    }
    
     public void setAtribuicao(Atribuicao atribuicao) {
        this.atribuicao = atribuicao;
    }
    
    public Cargo(String nome, Gratificacao gratificacao, Atribuicao atribuicao){
        this.nome = nome;
        this.gratificacao = gratificacao;
        this.atribuicao = atribuicao;
    }
    
    
    public String toString(){
        return  "\n-------------------------------------" +
                "\n Nome: " + getNome() +
                "\n Gratificação: " + getGratificacao() +
                "\n Atribuição: " + getAtribuicao();
    }
}
