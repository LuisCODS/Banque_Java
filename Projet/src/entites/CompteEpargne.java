package entites;
public class CompteEpargne extends Compte{        
    // Constructeur    
    public CompteEpargne() {
        Compte.totalDeCompte++;
    }
    //  Methodes  
    @Override
    public void chargerFrais() {  
    }
}
