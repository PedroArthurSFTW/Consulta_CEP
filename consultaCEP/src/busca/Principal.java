package busca;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import usuario.Conta;
import usuario.ContaCep;
import usuario.Endereco;

public class Principal{
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome: ");
        nome = sc.next();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        Conta conta = new Conta(nome, idade);

        System.out.println("digite o cep que deseja buscar");
        String CEP = sc.next();


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://viacep.com.br/ws/" + CEP + "/json/")).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        Gson gson = (new GsonBuilder()).setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        String endereco = (String)response.body();

        System.out.println("Deseja adicionar esse endereco ao seu cadastro?");
        String yon = sc.next();

        ContaCep newEndereco = gson.fromJson(endereco, ContaCep.class);
        Endereco enderecoJson = new Endereco(newEndereco);

        if(yon.equalsIgnoreCase("sim")){

            conta.endereco = enderecoJson;

        }
        
       

        sc.close();
    }
}