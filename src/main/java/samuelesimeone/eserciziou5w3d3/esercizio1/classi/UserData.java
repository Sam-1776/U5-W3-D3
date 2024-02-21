package samuelesimeone.eserciziou5w3d3.esercizio1.classi;


import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCognome();
        eta = ds.getEta();
    }
}
