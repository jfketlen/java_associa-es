package modeloassociacao;

public class Venda {
   private double valor;
   private Funcionario funcionario;
   private Produto produto;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
   
   public Venda(double valor, Funcionario funcionario, Produto produto){
       this.valor = valor;
       this.funcionario = funcionario;
       this.produto = produto;
   }
   
   public String toString(){
       return "\n-------------------------------------" +
               "\n Valor: " + getValor() +
               "\n Funcionário: " + getFuncionario() +
               "\n Produto: " + getProduto();
   }
}
