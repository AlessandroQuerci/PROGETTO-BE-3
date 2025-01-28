package org.example.Classi;



import org.example.Enum.Periodicita;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Rivista extends ElementoCatalogo {


    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Rivista(int codiceISBN, String titolo, int annoPublicazione, int numPagine, Periodicita periodicita) {
        super(codiceISBN, titolo, annoPublicazione, numPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                '}';
    }
}
