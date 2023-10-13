import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GravaEndereco {
    public void salvaDoc(List enderecos) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter gravaEndereco = new FileWriter("meus Enderecos.json");
        gravaEndereco.write(gson.toJson(enderecos));
        gravaEndereco.close();
    }
}
