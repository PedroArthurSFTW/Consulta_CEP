import java.io.IOException;
import java.util.Scanner;


public class Principal{    
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String CEP;

    System.out.println("Qual o seu nome? ");
    String nome = sc.next();

    System.out.println("Qual a sua idade? ");
    int idade = sc.nextInt();

    Conta conta = new Conta(nome, idade);

    System.out.println("Digite o CEP");
    CEP = sc.next();

    Buscas busca = new Buscas();

    CriaLista criaLista = new CriaLista();
    criaLista.listaEndereco(busca, CEP, conta);

    conta.getEndereco();

    GravaEndereco gravaEndereco = new GravaEndereco();
    gravaEndereco.salvaDoc(conta.getMeuEnderecos());

    sc.close();
  }
}