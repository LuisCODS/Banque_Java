package entites;

public class Gerant extends Employe{
    
    private int password;
    private int nbEmployeGere;
    
    // permet l'accès au système interne de la banque
    public boolean authentiquer(int senha){
        if (this.password == password) {   
            System.out.println("Acesso Permitido!");
            return true;   
        } else {   
            System.out.println("Acesso Negado!");
            return false;  
        }  
    }  

    public Gerant(double salaire){
        super(salaire);
    }
    
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }    
    public int getNbEmployeGere() {
        return nbEmployeGere;
    }
    
    
    
}
