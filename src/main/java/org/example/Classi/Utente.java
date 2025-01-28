package org.example.Classi;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "utenti")
public class Utente {
    @Id
    @GeneratedValue
    @Column(name = "nome_utente")
    private String nome;
    @Column(name = "cognome_utente")
    private String cognome;
    @Column(name = "numero_tessera")
    private long numTessera;
    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;

    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestiti;

    public Utente(String nome, String cognome, long numTessera, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.numTessera = numTessera;
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public long getNumTessera() {
        return numTessera;
    }

    public void setNumTessera(long numTessera) {
        this.numTessera = numTessera;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "dataDiNascita=" + dataDiNascita +
                ", numTessera=" + numTessera +
                ", cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
