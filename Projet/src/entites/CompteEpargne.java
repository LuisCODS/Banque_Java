package entites;
import java.util.Date;
public class CompteEpargne extends Compte{        
    // Constructeur    
    public CompteEpargne(Date date, Client client) {        
        // appel le constructeur de la super classe
        super(date, client);
        Compte.totalDeCompte++;
    }
    //  Methodes  
    @Override
    public void chargerFrais() {  
    }
}
