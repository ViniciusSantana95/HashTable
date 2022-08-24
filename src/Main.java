
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Hashtable<String, String> listaTelefonica = new Hashtable<String, String>();

        int opcao = 0;
        String nome;
        String telefone;
        String nomePesquisa;

        do{
            System.out.println("");
            System.out.println("#######################");
            System.out.println("##CADASTRO TELEFÔNICO##");
            System.out.println("1 - ADICIONAR CONTATO");
            System.out.println("2 - BUSCAR CONTATO");
            System.out.println("3 - SAIR ");
            System.out.println("#######################");
            System.out.println("");

            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Informe o nome");
                    nome = scan.next();
                    System.out.println("Informe o telefone");
                    telefone = scan.next();
                    listaTelefonica.put(nome, telefone);
                    break;
                case 2:
                    System.out.println("Qual o nome do usuário que você deseja saber o número telefônico");
                    nomePesquisa = scan.next();
                    if(listaTelefonica.get(nomePesquisa) != null) {
                        System.out.println("O número telefônico é: " + listaTelefonica.get(nomePesquisa));
                    }else{
                        System.out.println("Esse nome não existe na lista telefônica");
                    }

                    break;

                case 3:

                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opcao != 3);



    }
}