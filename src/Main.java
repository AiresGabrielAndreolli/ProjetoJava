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
                            String nome;
                            int idade;
                            double cpf;
                            String carro;
                            String placa;
                            System.out.println("Nome: ");
                            nome = plinio.next();
                            System.out.println("Idade: ");
                            idade = plinio.nextInt();
                            System.out.println("CPF: ");
                            cpf = plinio.nextDouble();
                            System.out.println("Carro: ");
                            carro = plinio.next();
                            System.out.println("Placa: ");
                            placa = plinio.next();
                            Cliente c1 = new Cliente(nome,idade,cpf,carro,placa);
                            listaCliente.add(c1);
                        break;

                        case 2:

                            double salarioFixo;
                            double acrescimoServico;
                            String setor;
                            System.out.println("Nome: ");
                            nome = plinio.next();
                            System.out.println("Idade: ");
                            idade = plinio.nextInt();
                            System.out.println("CPF: ");
                            cpf = plinio.nextInt();
                            System.out.println("Salario fixo: ");
                            salarioFixo = plinio.nextDouble();
                            System.out.println("Setor: ");
                            setor = plinio.next();
                            Funcionario f1 = new Funcionario(nome,idade,cpf,salarioFixo,setor);
                            listaFunc.add(f1);
                            f1.mostraDados();
                        break;




                    }
                break;

                case 2:
                    /*
                    System.out.println("Remoção degue?");
                    System.out.println("1- Cliente");
                    System.out.println("2- Funcionário");
                    System.out.println("3- Serviço");
                    System.out.println("");
                    z = plinio.nextInt();
                    switch(z)
                    {
                        case 1:

                        case 2:
                */
                break;


                case 3:
                    //busca de clientes
                    String nomeCli;

                    System.out.println("Nome:");
                    nomeCli = plinio.next();

                    for (int j = 0; j < listaCliente.size(); j++) {
                        if (listaCliente.get(j).getNome().startsWith(nomeCli)) {
                            System.out.println("---------------------------------------");
                            System.out.println("Nome: " + listaCliente.get(j).getNome());
                            System.out.println("Cpf: " + listaCliente.get(j).getCpf());
                            System.out.println("Idade: " + listaCliente.get(j).getIdade());
                            System.out.println("Carro: " + listaCliente.get(j).getCarro());
                            System.out.println("Placa: " + listaCliente.get(j).getPlaca());
                            System.out.println("---------------------------------------");
                        }
                    }


                break;

                case 4:

                break;




            }
            Thread.sleep(3000);
            System.out.println("\n\n\n\n");
        }
    }
}