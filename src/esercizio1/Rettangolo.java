package esercizio1;

public class Rettangolo
{
    private int altezza;
    private int lunghezza;

    public void setaltezza(int altezza)
    {
        this.altezza=altezza;
    }
    public void setlunghezza(int lunghezza)
    {
        this.lunghezza=lunghezza;
    }
    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void perimetro()
    {
        int p=((altezza*2)+(lunghezza*2));
       System.out.println("il perimetro è"+ p);
    }
    public void area()
    {
        int a=altezza*lunghezza;
        System.out.println("l'area è"+a);
    }
}
