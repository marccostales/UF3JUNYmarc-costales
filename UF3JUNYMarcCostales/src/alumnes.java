public class alumnes {

    
    private String nom;

    private String cognoms;

    private String email;

    private String dataNaixement;

    private int codiCicle;

    public alumnes(String nom, String cognoms, String email, String dataNaixement, int codiCicle) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.email = email;
        this.dataNaixement = dataNaixement;
        this.codiCicle = codiCicle;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNaixement() {
        return dataNaixement;
    }

    public int getCodiCicle() {
        return codiCicle;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public void setCodiCicle(int codiCicle) {
        this.codiCicle = codiCicle;
    }
    
    
}
