package entites;

import req.Date;

public abstract class  Compte {
    
    // ================== ATTRIBUTS ==================
    
    private int     numero;
    private double  solde, salaire;
    private boolean isOpen;
    private char    type;
    private String  titulaire;
    private Client  client;
    private Date    dateOuverture,dateFermeture;
    static int     totalDeCompte;    
    
    // ================== CONSTRUCTEUR ==================
    
    public Compte(){
    
    }
    // ================== MÉTHODES ================== 
    
    public void ouvriCompte(){
        this.isOpen = true;
    }
    public void fermerCompte(){
        this.isOpen = false;        
    }
    // chaque classe a une charge differente
    abstract public void chargerFrais();
   
    public void depot(double montant){
        this.setSolde(montant);
    }    
    /*
        Transfer un montant entre 2 comptes en verifient si le compte
        d'origine a le solde pour l'operation.
        Retourne true si oui, false sinon.
    */
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
    
    // ================== GETS & SETS ==================
    
    public double getSolde() {
        return this.solde;
    }
    public void setSolde(double solde) {
        this.solde += solde;
    }
    public static int getTotalDeCompte() {
        return totalDeCompte;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    
}
