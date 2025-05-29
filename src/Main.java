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

        System.out.println("Seja bem vindo ao nosso sistema!");
        System.out.println("Digite 'enter' para continuar");
        plinio.nextLine();
        while(true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Cadastro");
            System.out.println("2- Remoção");
            System.out.println("3- Busca de Clientes");
            System.out.println("4- Busca de Serviços");
            System.out.println("");
            int i = plinio.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println("Cadastro degue?");
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
                            Cliente c1 = new Cliente(nomeCli,idadeCli,cpfCli,carro,placa);
                            listaCliente.add(c1);
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
                            Funcionario f1 = new Funcionario(nomeFunc,idadeFunc,cpfFunc,salarioFixo,setor);
                            listaFunc.add(f1);
                            f1.mostraDados();
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
                            Servico s1 = new Servico(codigoServico, descricao, preco, comissao, pecas, funcionario);
                            listaServ.add(s1);




                    }
                break;

                case 2:
                    System.out.println("Remoção degue?");
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
                                if (c.getNome().equals(nomeCliente))
                                    listaCliente.remove(c);
                            }

                        case 2:
                            //remoção de funcionário
                            String nomeFuncionario;

                            System.out.println("Digite o nome exato do funcionario: ");
                            nomeFuncionario = plinio.next();

                            for (Cliente c : listaCliente) {
                                if (c.getNome().equals(nomeFuncionario))
                                    listaCliente.remove(c);
                            }

                        case 3:
                            //remoção de serviço
                            int codigoServico;

                            System.out.println("Digite o código do serviço: ");
                            codigoServico = plinio.nextInt();

                            for (Servico s: listaServ) {
                                if (s.getCodServico() == codigoServico)
                                    listaServ.remove(s);
                            }



                    }



                break;


                case 3:
                    //busca de clientes
                    String nomeCli;

                    System.out.println("Nome:");
                    nomeCli = plinio.next();

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
                    }


                break;

                case 4:
                    //busca de serviços
                    int codServico;

                    System.out.println("Código:");
                    codServico = plinio.nextInt();

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
                    }

                break;




            }
            Thread.sleep(3000);
            System.out.println("\n\n\n\n");
        }
    }
}