// SOUS-CLASSE ECOLE
 public class Ecole extends Institution  { 
    private String typeEcole;
    private String nomPromoteur;
    private int nombreClasses;

    //Le constructeur
    public Ecole(String nomInstitut,String paysInstitut,String typeInstitut,int anneeCreation
        ,String typeEcole,String nomPromoteur,int nombreClasses){ 
        super(nomInstitut, paysInstitut, typeInstitut, anneeCreation);
        this.typeEcole = typeEcole;
        this.nomPromoteur = nomPromoteur;
        this.nombreClasses = nombreClasses;
    }

    // Les getters de la sous_classe
    public String  getTypeEcole(){
        return typeEcole;
    }
   
    public int  getNombreClasses(){
        return nombreClasses;
    }
    public String  getNomPromoteur(){
        return nomPromoteur;
    }

    //Les setters 
    public void setTypeEcole(String typeEcole){
        this.typeEcole =typeEcole;
    }
    public void setNomPromoteur(String nomPromoteur){
        this.nomPromoteur =nomPromoteur;
    }
    public void setNombreClasses(int nombreClasses){
        this.nombreClasses =nombreClasses;
    }
    
    // Methodes d'instances
    public void SchoolDescription (){
        InstituteDescription();
        System.out.println("            TYPE D'ECOLE : "+typeEcole);
        System.out.println("            NOM DU PROMOTEUR : "+nomPromoteur);
        System.out.println("            NOMBRE DES CLASSES : "+nombreClasses);
    }
    public void PromoteursEcoles(Ecole school1,Ecole school2,Ecole school3){
        System.out.println("LES NOMS D'ECOLES ET LEURS PROMOTEURS");
        System.out.println("1 . "+school1.getNomInstitut()+": "+school1.nomPromoteur);
        System.out.println("2 . "+school2.getNomInstitut()+": "+school2.nomPromoteur);
        System.out.println("3 . "+school3.getNomInstitut()+": "+school3.nomPromoteur);
        
    }

 }

