package samuelesimeone.eserciziou5w3d3.esercizio1.classi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;

    @Override
    public String toString() {
        return "Info{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}
