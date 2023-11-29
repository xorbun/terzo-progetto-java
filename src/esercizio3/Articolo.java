package esercizio3;

import java.util.Random;

public class Articolo
{
        int ArticoloIc;
        public String descrizione;

        double prezzo;

        public Articolo()
        {
            Random rndm=new Random();
            this.ArticoloIc=rndm.nextInt(1,1000);
            this.descrizione="iphone";
            this.prezzo=999.99;
        }
}
