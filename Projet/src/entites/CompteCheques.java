package entites;

import java.util.Date;

public class CompteCheques extends Compte {
    
    // Constructeur    
    public CompteCheques(Date date) {
        super(date);
        Compte.totalDeCompte++;
    }
    
    //  Methodes     
    @Override
    public void chargerFrais() {
        
    }
}
