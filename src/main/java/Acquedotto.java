
import java.util.Vector;



public class Acquedotto 
{   
    
     double somm = 0;
    
    Vector vettore = new Vector(10, 1); 
    
    public void aggiungiContenuto(String Nome, double quantita)
    {
        int i = 0;
        Vasca v = new Vasca();
        
        for(i = 0; i < vettore.size(); i++)
        {
            v = (Vasca) vettore.elementAt(i);
            if(v.getNome().equals(Nome))
            {
                v.aggiungiContenuto(quantita);
                vettore.removeElement(i);
                vettore.set(i,v); 
            }
        }

    }
    
    public void prelevaContenuto(String Nome, double quantita)
    {
        int i = 0;
        
        Vasca v = new Vasca();
        
        for(i = 0; i < vettore.size(); i++ )
        {
            v = (Vasca) vettore.elementAt(i);
            
            if(v.getNome().equals(Nome))
            {
                v.prelevaContenuto(quantita);
            }
        }
    }
    
    public double getContenuto( String Nome)
    {        
        int i = 0;
        double somma = 0;
        
        Vasca v = new Vasca();
        
        for(i = 0; i < vettore.size(); i++)
        {
            v =  (Vasca) vettore.elementAt(i);
            if(v.getNome().equals(Nome))
            {
               v = (Vasca) vettore.elementAt(i);
               somma += v.getContenuto();
            }
        }
        return somma;
    }
    
    public double getDispo()
    {
        int i = 0;
       
         Vasca v = new Vasca();
         
        
        for(i = 0; i < vettore.size(); i++)
        {
            v = (Vasca) vettore.elementAt(i);
            
            somm += v.getContenuto();
        }
        
        return somm;
    }
    
    public int contaVascheA()
    {
        int i = 0;
        int c = 0;
        
        for(i = 0; i < vettore.size(); i++)
        {
            if(vettore.elementAt(i) instanceof VascaTipoA)
            c++;
        }
        return c;
    }
    
    public int contaVasche()
    {
        int c = 0;
        
        c = vettore.size();
        
        return c;
    }
   
    public void aggiungiVasca(Vasca x)
    {
        vettore.addElement(x);
    }
    
    public void rimuoviVasca(Vasca x)
    {
        vettore.removeElement(x);
    }
    
    
}
