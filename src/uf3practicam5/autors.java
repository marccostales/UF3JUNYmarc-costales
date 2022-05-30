package uf3practicam5;

public class autors {

    private String nom;

    private String nacionalitat;

    private int dataNaixement;
    
    
    public autors(String nom, String nacionalitat, int dataNaixement) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.dataNaixement = dataNaixement;
    }
    

    public String getNom() {
        return nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public int getDataNaixement() {
        return dataNaixement;
    }

    public void setNom(String nom) {
        this.nom = nom;
        
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public void setDataNaixement(int dataNaixement) {
        this.dataNaixement = dataNaixement;
    }
    
}
