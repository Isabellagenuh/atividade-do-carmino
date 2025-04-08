/*
 Classe Informações:

  PROPRIEDADES PRIVADAS:
  email
  telefone
  cpf

  PROPRIEDADES PUBLICAS:
  nome

  METODO:
  definir as variaveis e retornar os valores


  DECLARAR INFORMAÇÕES:
  - criar uma variavel para exibir as informações



 */



    public class Informacoes{
        String nome;
        private String email;
        private String telefone;
        private String CPF;

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


        public String getTelefone(){
            return telefone;
        }
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }


        public String getCPF(){
            return CPF;
        }
        public void setCPF(String CPF){
            this.CPF = CPF;
        }

        
        public void exibirInformacoes(){
        if (nome != null) System.out.println("Seu nome é: " + nome);
        if (email != null) System.out.println("Seu email é: " + email);
        if (telefone != null) System.out.println("Seu telefone é: " + telefone);
        if (CPF != null) System.out.println("Seu CPF é: " + CPF);
        }

    }
