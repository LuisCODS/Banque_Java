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
    static int      totalDeCompte;    
    
    // ================== Methodes ================== 
    
    abstract public void ouvriCompte();
    abstract public void fermerCompte(); 
    abstract public void chargerFrais();
    abstract public void getTotalCompte();
    abstract public boolean retrait(double montant);
    abstract public void depot(double montant);
    abstract public boolean transfererVers(Compte c, double montant);  
    
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
