package projet;

import entites.CompteCheques;
import entites.Compte;
import entites.Client;
import entites.CompteEpargne;

public class Main {

    public static void main(String[] args) {
        
        // Polymorphisme de reference     
        Client c = new Client();
        Compte cheque = new CompteCheques();
        Compte epargne = new CompteEpargne();
        
        c.setPrenom("Luis");      
               
        // Get total d'instances Client
        System.out.println("Total de clients : " + Client.getTotalDeClient() +"\n");   
        
        cheque.depot(1000);    
        cheque.setClient(c);
        
        // Prend le client lié au compte
        System.out.println("Nom du Client : "   + cheque.getClient().getPrenom()+"\n");
        
        System.out.println("Total de comptes : "                + Compte.getTotalDeCompte()+"\n"); 
        System.out.println("Solde du compte cheque avant : "    + cheque.getSolde());
        System.out.println("Solde du compte epargne avant : "   + epargne.getSolde()+"\n");
        
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
            
            System.out.println("Transfer de 200 du compte cheque vers le compte epargne done! \n");
            System.out.println("Solde du compte cheque apres "  + cheque.getSolde()); 
            System.out.println("Solde du compte epargne apres " + epargne.getSolde()); 
            
        }else{
            System.out.println("Não consegui transferi");
        }      
             
         cheque.depot(500);  
         System.out.println("Solde du compte cheque apres depot de 500 :"  + cheque.getSolde()); 

    }
    
}
