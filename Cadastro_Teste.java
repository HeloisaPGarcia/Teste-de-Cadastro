import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Bem vindo");
    System.out.println("Para continuar, por favor, insira o seu email:");
    String email = ler.nextLine();
    if(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
      System.out.println("Agora, por favor, insira uma senha que contenha caracteres especiais:");
      String senha = ler.nextLine();
      if(senha.matches("[!@#$%¨&*();.><:/+-_]")) {
        System.out.println("Cadastro Realizado com Sucesso!, muito obrigada <3");
      } else {
        System.out.println("Senha inválida, por favor, tente novamente");
 
      }
    } else {
      System.out.println("Por favor, reinicie o programa e insira um email válido");
   
    }
  }
}
