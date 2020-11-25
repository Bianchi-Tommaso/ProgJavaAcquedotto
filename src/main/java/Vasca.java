
public class Vasca
{
    protected String Nome;
    protected double Volume;
    protected double Contenuto;
    
    public Vasca()
    {
        this.Nome = "";
        this.Volume = 0;
        this.Contenuto = 0;
    }
    
    public Vasca(String Nome, double Volume, double Contenuto)
    {
        this.Nome = Nome;
        this.Volume = Volume;
        this.Contenuto = Contenuto;
    }
    
    public Vasca(String Nome)
    {
        this.Nome = Nome;
        Contenuto = 0;
    }
    
    public void aggiungiContenuto(double quantita)
    {
        if(Contenuto + quantita <= Volume)
        {
            Contenuto = Contenuto + quantita;
        }
    }
    
    public void prelevaContenuto(double quantita)
    {
        if(Contenuto - quantita >= 0)
        {
            Contenuto = Contenuto - quantita;
        }
    }

    public double getVolume() 
    {
        return Volume;
    }

    public double getContenuto() 
    {
        return Contenuto;
    }

    public String getNome() {
        return Nome;
    }
    
    
}
