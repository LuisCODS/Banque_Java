package entites;

public class CompteEpargne extends Compte{        

    // Contructeur    
    public CompteEpargne() {
        Compte.totalDeCompte++;
    }
 
    @Override
    public void chargerFrais() {
        
    }
 
}
