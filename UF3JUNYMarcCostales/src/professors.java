public class professors {

    private String nom;

    private String cognoms;

    private String email;

    private String departament;

    private String carrec;

    public professors(String nom, String cognoms, String email, String departament, String carrec) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.email = email;
        this.departament = departament;
        this.carrec = carrec;
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

    public String getDepartament() {
        return departament;
    }

    public String getCarrec() {
        return carrec;
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

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setCarrec(String carrec) {
        this.carrec = carrec;
    }
    
    
}
