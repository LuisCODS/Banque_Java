package entites;
public class CompteCheques extends Compte {
    // Constructeur    
    public CompteCheques() {
        Compte.totalDeCompte++;
    }
    //  Methodes     
    @Override
    public void chargerFrais() {
        
    }
}
