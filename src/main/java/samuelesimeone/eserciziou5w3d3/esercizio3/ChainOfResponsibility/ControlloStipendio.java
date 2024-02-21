package samuelesimeone.eserciziou5w3d3.esercizio3.ChainOfResponsibility;

import samuelesimeone.eserciziou5w3d3.esercizio3.classi.Gerarchia;
import samuelesimeone.eserciziou5w3d3.esercizio3.classi.Ufficiale;

public class ControlloStipendio extends Filter{

    private int importo;

    public ControlloStipendio(int importo) {
        this.importo = importo;
    }


    @Override
    public void check(Gerarchia ufficiali) {
        for (Ufficiale ufficiale : ufficiali.getPersone()) {
            if (ufficiale.stipendio() == 1000){
                continue;
            }
            if (ufficiale.stipendio() == importo){
                System.out.println(ufficiale.toString());
            }else {
                System.out.println(ufficiale.getNome() + " " +  ufficiale.getCognome() + " non percepisce questo stipendio");
            }
        }
    }
}
