public class Funcionario extends Pessoa implements iPessoa{
    private double salarioFixo;
    private String setor;


    //construtor
    public Funcionario(String nome, int idade, double cpf, double salarioFixo, String setor) {
        super(nome, idade, cpf);
        this.salarioFixo = salarioFixo;
        this.setor = setor;
    }

    //get and set
    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    //mostra dados
    @Override
    public void mostraDados() {
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("CPF: "+getCpf());
        System.out.println("Salario fixo: "+this.salarioFixo);
        System.out.println("Setor: "+this.setor);
    }
}
