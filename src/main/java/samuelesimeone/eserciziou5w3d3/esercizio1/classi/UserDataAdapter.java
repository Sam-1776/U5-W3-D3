package samuelesimeone.eserciziou5w3d3.esercizio1.classi;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

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
        LocalDate thisYear = LocalDate.now();
        int eta = thisYear.getYear() - year;
        return eta;
    }
}
