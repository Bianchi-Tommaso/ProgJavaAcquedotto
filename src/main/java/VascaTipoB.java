public class VascaTipoB extends Vasca
{
    private double altezza;
    private double larghezza;
    private double lunghezza;
    
    public VascaTipoB()
    {
        altezza = 0;
        larghezza = 0;
        lunghezza = 0;
    }
    
    public VascaTipoB(String nome, double lunghezza, double larghezza, double altezza)
    {
        super(nome);
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        
        this.Volume = altezza * larghezza * lunghezza;
    }
}
