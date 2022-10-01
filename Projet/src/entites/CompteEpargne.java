package entites;

public class CompteEpargne extends Compte{
        
     // ================== Methodes ================== 
    
    @Override
    public void ouvriCompte() {
  
    }

    @Override
    public void fermerCompte() {
        
    }

    @Override
    public void chargerFrais() {
        
    }

    @Override
    public void getTotalCompte() {
        
    }

    @Override
    public  boolean retrait(double montant) {        
        if (this.getSolde() < montant) {
            return false;
        }else{
            this.setSolde(this.getSolde() - montant);
            return true;
        }
    }

    @Override
    public void depot(double montant) {
        
    }

    @Override
    public boolean transfererVers(Compte destin, double montant) {
        
        if(this.retrait(montant)) {
            destin.setSolde(montant);
            return true;
        }else{
            return false;
        }
        
    }
    
}
