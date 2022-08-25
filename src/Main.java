
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hashtable<String, String> listaTelefonica = new Hashtable<String, String>();
        Scanner scan = new Scanner(System.in);

        int opcao = 0;
        String nome ;
        String telefone ;

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
                    System.out.println("Informe o nome: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    System.out.println("Informe o telefone: ");
                    telefone = scan.nextLine();

                    listaTelefonica.put(nome, telefone);
                    break;
                case 2:
                    System.out.println("Qual o nome do usuário que você deseja saber o número telefônico");
                    scan.nextLine();
                    String nomePesquisa = scan.nextLine();
                    if(listaTelefonica.get(nomePesquisa) != null) {
                        System.out.println("O número telefônico é: " + listaTelefonica.get(nomePesquisa));
                    }else{
                        System.out.println("Esse nome não existe na lista telefônica");
                    }

                    break;

                case 3:
                    System.out.println("Sistema Finalizado");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while(opcao != 3);



    }
}