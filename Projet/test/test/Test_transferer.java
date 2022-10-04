package test;

import entites.CompteCheques;
import entites.Compte;
import entites.Client;
import entites.CompteEpargne;
import java.util.Date;

public class Test_transferer {

    public static void main(String[] args) {      
        
        Client client = new Client("Santos","Luis"); 
        
        // Polymorphisme de reference  
        Compte cheque = new CompteCheques(new Date(), client); 
        cheque.depot(1000); 
        
        Compte epargne = new CompteEpargne(new Date(), client);  
        
        System.out.println("LA BANQUE");
        System.out.println("Total de clients : " + Client.getTotalDeClient());  
        System.out.println("Total de comptes : " + Compte.getTotalDeCompte()+"\n");  
                        
        // ============== TEST TRANSFERT ==============
        if (cheque.transfererVers(epargne, 200)) {          
            System.out.println("Transfer de 200 du compte cheque vers le compte epargne, done! \n");          
        }else{
            System.out.println("Não consegui transferi");
        }                  
        //cheque.depot(500);
         
          System.out.println(cheque.toString());
    }    
}
