package projet;

import entites.CompteCheques;
import entites.Compte;

public class Main {

    public static void main(String[] args) {
        
        // Polymorphisme de reference                           
        Compte cheque1 = new CompteCheques();
        Compte epargne = new CompteCheques();
        cheque1.setSolde(1000);    
        
        System.out.println("Total de comptes : " + Compte.getTotalDeCompte()+"\n"); 
        System.out.println("Solde du compte avant : " + cheque1.getSolde());
        
         if (cheque1.retrait(2000)) 
            System.out.println("Consegui sacar \n");               
         else      
            System.out.println("Não consegui sacar"); 
         
        System.out.println("Solde du compte apres " + cheque1.getSolde()); 

    }
    
}
