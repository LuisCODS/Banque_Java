package entites;

import req.Date;

public abstract class  Compte {
    
    // ================== Attributs ==================
    
    private int     numero;
    private double  solde, salaire;
    private boolean isOpen;
    private char    type;
    private String  titulaire;
    private Client  client;
    private Date    dateOuverture,dateFermeture;
     static int     totalDeCompte;    
    
    // ================== Methodes ================== 
    
    public void ouvriCompte(){
        
    }
    public void fermerCompte(){
        
    }
    abstract public void chargerFrais();
    
    public void getTotalCompte(){
        
    }     
    public void depot(double montant){
        this.setSolde(montant);
    }   
    public boolean transfererVers(Compte destin, double montant) {
        if(this.retrait(montant)) {
            destin.depot(montant);
            return true;
        }else{
            return false;
        }        
    }
        
    public  boolean retrait(double montant) {        
        if (this.solde < montant) {
            return false;
        }else{
            this.solde -= montant;
            return true;
        }
    }
    
    // ================== Get & Sets ==================
    
    public double getSolde() {
        return this.solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getTotalDeCompte() {
        return totalDeCompte;
    }

 
    
}
