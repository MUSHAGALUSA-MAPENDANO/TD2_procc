  //sous_classe UNIVERSITE 
  public class University extends  Institution{ 
    
    private int nombreFac;
    private String nomRect;
    private String systemeEnseignement;

    //le constructeur
    public University (String nomInstitut,String paysInstitut,String typeInstitut,int anneeCreation,int nombreFac
        ,String nomRect,String systemeEnseignement){ 
        super(nomInstitut, paysInstitut, typeInstitut, anneeCreation);
        this.nombreFac = nombreFac;
        this.nomRect =nomRect;
        this.systemeEnseignement =systemeEnseignement;
    }

    //les getters pour les attributs de l'université
    public int getNombreFac(){
        return nombreFac;
    }
    public String getNomRect(){
        return nomRect;
    }
    public String getSystemeEnseignement(){
        return systemeEnseignement;
    }

    //les setters
    public void setNombreFac(int nombreFac){ 
        this.nombreFac= nombreFac;

    }
    public void setNomRect(String nomRect){ 
        this.nomRect= nomRect;

    }
    public void setSystemeEnseignement(String systemeEnseignement){ 
        this.systemeEnseignement= systemeEnseignement;

    }

    
    //Methodes d'instances
    public void descriptionUnivers(){
        InstituteDescription();
        System.out.println("            NOM DE FACULTES : "+nombreFac);
        System.out.println("            NOM DU RECTEUR : "+nomRect);
        System.out.println("            SYSTEME D'ENSEIGNEMENT: "+systemeEnseignement);

    }
    public void NomsRecteurs(University universityOne,University universityTwo){ 
        System.out.println("LES DEUX PREMIERES UNIVERSITES ET LEURS RECTEURS");
        System.out.println("1. "+universityOne.getNomInstitut()+": "+universityOne.getNomRect());
        System.out.println("2. "+universityTwo.getNomInstitut()+": "+universityTwo.getNomRect());
        
    }
}
