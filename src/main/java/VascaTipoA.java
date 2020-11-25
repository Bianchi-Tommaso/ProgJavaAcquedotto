public class VascaTipoA extends Vasca
{
    private double altezza;
    private double diametro;
    
    public VascaTipoA()
    {
        altezza = 0;
        diametro = 0;
    }
    
    public VascaTipoA(String nome, double diametro, double altezza)
    {
        super(nome);
        this.diametro = diametro;
        this.altezza = altezza;
        
        Volume = (diametro / 2) * (diametro / 2) + 3.14 * altezza; 
    }
}
