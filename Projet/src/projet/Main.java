package projet;

import entites.CompteCheques;
import entites.Compte;
import entites.CompteEpargne;

public class Main {

    public static void main(String[] args) {
        
        // Polymorphisme de reference                           
        Compte cheque = new CompteCheques();
        Compte epargne = new CompteEpargne();
        cheque.depot(1000);    
        
        System.out.println("Total de comptes : " + Compte.getTotalDeCompte()+"\n"); 
        System.out.println("Solde du compte cheque avant : " + cheque.getSolde());
        System.out.println("Solde du compte epargne avant : " + epargne.getSolde()+"\n");
        
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
            
            System.out.println("Transfer done! \n");
            System.out.println("Solde du compte cheque apres " + cheque.getSolde()); 
            System.out.println("Solde du compte epargne apres " + epargne.getSolde()); 
            
        }else{
            System.out.println("Não consegui transferi");
        }      
             
         


    }
    
}
