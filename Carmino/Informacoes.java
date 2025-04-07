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
  

    import javax.sound.midi.MidiDevice.Info;

 */


public class Informacoes{
    public class usuarios{
        String nome;
        String email;
        int telefone;
        int CPF;
        int numero;

        public usuarios(String nome, String email, int telefone, int CPF, int numero){
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.CPF = CPF;
            this.numero = numero;
        }

        public String getNome(){
            return nome;
        }
        public String getEmail(){
            return email;
        }
        public int getTelefone(){
            return telefone;
        }
        public int getCPF(){
            return CPF;
        }
        public int getNumero(){
            return numero;
        }
    @Override
    public String toString(){
        return "Seu nome: " + nome + "seu email: " + email + "seu telefone: " + telefone + "seu CPF é: " + CPF;
    }
    }
}
