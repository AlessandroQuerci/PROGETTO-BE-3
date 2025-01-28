package org.example.Classi;

public class ElementoCatalogo {

    private int codiceISBN;
    private String titolo;
    private int annoPublicazione;
    private int numPagine;

    public ElementoCatalogo(int codiceISBN, String titolo, int annoPublicazione, int numPagine) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPublicazione = annoPublicazione;
        this.numPagine = numPagine;
    }

    public int getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(int codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPublicazione() {
        return annoPublicazione;
    }

    public void setAnnoPublicazione(int annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    @Override
    public String toString() {
        return "ElementoCatalogo{" +
                "codiceISBN=" + codiceISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", numPagine=" + numPagine +
                '}';
    }
}
