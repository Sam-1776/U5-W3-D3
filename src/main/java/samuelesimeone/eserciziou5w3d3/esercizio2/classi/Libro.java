package samuelesimeone.eserciziou5w3d3.esercizio2.classi;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Libro{
    List<GetPageNumber> sezioniEPagine;
    List<Autore> autori;
    double prezzo;

    public int pagineTotali(){
        return sezioniEPagine.stream().mapToInt(GetPageNumber::getPageNumber).sum();
    }
}
