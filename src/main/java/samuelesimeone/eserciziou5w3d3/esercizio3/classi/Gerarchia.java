package samuelesimeone.eserciziou5w3d3.esercizio3.classi;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Gerarchia implements Contabilita{
    List<Ufficiale> Persone = new ArrayList<>();

    public void setPersone(Ufficiale persone) {
        Persone.add(persone);
    }

    @Override
    public int stipendio() {
        for (Ufficiale ufficiale : Persone) {
            return ufficiale.stipendio();
        }
        return 0;
    }
}
