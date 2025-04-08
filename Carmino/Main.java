/* 
Executar lição de casa:

Objetivos a serem atendidos:
- Criar um bloco de informações do usuario
- Criar entradas de valores


BLOCO DE INFORMAÇÕES A SEREM REPETIDAS:
Exibir menu:
* 1: ADICIONAR O NOME DO USUARIO
* 2: ADICIONAR O EMAIL DO USUÁRIO
* 3: ADICIONAR O TELEFONE DO USUÁRIO
* 4: ADICIONAR O CPF DO USUÁRIO
* 5: VER INFORMAÇÕES
* 6: ALTERAR INFORMAÇÕES
* 0: ENCERRAR O PROGRAMA
ESCOLHA UMA OPÇÃO:




ESCOLHAS POSSIVEIS:

  Se o usuário escolher 1 {
  solicitar que o usuário escreva o seu Nome
  chamar o metodo para adicionar a informação na lista
  encerrar
  }

  Se o usuário escolher 2 {
  solicitar que o usuário escreva o seu Email
  chamar o metodo para adicionar a informação na lista
  encerrar
  }

  Se o usuário escolher 3 {
  solicitar que o usuário escreva o seu Telefone
  chamar o metodo para adicionar a informação na lista
  encerrar
  }

  Se o usuário escolher 4 {
  solicitar que o usuário escreva o seu CPF
  chamar o metodo para adicionar a informação na lista
  encerrar
  }

  Se o usuário escolher 5 {
    exibir a variavel que guarda as informações.
  }
  
  Se o usuário escolher 6 {
    exibir um array com as variaveis que podem ser alteradas:
    -Digite 1 para alterar seu Nome:
    -Digite 2 para alterar seu Email:
    -Digite 3 para alterar seu Telefone:
    -Digite 4 para alterar seu CPF:

    criar uma variavel para a mudança
    criar um scanner para ler a menssagem do usuario

    criar if para todas as opções:
    se for 1{
      verificar se a mensagem é igual{
        sua mensagem é igual
      } se nao{
        alterar a variavel
        mudança feita com sucesso!
      }
      voltar para estrutura de rerpetição anterior!
      (repetir esta estrutura em todas as 4 variaveis de alteração de dados);
    }
    
  }

  Caso tenha algum caracter diferente {
  exibir uma mensagem  "caracter invalido!"
  }
FIM do programa

*/
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Informacoes informacoes = new Informacoes();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Nome");
            System.out.println("2 - Adicionar Email");
            System.out.println("3 - Adicionar o Telefone");
            System.out.println("4 - Adicionar o CPF");
            System.out.println("5 - Ver informações");
            System.out.println("6 - Aterar as Informações");
            System.out.println("0 - Sair do Programa!");
            System.out.println("Escolha uma opção: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
              case 1:
              System.out.println("Digite o seu nome: ");
              informacoes.setNome(scanner.nextLine());
              break;

              case 2:
              System.out.print("Digite seu email: ");
              informacoes.setEmail(scanner.nextLine());
              break;
              case 3:
              System.out.print("Digite seu telefone: ");
              informacoes.setTelefone(scanner.nextLine());
              break;
              case 4:
              System.out.print("Digite seu CPF: ");
              informacoes.setCPF(scanner.nextLine());
              break;
              case 5:
              informacoes.exibirInformacoes();
              break;
              case 6:
              System.out.println("Digite 1 para alterar o seu nome");
              System.out.println("Digite 2 para alterar seu email");
              System.out.println("Digite 3 para alterar seu telefone");
              System.out.println("Digite 4 para alterar seu CPF");
              System.out.print("Escolha uma opção: ");
              int alterar = scanner.nextInt();
              scanner.nextLine(); 

                switch (alterar) {
                   case 1:
                     System.out.print("Novo nome: ");
                     String novoNome = scanner.nextLine();
                        if (novoNome.equals(informacoes.getNome())) {
                         System.out.println("O novo nome é igual ao atual. Nenhuma alteração feita!");
                        } else {
                          informacoes.setNome(novoNome);
                          System.out.println("Nome alterado com sucesso!");
                        }
                  break;
                  
                    case 2:
                     System.out.print("Novo email: ");
                     String novoEmail = scanner.nextLine();
                     if(novoEmail.equals(informacoes.getEmail())){
                      System.out.println("O novo email é igual ao atual. Nenhuma alteração foi feita!");
                     } else{ 
                      informacoes.setEmail(novoEmail);
                      System.out.println("Nome alterado com sucesso!");
                     }
                  break;


                    case 3:
                     System.out.print("Novo telefone: ");
                     String novoTelefone = scanner.nextLine();
                     if(novoTelefone.equals(informacoes.getTelefone())){
                      System.out.println("O novo Telefone é igual ao atual. Nenhuma alteração foi feita!");
                     } else{
                      informacoes.setTelefone(novoTelefone);
                      System.out.println("Telefone alterado com sucesso!");
                     }
                  break;


                    case 4:
                     System.out.print("Novo CPF: ");
                     String novoCPF = scanner.nextLine();
                     if(novoCPF.equals(informacoes.getCPF())){
                      System.out.println("O novo CPF é igual ao atual. Nenhuma alteração foi feita!");
                     }else{
                      informacoes.setCPF(novoCPF);
                      System.out.println("CPF alterado com sucesso!");
                     }
                  break;

                    default:
                          System.out.println("Opção inválida.");
                   }
              
              case 0:
              System.out.println("Programa encerrado.");
              break;
              default:
              System.out.println("Caractere inválido!");
            }
        } while (option != 0);

        scanner.close();
    } 
}
            

    
  
