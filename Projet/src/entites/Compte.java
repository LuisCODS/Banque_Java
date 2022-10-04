package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Compte {
    
    // ================== ATTRIBUTS ==================
    
    private int     numero;
    private double  solde, salaire;
    private boolean isOpen;
    private char    type;  
    private Client  client;
    private Date    dateOuverture,dateFermeture;
    static int      totalDeCompte;    
    
    // ================== CONSTRUCTEUR ==================
    
    public Compte(Date date, Client client){
        this.setDateOuverture(date);
        this.setIsOpen(true);
        this.setClient(client);
    }
    // ================== MÉTHODES ================== 
    
    public void ouvriCompte(){
        this.isOpen = true;
    }
    
    public void fermerCompte(){
        this.isOpen = false;        
    }
    
    // Chaque classe doit implementer ses frais(possibilité interface)!
    abstract public void chargerFrais();
    
    /**
    * Fait un depot en vérifiant si le montant est valide.
    * @param montant: le montant souhaité
    * @return true ou false si l'operation s'est bien passé.
    */
    public boolean depot(double montant){      
        if (montant > 0) {
            this.solde += montant;
            return true;
        }else{
            return false;
        }
    }    
    
    /**
    * Transfer un montant entre 2 comptes en verifient si le compte
    * d'origine a le solde pour l'operation.
    * @param montant: le montant souhaité du tranfert;
    * @param destin: le compte a recevoir le crédit;
    * @return true ou false si l'operation s'est bien passé.
    */
    public boolean transfererVers(Compte destin, double montant) {        
        if(this.retrait(montant)) {                    
            destin.depot(montant);
            return true;            
        }else{                     
            return false;            
        }                
    }
   
    /**
    * Retrait un montant du compte en vérifiant si le solde est superieur o montant
    * du retrait ou si le montant est valide.
    * @param montant: le montant souhaité
    * @return true si l'operation s'est bien passé, false sinon.
    */
    public  boolean retrait(double montant) {        
        if ( (this.solde < montant) || (montant <= 0) ) {
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
    
    public static int getTotalDeCompte() {
        return totalDeCompte;
    }
    
    public Client getClient() {
        return this.client;
    }
    
    private void setClient(Client client) {
        this.client = client;
    }    
    
    /**
    * Formate une date du type Date en String.
    * @return la date formatée.
    */
    public String getDateOuverture() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormate = formatter.format(this.dateOuverture);  
        return dataFormate;      
    }
    
    private void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }
    
    public Date getDateFermeture() {
        return this.dateFermeture;
    }
    
    public void setDateFermeture(Date dateFermeture) {
        this.dateFermeture = dateFermeture;
    }
    
    public boolean getIsOpen() {
        return this.isOpen;
    }
    
    private void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }   
   
    @Override
    public String toString() {
        String donnes = "Détails du Compte :\n";
               donnes += "- Ouverte : "         + this.getIsOpen() + "\n";
               donnes += "- Date Ouverture: "   + this.getDateOuverture() + "\n";
               donnes += "- Solde actuelle: $"  + this.getSolde()+"\n";
               donnes += "- Client : "          + this.getClient().getNom() + " " + this.getClient().getPrenom() + "\n";
        return donnes;
    }        
}
