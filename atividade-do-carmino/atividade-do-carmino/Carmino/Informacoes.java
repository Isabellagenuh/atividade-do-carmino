/*
 Classe Informações:

  PROPRIEDADES PRIVADAS:
  email
  endereco
  

  PROPRIEDADES PUBLICAS:
  nome
  cidade

  METODO:
  definir as variaveis e retornar os valores


  DECLARAR INFORMAÇÕES:
  - criar uma variavel para exibir as informações



 */



    public class Informacoes{
        String nome;
        private String email;
        private String endereco;
        String cidade;

        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }


        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }


        public String getEndereco(){
            return endereco;
        }
        public void setEndereco(String endereco){
            this.endereco = endereco;
        }


        public String getCidade(){
            return cidade;
        }
        public void setCidade(String cidade){
            this.cidade = cidade;
        }

        
        public void exibirInformacoes(){
        if (nome != null) System.out.println("Seu Nome é: " + nome);
        if (email != null) System.out.println("Seu Email é: " + email);
        if (endereco!= null) System.out.println("Seu Endereço é: " + endereco);
        if (cidade != null) System.out.println("Sua Cidade é: " + cidade);
        }

    }
