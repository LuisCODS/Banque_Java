package test;

import entites.CompteCheques;
import entites.Compte;
import entites.Client;
import entites.CompteEpargne;
import java.util.Date;

public class Test_transferer {

    public static void main(String[] args) {      
        
        double montantDepot = 1000.00;
        double montant      = 200.00;
        
        Client c1 = new Client("Santos","Luis"); 
        Client c2 = new Client("Bastos","Andrea"); 
        
        // Polymorphisme de reference  
        Compte cheque = new CompteCheques(new Date(), c1); 
        cheque.depot(montantDepot);   
        
        Compte epargne = new CompteEpargne(new Date(), c2);  
        
        System.out.println("LA BANQUE");
        System.out.println("Total de clients : " + Client.getTotalDeClient());  
        System.out.println("Total de comptes : " + Compte.getTotalDeCompte()+"\n");         
        System.out.println("Solde compte " + cheque.getType()+ " AVANT tranfert : $" +cheque.getSolde());
        
        // ============== TEST TRANSFERT ==============
        if (cheque.transfererVers(epargne, montant)) {   
            System.out.println("OPERATION: Transfer de $200 du compte cheque vers le compte epargne!");
        }else{
            System.out.println("ERREUR: échec dans le tranfert!");
        }               
       
        System.out.println(cheque.toString());
        System.out.println(epargne.toString());
    }    
}
