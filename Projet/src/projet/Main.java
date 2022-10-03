package projet;

import entites.CompteCheques;
import entites.Compte;
import entites.Client;
import entites.CompteEpargne;
import java.util.Date;

public class Main {

    public static void main(String[] args) {      
        
        Client client = new Client(); 
        client.setPrenom("Luis");  
        client.setNom("Santos");
        
        // Polymorphisme de reference  
        Compte cheque = new CompteCheques(new Date()); 
        cheque.depot(1000); 
        cheque.setClient(client);
        
        Compte epargne = new CompteEpargne(new Date());  
        
        System.out.println("LA BANQUE");
        System.out.println("Total de clients : " + Client.getTotalDeClient());  
        System.out.println("Total de comptes : " + Compte.getTotalDeCompte()+"\n");       
        // ============== TEST RETRAIT ==============
        /*
        if (cheque.retrait(200)){ 
            System.out.println("Consegui sacar \n"); 
            System.out.println("Solde du compte cheque apres " + cheque.getSolde()); 
        }else{      
            System.out.println("Não consegui sacar");   
        }
        */
        // ============== TEST TRANSFERT ==============
        if (cheque.transfererVers(epargne, 200)) {          
            System.out.println("Transfer de 200 du compte cheque vers le compte epargne, done! \n");          
        }else{
            System.out.println("Não consegui transferi");
        }                  
         cheque.depot(500);
         
          System.out.println(cheque.toString());
    }    
}
