package bddutils;

import model.*;

public class DataBaseClass{
    public static void insererDonnees{
        EntityManager em = EntityClass.getEntityManager();

        em.getTransaction().begin();

        adresse adresseClient = new adresse(1, "rue de la paix", "75000", "Paris"); 
        particulier client1 = new particulier(adresseClient,"LEMESRE","Victor", "0606662415");
        adresseClient.setP(client1);

        adresse adresseEntreprise = new adresse(32, "rue charles richet", "37200", "Tours")
        entreprise client2 = new entreprise("FR 32 123456789", "polytech", adresseEntreprise)
        adresseEntreprise.setP(client2);
        telephone telephone_entreprise1 = new telephone("0651515151", client2);
        telephone telephone_entreprise2 = new telephone("0616161616", client2);

        client2.addTelephone(telephone_entreprise1);
        client2.addTelephone(telephone_entreprise2);

        commercial commercial = new commercial("Paul");
        employeAdministratif employe_admin = new employeAdministratif("Theo");
        fabricant fabricant = new fabricant("Theo");

        adresse adresseLivraison1 = new adresse(15, "rue de la croix", "86000", "POITIERS");
        contrat contrat1 = new contrat("19-01-2021", adresseLivraison1, client2, commercial);

        adresse adresseLivraison2 = new adresse(19, "rue du soleil levant", "81756", "Saint Moutiers Les Maufais");
        contrat contrat2 = new contrat("18-06-2020",adresseLivraison2, client1, commercial);
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}