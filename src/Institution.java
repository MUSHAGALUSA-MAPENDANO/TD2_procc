// CLASSE INSTITUTION
public class Institution {
    private String nomInstitut;
    private String paysInstitut;
    private String typeInstitut;
    private int anneeCreation;
    
    //le constructeur pour l'institution
    public Institution (String nomInstitut,String paysInstitut,String typeInstitut,int anneeCreation){
        this.nomInstitut = nomInstitut;
        this.paysInstitut = paysInstitut;
        this.typeInstitut = typeInstitut;
        this.anneeCreation = anneeCreation;
    }

    //les getters
    public String getNomInstitut(){
        return nomInstitut;
    }
    public String getPaysInstitut(){
        return paysInstitut;
    }
    public String getTypeInstitut(){
        return typeInstitut;
    }
    public int getAnneeCreation(){
        return anneeCreation;
    }

    //les setters
    public void setNomInstitut(String nomInstitut){ 
        this.nomInstitut = nomInstitut;

    }
    
    public void setPaysInstitut(String paysInstitut){ 
        this.paysInstitut = paysInstitut;

    }
    public void setTypeInstitut(String typeInstitut){ 
        this.typeInstitut = typeInstitut;

    }
    public void setAneeCreation(int anneeCreation){ 
        this.anneeCreation = anneeCreation;

    }

    //Methode de calcul d'age selon l'annee courante
    public int AgeInstitution() {
        int anneeCourante = java.time.Year.now().getValue();
        int ageInst;
        ageInst = anneeCourante-anneeCreation;
        return ageInst;
    }

    //Methode de description 
    public void InstituteDescription(){
        System.out.println("            NOM DE L'INSTITUTION : "+nomInstitut);
        System.out.println("            AGE : "+AgeInstitution()+"ans");
        System.out.println("            PAYS DE L'INSTITUTION : "+paysInstitut);
        System.out.println("            TYPE D'INSTITUTION : "+typeInstitut);
        System.out.println("            ANNEE DE CREATION : "+anneeCreation);
    }

}




        
