/*
 Classe Usuário:
 definir as variaveis 
 nome
 email
 telefone
 cpf

 permitir que o usuario escreva as informações 
 */

public class Usuario {
    public Usuario(){
        count = 0;

    }
    public void addInformacoes(int numero){
        if (numero >=5){
            System.out.println("Seu numero esta invalido!");
        }
    }
}
