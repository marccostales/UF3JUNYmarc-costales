package uf3practicam5;


import java.util.List;

public class Llibres {

    private String nom;

    private List <tipusLlibre> tipusLlibre;

    private String editorial;

    private int any;

    private List <autors> autors;    

    public Llibres(String nom, List<tipusLlibre> tipusLlibre, String editorial, int any, List<autors> autors) {
        this.nom = nom;
        this.tipusLlibre = tipusLlibre;
        this.editorial = editorial;
        this.any = any;
        this.autors = autors;
    }

    public String getNom() {
        return nom;
    }

    public List<tipusLlibre> getTipusLlibre() {
        return tipusLlibre;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAny() {
        return any;
    }

    public List<autors> getAutors() {
        return autors;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTipusLlibre(List<tipusLlibre> tipusLlibre) {
        this.tipusLlibre = tipusLlibre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public void setAutors(List<autors> autors) {
        this.autors = autors;
    }
    
}
