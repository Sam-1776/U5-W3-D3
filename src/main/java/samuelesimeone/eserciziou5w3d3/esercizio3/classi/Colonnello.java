package samuelesimeone.eserciziou5w3d3.esercizio3.classi;

import lombok.ToString;

@ToString
public class Colonnello extends Ufficiale {
    public Colonnello(String nome, String cognome, int stipendio, String lavoro) {
        super(nome, cognome, stipendio, lavoro);
    }


    @Override
    public int stipendio() {
        return getStipendio();
    }

    @Override
    public String toString() {
        return "Colonnello{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", Stipendio=" + stipendio() +
                ", responsabile='" + getResponsabile() + '\'' +
                ", lavoro='" + getLavoro() + '\'' +
                '}';
    }
}
