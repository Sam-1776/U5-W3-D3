package samuelesimeone.eserciziou5w3d3.esercizio3.classi;

import lombok.ToString;

@ToString
public class Generale extends Ufficiale {
    public Generale(String nome, String cognome, int stipendio, String lavoro) {
        super(nome, cognome, stipendio, lavoro);
    }


    @Override
    public int stipendio() {
        return getStipendio();
    }

    @Override
    public String toString() {
        return "Generale{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", Stipendio=" + stipendio() +
                ", responsabile='" + getResponsabile() + '\'' +
                ", lavoro='" + getLavoro() + '\'' +
                '}';
    }
}
