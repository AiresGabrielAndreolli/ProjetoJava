public class Cliente extends Pessoa implements iPessoa{
    private String carro;
    private String placa;

    //construtor
    public Cliente(String nome, int idade, double cpf, String carro, String placa) {
        super(nome, idade, cpf);
        this.carro = carro;
        this.placa = placa;
    }

    //get and set
    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    //mostra dados
    @Override
    public void mostraDados() {
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("CPF: "+getCpf());
        System.out.println("Carro: "+this.carro);
        System.out.println("Placa: "+this.placa);
    }
}
