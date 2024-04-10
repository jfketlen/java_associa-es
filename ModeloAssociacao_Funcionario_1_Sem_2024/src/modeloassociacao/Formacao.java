package modeloassociacao;


public class Formacao {
    private String descricao;
    private InstituicaoEnsino instituicaoensino;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public InstituicaoEnsino getInstituicaoensino() {
        return instituicaoensino;
    }

    public void setInstituicaoensino(InstituicaoEnsino instituicaoensino) {
        this.instituicaoensino = instituicaoensino;
    }
    
    public Formacao(String descricao, InstituicaoEnsino instituicaoensino){
        this.descricao = descricao;
        this.instituicaoensino = instituicaoensino;
    }
    
    public String toString(){
        return "\n-------------------------------------" +
                "\n Descrição: " + getDescricao() +
                "\n Instituição de Ensino: " + getInstituicaoensino();
    }
}
