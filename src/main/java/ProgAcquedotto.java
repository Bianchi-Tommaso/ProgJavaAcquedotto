public class ProgAcquedotto 
{
    public static void main(String[] args) 
    {   
        Acquedotto uno = new Acquedotto();
        
        VascaTipoB VB1 = new VascaTipoB("Firenze", 50,30,20 );
        VascaTipoB VB2 = new VascaTipoB("Roma", 25, 15, 10);
        VascaTipoB VB3 = new VascaTipoB("Napoli", 12, 7, 5);
        
        VascaTipoA VA1 = new VascaTipoA("Milano", 50, 30);
        VascaTipoA VA2 = new VascaTipoA("Perfugas", 25, 15);
        VascaTipoA VA3 = new VascaTipoA("Sassari", 12, 7);
        
        
        
    uno.aggiungiVasca(VA1);
    uno.aggiungiVasca(VA2);
    uno.aggiungiVasca(VA3);
    
    uno.aggiungiVasca(VB1);
    uno.aggiungiVasca(VB2);
    uno.aggiungiVasca(VB3);
    
    VA1.aggiungiContenuto(230);
    VA2.aggiungiContenuto(276);
    VA3.aggiungiContenuto(34);
    
    VB1.aggiungiContenuto(230);
    VB2.aggiungiContenuto(520);
    VB3.aggiungiContenuto(111);
    
    VA1.prelevaContenuto(300);
    VA2.prelevaContenuto(275);
    VA3.prelevaContenuto(111);
    
    VB1.prelevaContenuto(300);
    VB2.prelevaContenuto(275);
    VB3.prelevaContenuto(111);
    
    System.out.println("La Quantita Della Vasca E': " + VA1.getContenuto());
    System.out.println("La Quantita Della Vasca E': " + VA2.getContenuto());
    System.out.println("La Quantita Della Vasca E': " + VA3.getContenuto());
    
    System.out.println("La Quantita Della Vasca E': " + VB1.getContenuto());
    System.out.println("La Quantita Della Vasca E': " + VB2.getContenuto());
    System.out.println("La Quantita Della Vasca E': " + VB3.getContenuto());
    
    
    
    uno.aggiungiContenuto("Firenze", 200);
    uno.aggiungiContenuto("Roma", 300);
    uno.aggiungiContenuto("Napoli", 1222);
    
    uno.rimuoviVasca(VA2);
    uno.rimuoviVasca(VB3);
    
    
    uno.prelevaContenuto("Firenze", 125);
    uno.prelevaContenuto("Napoli", 645);
    uno.prelevaContenuto("Roma", 524);
    uno.prelevaContenuto("Perfugas", 11);
    uno.prelevaContenuto("Sassari", 600);
    uno.prelevaContenuto("Firenze", 125);
    
    
    System.out.println(uno.getContenuto("Firenze"));
    System.out.println(uno.getContenuto("Roma"));
    System.out.println(uno.getContenuto("Napoli"));
    System.out.println(uno.getContenuto("CIAO"));
     System.out.println(uno.getContenuto("Milano"));
      System.out.println(uno.getContenuto("Perfugas"));
    System.out.println(uno.getDispo());
    System.out.println(uno.contaVasche());
    System.out.println(uno.contaVascheA());
    
    }
}
