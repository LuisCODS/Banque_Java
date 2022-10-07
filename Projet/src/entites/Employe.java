package entites;

// Funcionario 
public abstract class Employe {
    
    // ================== ATTRIBUTS ==================
    
    private String  nom;
    private int     id_employe;
    private double  salaire;
    
    // ================== CONSTRUCTEUR ==================
    
    public Employe(double salaire){
        this.setSalaire(salaire);
    }

    // ================== GETS & SETS ==================
    
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return this.salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
    
    
    // ================== MÉTHODES public ================== 

    // Les employés ordinaires reçoivent 10% du montant du salaire
    public double getBonification(){
        return this.getSalaire() * 10;
    }
    
    @Override
    public String toString() {
        
        String donnes = "\n";
               donnes += "============================= \n";
               donnes += " Détails Employé :\n";
               donnes += "- Nom : "         + this.getNom() +"\n";
               donnes += "- Salaire : "     + this.getSalaire()+"\n";
               return donnes;
    }
        
}
