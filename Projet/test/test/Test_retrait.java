
package test;

import entites.Client;
import entites.Compte;
import entites.CompteCheques;
import java.util.Date;

public class Test_retrait {
        public static void main(String[] args) {      
        
        double montantDepot     = 1000.00;
        double montantRetrait   = 200.00;
        Client client = new Client("Santos","Luis"); 
        
        // Polymorphisme de reference  
        Compte cheque = new CompteCheques(new Date(), client); 
        cheque.depot(montantDepot);         
        
        System.out.println("Dépôt de $"+ cheque.getSolde()); 
        // ============== TEST RETRAIT ==============        
        if (cheque.retrait(montantRetrait)){ 
            System.out.println("=============================");  
            System.out.println("Retrait de $" + montantRetrait + " effectué avec succes!");  
            System.out.println("=============================");  
        }else{      
            System.out.println("Erreur: retrait invalide!");   
        }                
        System.out.println(cheque.toString());
    }  
}
