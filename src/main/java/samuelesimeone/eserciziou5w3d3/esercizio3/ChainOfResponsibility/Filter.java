package samuelesimeone.eserciziou5w3d3.esercizio3.ChainOfResponsibility;

import samuelesimeone.eserciziou5w3d3.esercizio3.classi.Gerarchia;
import samuelesimeone.eserciziou5w3d3.esercizio3.classi.Ufficiale;

public abstract class Filter {
    private Filter next;

    public abstract void check(Gerarchia ufficiali);

    public void next(Gerarchia ufficiali){
        if (this.next == null){
            System.out.println("Fine catena di filtri");
        }else {
            this.next.check(ufficiali);
        }
    }
}
