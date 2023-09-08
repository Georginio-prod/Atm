package atm;

import javax.swing.SwingUtilities;


public class Andro {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            //new AndroFrame().setVisible(true);
            //new ProjetAyimonlou().setVisible(true);
           // new Aes().setVisible(true);
        });
       /* double depost = 0;
        double retrait = 0;
        double solde = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Votre solde est de 1000$");
        System.out.println("Entrez votre opération (1 pour dépôt, 2 pour retrait) :");
        int operation = sc.nextInt();
            if (operation == 1) 
            {
                System.out.println("Entrez le montant à déposer :");
                depost = sc.nextDouble();
                solde = solde + depost;
                System.out.println("Votre nouveau solde est de " +  solde + "$");
                    if (depost== 0){
                        System.out.println("Vous ne pouvez pas effectuer un tel depot !");
                    }
            } 
                else if (operation == 2) 
                {
                    System.out.println("Entrez le montant à retirer :");
                    retrait = sc.nextDouble();

                        if (retrait >  solde) 
                        {
                            System.out.println("Vous ne pouvez pas effectuer un tel retrait.");
                        } 
                            else if (retrait ==0)
                            {
                                System.out.println("Vous ne pouvez pas effectuer un tel retrait.");
                            }
            
                        else {
                                solde =  solde - retrait;
                                System.out.println("Votre nouveau solde est de " +  solde + "$");
                            }
        } else {
            System.out.println("Opération non valide.");
        }*/
    }
}