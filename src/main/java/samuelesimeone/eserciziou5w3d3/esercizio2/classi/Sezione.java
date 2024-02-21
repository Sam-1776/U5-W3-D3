package samuelesimeone.eserciziou5w3d3.esercizio2.classi;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements GetPageNumber {

    private List<GetPageNumber> sezioniOrPagine = new ArrayList<>();

    public void SetList(GetPageNumber getPageNumber){
        this.sezioniOrPagine.add(getPageNumber);
    }
    @Override
    public int getPageNumber() {
        return this.sezioniOrPagine.stream().mapToInt(GetPageNumber::getPageNumber).sum();
    }
}
