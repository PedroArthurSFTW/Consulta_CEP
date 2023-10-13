public class Endereco {
    private String
            cep,
            logradouro,
            bairro,
            localidade,
            uf;

    public Endereco(ContaCep contaCep){
        this.cep = contaCep.cep();
        this.bairro = contaCep.bairro();
        this.uf = contaCep.uf();
        this.localidade = contaCep.localidade();
        this.logradouro = contaCep.logradouro();

    }

    @Override
    public String toString() {
        return "Endereco = " +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", Cidade='" + localidade + '\'' +
                ", Estado='" + uf;
    }
}
