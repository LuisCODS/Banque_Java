package entites;
import java.util.Date;
public class CompteCheques extends Compte {    
    // Constructeur    
    public CompteCheques(Date date, Client client) {        
         // appel le constructeur de la super classe
        super(date,client);
        Compte.totalDeCompte++;
    }
    //  Methodes     
    @Override
    public void chargerFrais() {
        
    }
}
