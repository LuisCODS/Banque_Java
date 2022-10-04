package test;

import entites.Client;
import entites.Compte;
import entites.CompteCheques;
import java.util.Date;

public class Test_depot {
    
        public static void main(String[] args) {      
            
        double montantDepot     = 1000.00;
    
        Client client = new Client("Santos","Luis");         
        // Polymorphisme de reference  
        Compte cheque = new CompteCheques(new Date(), client);              
                             
        System.out.println("LA BANQUE");
        System.out.println("Total de clients : " + Client.getTotalDeClient());  
        System.out.println("Total de comptes : " + Compte.getTotalDeCompte()+"\n");  
        
        if (cheque.depot(montantDepot)){ 
            System.out.println("=============================");  
            System.out.println("Dépôt effectué avec succes!");            
            System.out.println("=============================");             
        }else{                  
            System.out.println("ERREUR: Valeur non permis! \n" );             
        }
        System.out.println(cheque.toString());  
    } 
}
