import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList <Cliente> listaCliente = new ArrayList<>();
        ArrayList <Funcionario> listaFunc = new ArrayList<>();
        ArrayList <Servico> listaServ = new ArrayList<>();
        Scanner plinio = new Scanner(System.in);

        Cliente c1 = new Cliente("Mateus",16,560,"Fusca","mmm");
        Cliente c2 = new Cliente("Gabriel",18,483,"Gol","ggg");
        Cliente c3 = new Cliente("Pamela",20,588,"Corsa","ppp");
        listaCliente.add(c1);
        listaCliente.add(c2);
        listaCliente.add(c3);

        Servico s1 = new Servico(01,"Troca de Oleo",200,20,"Lata de Oleo","Zé");
        Servico s2 = new Servico(02,"Troca de Pneu",1000,100,"Pneus","Zé");
        Servico s3 = new Servico(03,"Troca de Parachoque",500,50,"Parachoque","Zé");
        listaServ.add(s1);
        listaServ.add(s2);
        listaServ.add(s3);

        Funcionario f1 = new Funcionario("Zé",44,90,1500,"Mecânica");
        listaFunc.add(f1);

        System.out.println("Seja bem vindo ao nosso sistema!");
        System.out.println("Digite 'enter' para continuar");
        plinio.nextLine();
        while(true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Cadastro");
            System.out.println("2- Remoção");
            System.out.println("3- Busca de Clientes");
            System.out.println("4- Busca de Serviços");
            System.out.println("5- Métodos Cliente");
            System.out.println("6- Métodos Serviço");
            System.out.println("");
            int i = plinio.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println("Cadastro de que?");
                    System.out.println("1- Cliente");
                    System.out.println("2- Funcionário");
                    System.out.println("3- Serviço");
                    System.out.println("");
                    int z = plinio.nextInt();
                    switch(z)
                    {
                        case 1:
                            //cadastro de cliente
                            String nomeCli;
                            int idadeCli;
                            double cpfCli;
                            String carro;
                            String placa;
                            System.out.println("Nome: ");
                            nomeCli = plinio.next();
                            System.out.println("Idade: ");
                            idadeCli = plinio.nextInt();
                            System.out.println("CPF: ");
                            cpfCli = plinio.nextDouble();
                            System.out.println("Carro: ");
                            carro = plinio.next();
                            System.out.println("Placa: ");
                            placa = plinio.next();
                            Cliente c4 = new Cliente(nomeCli,idadeCli,cpfCli,carro,placa);
                            listaCliente.add(c4);
                        break;

                        case 2:
                            //cadastro de funcionário
                            String nomeFunc;
                            int idadeFunc;
                            double cpfFunc;
                            double salarioFixo;
                            double acrescimoServico;
                            String setor;
                            System.out.println("Nome: ");
                            nomeFunc = plinio.next();
                            System.out.println("Idade: ");
                            idadeFunc = plinio.nextInt();
                            System.out.println("CPF: ");
                            cpfFunc = plinio.nextInt();
                            System.out.println("Salario fixo: ");
                            salarioFixo = plinio.nextDouble();
                            System.out.println("Setor: ");
                            setor = plinio.next();
                            Funcionario f2 = new Funcionario(nomeFunc,idadeFunc,cpfFunc,salarioFixo,setor);
                            listaFunc.add(f2);
                        break;

                        case 3:
                            // cadastro de serviços
                            int codigoServico;
                            String descricao;
                            double preco;
                            double comissao;
                            String pecas;
                            String funcionario;

                            System.out.println("Cod. Serviço: ");
                            codigoServico = plinio.nextInt();
                            System.out.println("Descrição: ");
                            descricao = plinio.next();
                            System.out.println("Preço: ");
                            preco = plinio.nextDouble();
                            System.out.println("Comissão: ");
                            comissao = plinio.nextDouble();
                            System.out.println("Peças: ");
                            pecas = plinio.next();
                            System.out.println("Funcionário: ");
                            funcionario = plinio.next();
                            Servico s4 = new Servico(codigoServico, descricao, preco, comissao, pecas, funcionario);
                            listaServ.add(s4);




                    }
                break;

                case 2:
                    System.out.println("Remoção de que?");
                    System.out.println("1- Cliente");
                    System.out.println("2- Funcionário");
                    System.out.println("3- Serviço");
                    System.out.println("");
                    z = plinio.nextInt();
                    switch(z)
                    {
                        case 1:
                            //remoção de cliente
                            String nomeCliente;

                            System.out.println("Digite o nome exato do cliente: ");
                            nomeCliente = plinio.next();

                            for (Cliente c : listaCliente) {
                                if (c.getNome().equals(nomeCliente)) {
                                    listaCliente.remove(c);
                                    System.out.println("Cliente removido!");
                                    break;
                                }
                            }
                        break;

                        case 2:
                            //remoção de funcionário
                            String nomeFuncionario;

                            System.out.println("Digite o nome exato do funcionario: ");
                            nomeFuncionario = plinio.next();

                            for (Cliente c : listaCliente) {
                                if (c.getNome().equals(nomeFuncionario)){
                                    listaCliente.remove(c);
                                    System.out.println("Funcionário removido!");
                                     break;
                                }
                            }
                        break;

                        case 3:
                            //remoção de serviço
                            int codigoServico;

                            System.out.println("Digite o código do serviço: ");
                            codigoServico = plinio.nextInt();

                            for (Servico s: listaServ) {
                                if (s.getCodServico() == codigoServico) {
                                    listaServ.remove(s);
                                    System.out.println("Serviço removido!");
                                    break;
                                }
                            }



                    }



                break;


                case 3:
                    //busca de clientes
                    String nomeCli;

                    System.out.println("Nome:");
                    nomeCli = plinio.next();

                    if(listaCliente.isEmpty()){
                        System.out.println("Não há nenhum cliente cadastrado!");
                    }
                    for (Cliente cliente : listaCliente) {
                        if (cliente.getNome().startsWith(nomeCli)) {
                            System.out.println("---------------------------------------");
                            System.out.println("Nome: " + cliente.getNome());
                            System.out.println("Cpf: " + cliente.getCpf());
                            System.out.println("Idade: " + cliente.getIdade());
                            System.out.println("Carro: " + cliente.getCarro());
                            System.out.println("Placa: " + cliente.getPlaca());
                            System.out.println("---------------------------------------");
                        }
                        else{
                            System.out.println("Cliente não encontrado!");
                        }
                        break;
                    }


                break;

                case 4:
                    //busca de serviços
                    int codServico;

                    System.out.println("Código:");
                    codServico = plinio.nextInt();

                    if(listaServ.isEmpty()){
                        System.out.println("Não há nenhum serviço cadastrado!");
                    }
                    for (Servico servico : listaServ) {
                        if (servico.getCodServico() == codServico) {
                            System.out.println("---------------------------------------");
                            System.out.println("Cod. Serviço: " + servico.getCodServico());
                            System.out.println("Descrição: " + servico.getDescricao());
                            System.out.println("Funcionário: " + servico.getFuncionario());
                            System.out.println("Peças: " + servico.getPecas());
                            System.out.println("Comissão: " + servico.getComissao());
                            System.out.println("Preço: " + servico.getPreco());
                            System.out.println("---------------------------------------");
                        }
                        else{
                            System.out.println("Serviço não encontrado!");
                        }
                      break;
                    }

                break;

                case 5:
                    if(listaCliente.isEmpty()){
                        System.out.println("Não há nenhum cliente cadastrado!");
                        break;
                    }
                    int u = 0;
                    System.out.println("1- Mais velho");
                    System.out.println("2- Mais novo");
                    System.out.println("3- Qtd 60+");
                    System.out.println("4- Qtd -18");
                    System.out.println("5- Idade média dos clientes");
                    System.out.println("");
                    u = plinio.nextInt();
                    switch(u)
                    {
                        case 1:
                            int maisVelho = 0;
                            for(Cliente c: listaCliente){
                                if(c.getIdade()>maisVelho){
                                    maisVelho = c.getIdade();
                                }
                            }
                            for(Cliente c: listaCliente){
                                if(c.getIdade() == maisVelho){
                                    System.out.println("O cliente mais velho é "+c.getNome()+" e tem "+c.getIdade()+" anos.");
                                }
                            }

                        break;

                        case 2:
                            int maisNovo = 300;
                            for(Cliente c: listaCliente){
                                if(c.getIdade()<maisNovo){
                                    maisNovo = c.getIdade();
                                }
                            }
                            for(Cliente c: listaCliente){
                                if(c.getIdade() == maisNovo){
                                    System.out.println("O cliente mais novo é "+c.getNome()+" e tem "+c.getIdade()+" anos.");
                                }
                            }
                        break;

                        case 3:
                            int qtdMaiorSes = 0;
                            for(Cliente c: listaCliente){
                                if(c.getIdade()>60){
                                    qtdMaiorSes+=1;
                                }
                            }
                            System.out.println("Tem "+qtdMaiorSes+" clientes maiores de 60 anos na base de dados.");
                        break;

                        case 4:
                            int qtdMenorDezo = 0;
                            for(Cliente c: listaCliente){
                                if(c.getIdade()<18){
                                    qtdMenorDezo+=1;
                                }
                            }
                            System.out.println("Tem "+qtdMenorDezo+" cliente(s) menores de 18 anos na base de dados.");
                        break;

                        case 5:
                            int qtdCliente = 0;
                            int somaIdade = 0;
                            float mediaIdade = 0;
                            for(Cliente c: listaCliente){
                                qtdCliente+=1;
                                somaIdade += c.getIdade();
                            }
                            mediaIdade = somaIdade/qtdCliente;
                            System.out.println("Média das idades dos clientes é: "+mediaIdade);

                    }
                break;

                case 6:
                    if(listaServ.isEmpty()){
                        System.out.println("Não há nenhum serviço cadastrado!");
                        break;
                    }
                    int y = 0;
                    System.out.println("1- Mais caro");
                    System.out.println("2- Mais barato");
                    System.out.println("3- Média do preço");
                    System.out.println("4- Serviços acima da média");
                    System.out.println("");
                    y = plinio.nextInt();
                    switch(y)
                    {
                        case 1:
                            double maisCaro = 0;
                            for(Servico s: listaServ){
                                if(s.getPreco()>maisCaro){
                                    maisCaro = s.getPreco();
                                }
                            }
                            for(Servico s: listaServ){
                                if(s.getPreco() == maisCaro){
                                    System.out.println("O serviço mais caro é "+s.getDescricao()+" e custa "+s.getPreco()+" reais.");
                                }
                            }

                            break;

                        case 2:
                            double maisBarato = 9999999;
                            for(Servico s: listaServ){
                                if(s.getPreco()<maisBarato){
                                    maisBarato = s.getPreco();
                                }
                            }
                            for(Servico s: listaServ){
                                if(s.getPreco() == maisBarato){
                                    System.out.println("O serviço mais barato é "+s.getDescricao()+" e custa "+s.getPreco()+" reais.");
                                }
                            }
                            break;

                        case 3:
                            int qtdServicos = 0;
                            double somaPrecoServicos = 0;
                            double mediaServicos = 0;
                            for(Servico s: listaServ){
                                qtdServicos+=1;
                                somaPrecoServicos += s.getPreco();
                            }
                            mediaServicos = somaPrecoServicos/qtdServicos;
                            System.out.println("Média dos preços dos serviços é: "+mediaServicos);
                            break;

                        case 4:
                            //mesmo calculo de media do ultimo case ( com alteraçoes nos nomes das variaveis)
                            int qtd = 0;
                            double soma = 0;
                            double media = 0;
                            for(Servico s: listaServ){
                                qtd+=1;
                                soma += s.getPreco();
                            }
                            mediaServicos = soma/qtd;

                            int qtdMaiorMedia = 0;
                            for(Servico s: listaServ){
                                if(s.getPreco()>mediaServicos){
                                    qtdMaiorMedia+=1;
                                }
                            }
                            System.out.println("A quantidade de serviços com preços acima da média é: "+qtdMaiorMedia);
                            break;

                    }




            }
            Thread.sleep(2000);
            System.out.println("\n\n\n\n");
        }
    }
}

//tirando nome do danthe