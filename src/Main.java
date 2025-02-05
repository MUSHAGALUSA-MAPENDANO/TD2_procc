//CLASSE MAIN
public class Main {
    public static void main(String[] args) {
        
        //Creation des objets ou instances d'une classe
        Institution monInstitution = new Institution("INSTITUTION NATIONALE DE LA TECHNIQUE(RDC) ", "DRCongo", "PUBLIQUE", 1980);
        
        //Creation des objets Univesite de la classe Institution
        University universite1  = new University("ULPGL", "RDC", "PUBLIQUE", 2000, 5, "Ir. ERIC MAPENDANO", "LMD");
        University universite2  = new University("UCS", "RDC", "PRIVEE", 2017, 4, "Dr.MUSHAGALUSA ", "CLASSIQUE");
  
        //Creation des objets Ecole de la classe Institution
        Ecole monEcole1 = new Ecole("EP.NOTRE DAME DU CONGO ", "RDC", "PRIVEE", 1985, "PRIMAIRE", "ELIE CIRUZA", 25);
        Ecole monEcole2 = new Ecole("LYCEE ANUARITE ", "RDC", "PRIVEE", 1981, "SECONDAIRE", "Soeur ALIMASI Marcelline", 30);
        Ecole monEcole3 = new Ecole("INSTITUT ST FRANCOIS ", "RDC", "PUBLIQUE", 1985, "SECONDAIRE", "ALAIN MAPENDANO", 28);
        
        //Affichage de la description des institutions (universite et Ecole)
        System.out.println("=====================================================================");
        System.out.println("                   DESCRIPTION DES INSTITUTIONS ");
        System.out.println("=====================================================================");
        monInstitution.InstituteDescription();
        System.out.println("===============================================");
        universite1.descriptionUnivers();
        System.out.println("===============================================");
        monEcole2.SchoolDescription();
        System.out.println("===============================================");

        //Affichage des promoteurs et recteurs
        System.out.println("=====================================================================");
        System.out.println("                   AFFICHAGE DES UNIVERSITES ET ECOLES ");
        System.out.println("=====================================================================");
        
        //Affichage des recteurs des deux universités
        universite1.NomsRecteurs(universite1,universite2);
       
        //Affichage des promoteurs des ces trois ecoles créées
        System.out.println("=================================================");
        monEcole1.PromoteursEcoles(monEcole1,monEcole2,monEcole3);
         
    }
    
}


