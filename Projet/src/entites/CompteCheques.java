package entites;

public class CompteCheques extends Compte {

    // Contructeur    
    public CompteCheques() {
        Compte.totalDeCompte++;
    }

    // ================== Methodes ==================    

    @Override
    public void chargerFrais() {
        
    }
 
}
