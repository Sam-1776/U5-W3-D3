package samuelesimeone.eserciziou5w3d3.esercizio3.classi;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Ufficiale implements Contabilita{
    private String nome;
    private String cognome;
    private int Stipendio;
    private String responsabile;
    private String lavoro;

    public Ufficiale(String nome, String cognome, int stipendio, String lavoro) {
        this.nome = nome;
        this.cognome = cognome;
        Stipendio = stipendio;
        this.lavoro = lavoro;
    }

    @Override
    public int stipendio() {
        return stipendio();
    }

    @Override
    public String toString() {
        return "Ufficiale{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", Stipendio=" + Stipendio +
                ", responsabile='" + responsabile + '\'' +
                ", lavoro='" + lavoro + '\'' +
                '}';
    }
}
