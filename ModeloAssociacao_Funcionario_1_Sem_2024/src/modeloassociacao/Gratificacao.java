package modeloassociacao;


public class Gratificacao {
    private double valor;
    private int quantidade;
    private String validade;

    public double getValor() {
        return valor;
    }

    public void setValor(double Valor) {
        this.valor = Valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
    public Gratificacao(double valor, int quantidade, String validade){
        this.valor = valor;
        this.quantidade = quantidade;
        this.validade = validade;
    }
    
    public String toString(){
        return  "\n-------------------------------------" +
                "\n Valor: " + getValor() +
                "\n Quantidade: " + getQuantidade() +
                "\n Validade: " + getValidade();
    }
}
