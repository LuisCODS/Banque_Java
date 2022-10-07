package entites;

// Funcionario 
public abstract class Employe {
    
    // ==================================
    
    private String  nom;
    private int     id_employe;
    private double  salaire;
    
    // ==================================
    
    public Employe(){
    
    }

    // ==================================
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
