package usuario;


public class Endereco {
    private String 
     logradouro,
     cep,
     bairro,
     cidade,
     estado;

    public Endereco(ContaCep contaCep){
        this.logradouro = contaCep.logradouro();
        this.cep = contaCep.cep();
        this.bairro = contaCep.bairro();
        this.cidade = contaCep.cidade();
        this.estado = contaCep.estado();
    }
}
