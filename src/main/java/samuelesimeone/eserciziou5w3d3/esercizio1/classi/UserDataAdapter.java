package samuelesimeone.eserciziou5w3d3.esercizio1.classi;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class UserDataAdapter implements DataSource{
    private Info info;
    @Override
    public String getNomeCognome() {
        String nomeCompleto = info.getNome() + info.getCognome();
        return nomeCompleto;
    }

    @Override
    public int getEta() {
        int year = info.getDataDiNascita().getYear();
        Date thisYear = new Date();
        int eta = thisYear.getYear() - year;
        return eta;
    }
}
