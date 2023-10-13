import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String nome;
    private int idade;
    private List<Endereco> meuEnderecos = new ArrayList<>();

    public Conta(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void add(Endereco endereco){
        meuEnderecos.add(endereco);
    }

    public void getEndereco(){
        for(Endereco s : meuEnderecos){
            System.out.println(s);
        }
    }

    public List<Endereco> getMeuEnderecos() {
        return meuEnderecos;
    }
}
