package entites;

public class Client {
    
    // ================== ATTRIBUTS ==================
    
    private int        nas;
    private String     nom, prenom;   
    
    // ================== CONSTRUCTEUR ==================

    public Client(String nom, String prenom){
        
        this.setNom(nom);
        this.setPrenom(prenom);
    }
    
    // ================== GETS & SETS ==================
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getNas() {
        return nas;
    }
    public void setNas(int nas) {
        this.nas = nas;
    }

}
