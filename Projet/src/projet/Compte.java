package projet;

public abstract class  Compte {
    
    // ================== Attributs ==================
    
    private int     numero;
    private double  solde;
    private boolean isOpen;
    private char    type;
    private String  titulaire;
    private Client  client;
    private Date    dateOuverture;
    private Date    dateFermeture;
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
    
}
