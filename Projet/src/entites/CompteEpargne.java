package entites;

import java.util.Date;


public class CompteEpargne extends Compte{        
    // Constructeur    
    public CompteEpargne(Date date) {
        super(date);
        Compte.totalDeCompte++;
    }
    //  Methodes  
    @Override
    public void chargerFrais() {  
    }
}
