package uf3practicam5;

import java.util.List;

public class Copia extends Llibres {

    private String idLlibre;

    private LocalitzacioCopia localitzacio;

    public Copia(String nom, List<uf3practicam5.tipusLlibre> tipusLlibre, String editorial, int any, List<uf3practicam5.autors> autors) {
        super(nom, tipusLlibre, editorial, any, autors);
    }
}
