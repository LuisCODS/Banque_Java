package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Compte {
    
    // ================== ATTRIBUTS ==================
    
    private int id_compte;
    private double  solde, salaire;
    private boolean isOpen;
    private char    type;  
    private Client  client;
    private Date    dateOuverture,dateFermeture;
    private static int totalDeCompte;    
    
    // ================== CONSTRUCTEUR ==================
    
    public Compte(Date date, Client client){
        
        this.setId_compte(Compte.getTotalDeCompte() + 1);
        this.setDateOuverture(date);        
        this.setClient(client);
        this.setIsOpen(true);
        this.checkTypeCompte();
        Compte.totalDeCompte = Compte.totalDeCompte + 1;               
    }
    
    // ================== MÉTHODES public ================== 
    
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
    
// ================== MÉTHODES privés ================== 
    
    private void checkTypeCompte(){           
        if (this instanceof CompteEpargne) {
            this.setType('E');
        }else{
            this.setType('C');
        }        
    }

    private void setClient(Client client) {
        this.client = client;
    }    
    
    private void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }   

    private void setType(char type) {
        this.type = type;
    } 
     
    private void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }   
   
    
// ================== GETS & SETS ==================
    
    public double getSolde() {
        return this.solde;
    }
    
    public static int  getTotalDeCompte() {
        return Compte.totalDeCompte;
    }
    
    public Client getClient() {
        return this.client;
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
        
    public Date getDateFermeture() {
        return this.dateFermeture;
    }
    
    public void setDateFermeture(Date dateFermeture) {
        this.dateFermeture = dateFermeture;
    }
    
    public boolean isOpen() {
        return this.isOpen;
    }
      
    public String getType() {
        
        if (this.type == 'C') {
            return "<< Cheque >>";
        }else{
            return "<< Épargne >>";
        }
        
    }   

    public int getId_compte() {
        return id_compte;
    }
    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }
    
    
     
    @Override
    public String toString() {
        
        String donnes = "\n";
               donnes += "============================= ";
               donnes += " Détails du Compte :\n";
               donnes += " ID : "                + this.getId_compte()       + "\n";
               donnes += " Type de compte: "     + this.getType()            + "\n";
               donnes += "- Ouverte : "          + this.isOpen()             + "\n";
               donnes += "- Date Ouverture: "    + this.getDateOuverture()   + "\n";
               donnes += "- Solde actuelle: $"   + this.getSolde()           +"\n";
               donnes += "- Client : "           + this.getClient().getNom() + " " + this.getClient().getPrenom();
               
               return donnes;
    }        
}
