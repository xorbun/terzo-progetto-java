package esercizio3;

import java.util.Random;

public class Cliente
{
    int ClienteId;
    public String nome;
    String cognome;
    String email;
    String dataIscrizione;

    public Cliente()
    {
        Random rndm=new Random();
        this.ClienteId=rndm.nextInt(1,1000);
        this.nome="Carlo";
        this.cognome="Barretta";
        this.email="ciao@buongiorno.com";
        this.dataIscrizione="12-12-2012";
    }
}
