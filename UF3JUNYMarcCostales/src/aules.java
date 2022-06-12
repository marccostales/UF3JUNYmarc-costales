public class aules {

    private String nom;

    private int capacitatMaximaAlumnes;

    private int quantitatOrdinadors;

    public aules(String nom, int capacitatMaximaAlumnes, int quantitatOrdinadors) {
        this.nom = nom;
        this.capacitatMaximaAlumnes = capacitatMaximaAlumnes;
        this.quantitatOrdinadors = quantitatOrdinadors;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacitatMaximaAlumnes() {
        return capacitatMaximaAlumnes;
    }

    public int getQuantitatOrdinadors() {
        return quantitatOrdinadors;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapacitatMaximaAlumnes(int capacitatMaximaAlumnes) {
        this.capacitatMaximaAlumnes = capacitatMaximaAlumnes;
    }

    public void setQuantitatOrdinadors(int quantitatOrdinadors) {
        this.quantitatOrdinadors = quantitatOrdinadors;
    }
    
    
}
