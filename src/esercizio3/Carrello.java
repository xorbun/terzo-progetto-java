package esercizio3;

import java.util.Random;

public class Carrello
{
    int Carrelloid;
    Articolo prodotto;
    Cliente acquirente;
    Articolo totale;

    public Carrello(String prodotto,String acquirente, double totale)
    {
        Random rndm=new Random();
        Carrelloid=rndm.nextInt(1,1000);
        this.prodotto=new Articolo();
        this.prodotto.descrizione=prodotto;
        this.acquirente=new Cliente();
        this.acquirente.nome=acquirente;
        this.totale=new Articolo();
        this.totale.prezzo= this.totale.prezzo+totale;
    }


    public void totale()
    {

        System.out.println(totale.prezzo);
    }
}
