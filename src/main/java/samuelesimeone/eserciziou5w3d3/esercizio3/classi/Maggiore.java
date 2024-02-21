package samuelesimeone.eserciziou5w3d3.esercizio3.classi;

import lombok.ToString;


public class Maggiore extends Ufficiale {

    public Maggiore(String nome, String cognome, int stipendio, String lavoro) {
        super(nome, cognome, stipendio, lavoro);
    }


    @Override
    public int stipendio() {
        return getStipendio();
    }

    @Override
    public String toString() {
        return "Maggiore{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", Stipendio=" + stipendio() +
                ", responsabile='" + getResponsabile() + '\'' +
                ", lavoro='" + getLavoro() + '\'' +
                '}';
    }
}
