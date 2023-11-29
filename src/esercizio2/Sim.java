package esercizio2;

import java.util.Arrays;

public class Sim
{
    private int numero;
    private double credito=10.34;
    private Chiamata [] lista;

    public double getCredito() {
        return credito;
    }
    public int getNumero()
    {
        return numero;
    }

   public void stampalista()
   {
       for(int i=0;i<lista.length;i++)
       {
           System.out.println("lista delle chiamate su questo numero");
           System.out.println(lista[i].numero);
           System.out.println("tempo di chiamata");
           System.out.println(lista[i].tempo);
       }
   }


    public  Sim(int numero)
    {
        this.lista= new Chiamata[5];
        this.numero=numero;
        this.lista[0]= new Chiamata(10.23,"23432423");
        this.lista[1]= new Chiamata(23.12,"323234343");
        this.lista[2]=new Chiamata(45.00,"2132133222");
        this.lista[3]=new Chiamata(8.43,"234382034");
        this.lista[4]=new Chiamata(5.12,"438438430");


    }

}
