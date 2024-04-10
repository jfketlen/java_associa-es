package modeloassociacao;

public class TesteFuncionario {
    public static void main(String[]args){
        
        System.out.println("DADOS DA VENDA");
        
        Venda v = new Venda(100.0,
        new Funcionario(5678, "Pedro",
        new Endereco("Rua Exemplo",11,
        new Cep(71000022)),
        new Salario(1100.0),
        new Cargo("Atendente Comercial",
        new Gratificacao(60.0, 2, "30/05/2024"),
        new Atribuicao("Vender")),
        new Dependente(0),
        new Formacao("Ensino Médio",
        new InstituicaoEnsino("Escola de Ensino Médio",
        new Endereco("Avenida Central",10,
        new Cep(81024569))))),
        new Produto(11223, "Refrigerante", 8.0));
        
        System.out.println(v);
        
    }
}
