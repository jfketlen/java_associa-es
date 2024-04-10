package modeloassociacao;


public class Salario {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Salario(double valor){
        this.valor = valor;
    }
    
    public String toString(){
        return  "\n-------------------------------------" +
                "\n Valor: " + getValor();
    }
}
