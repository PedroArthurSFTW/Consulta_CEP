import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class Buscas {
    public ContaCep realizaBusca(String CEP) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + CEP + "/json/"))
                .build();
        HttpResponse<String> response;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ContaCep.class);
        } catch (Exception e) {
            System.out.println("Nao sei o que ocorreu");
        }

        return null;
    }
}
