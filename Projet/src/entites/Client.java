package entites;

public class Client {
    
    // ================== ATTRIBUTS ==================
    
    private int       indClient, nas;
    private String    nom, prenom;
    private static int totalDeClient;   
    
    // ================== CONSTRUCTEUR ==================

    public Client(String nom, String prenom){
        Client.totalDeClient = Client.totalDeClient +1;
        this.setNom(nom);
        this.setPrenom(prenom);
    }
    
    // ================== GETS & SETS ==================
    
    public int getIndClient() {
        return indClient;
    }
    public void setIndClient(int indClient) {
        this.indClient = indClient;
    }
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
    public static int getTotalDeClient() {
        return Client.totalDeClient;
    }

}
