package org.example.Classi;

import org.example.Enum.Genere;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Libro extends ElementoCatalogo{


    private String autore;
    @Enumerated(EnumType.STRING)
    private Genere genere;

    public Libro(int codiceISBN, String titolo, int annoPublicazione, int numPagine, String autore, Genere genere) {
        super(codiceISBN, titolo, annoPublicazione, numPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                '}';
    }
}
