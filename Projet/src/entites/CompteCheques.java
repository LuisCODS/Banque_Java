package entites;
import java.util.Date;
public class CompteCheques extends Compte {    
    // Constructeur    
    public CompteCheques(Date date, Client client) 
    {                 
        super(date,client);        
    }
    
    //  Methodes     
    @Override
    public void chargerFrais() {
        
    }
}
