import esercizio1.Rettangolo;
import esercizio2.Sim;
import esercizio3.Carrello;
import esercizio3.Cliente;
import esercizio3.Articolo;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int menu;
        System.out.println("cosa vuoi fare= 1)rettangolo 2)Sim 3)Ecommerce");
        menu=input.nextInt();
        switch (menu)
        {
            case 1:
            {
                Rettangolo rettangolo1=new Rettangolo();
                System.out.println("inserisci l' altezza del rettangolo");
                rettangolo1.setAltezza(input.nextInt());
                System.out.println("inserisci la lunghezza del rettangolo");
                rettangolo1.setLunghezza(input.nextInt());
                rettangolo1.perimetro();
                rettangolo1.area();
                break;
            }
            case 2:
            {
                System.out.println("Inserisci numero di telefono");
                int num=input.nextInt();
                Sim sim=new Sim(num);
                System.out.println("il numero è");
                System.out.println(sim.getNumero());
                sim.stampalista();
                System.out.println("credito residuo"+sim.getCredito()+"€");
                break;
            }
            case 3:
            {
                Cliente utente=new Cliente();
                Articolo prodotto=new Articolo();
                Carrello paga=new Carrello(utente.nome,prodotto.descrizione);
                System.out.println(paga.getTotale());
                break;
            }
        }


    }
}