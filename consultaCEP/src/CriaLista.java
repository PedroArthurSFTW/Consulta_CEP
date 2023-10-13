import java.util.Scanner;

public class CriaLista {
    public void listaEndereco(Buscas busca, String CEP, Conta conta){
        Scanner sc = new Scanner(System.in);
        String yOn;
        do {
            Endereco endereco = new Endereco(busca.realizaBusca(CEP));
            System.out.println("esse é o endereço: " + endereco.toString() +
                    "\n Deseja adicionar ele a lista? \nDigite Sim ou Não: ");
            yOn = sc.next();

            conta.add(endereco);

            System.out.println("deseja pesquisar outro CEP? ");
            String cYoN = sc.next();

            if(cYoN.equalsIgnoreCase("nao")){
                break;
            }

            System.out.println("Digite o CEP: ");
            CEP = sc.next();


        }while (!yOn.equalsIgnoreCase("Nao"));

        sc.close();
    }
}
