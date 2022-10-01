package projet;

public class Main {

    public static void main(String[] args) {
        
        // Polymorphisme
        Compte epargne = new CompteEpargne();               
        Compte cheque = new CompteCheques();
        cheque.setSolde(1000);
           
        
        /*
         if (epargne.retrait(2000)) 
            System.out.println("Consegui sacar");              
         else      
            System.out.println("Não consegui sacar");        
        */
        if (epargne.transfererVers(epargne,2000)) 
            System.out.println("Consegui tranferir");              
         else      
            System.out.println("Não consegui sacar"); 
    }
    
}
