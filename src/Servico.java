public class Servico {
    private String descricao;
    private double preco;
    private double comissao;
    private String pecas;
    private String funcionario;


    //construtor
    public Servico(String descricao, double preco, double comissao, String pecas, String funcionario) {
        this.descricao = descricao;
        this.preco = preco;
        this.comissao = comissao;
        this.pecas = pecas;
        this.funcionario = funcionario;
    }

    //get and set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getPecas() {
        return pecas;
    }

    public void setPecas(String pecas) {
        this.pecas = pecas;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
}
