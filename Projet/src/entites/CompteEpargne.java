package entites;

import java.util.Date;

public class CompteEpargne extends Compte{      
        
    // Constructeur    
    public CompteEpargne(Date date, Client client) 
    {    
        super(date, client);
                 
    }
    
    //  Methodes  
    @Override
    public void chargerFrais() {  
    }
}
