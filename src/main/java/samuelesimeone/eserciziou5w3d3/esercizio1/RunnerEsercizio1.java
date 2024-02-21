package samuelesimeone.eserciziou5w3d3.esercizio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import samuelesimeone.eserciziou5w3d3.esercizio1.classi.DataSource;
import samuelesimeone.eserciziou5w3d3.esercizio1.classi.Info;
import samuelesimeone.eserciziou5w3d3.esercizio1.classi.UserData;
import samuelesimeone.eserciziou5w3d3.esercizio1.classi.UserDataAdapter;

import java.util.Date;

@Component
public class RunnerEsercizio1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------------------------ Esercizio 1 -----------------------------------------------------------");
        Info infoUser = new Info("Andrea", "Sportillo",new Date());
        System.out.println(infoUser.toString());
        UserDataAdapter userDataAdapter = new UserDataAdapter(infoUser);
        UserData user = new UserData();
        user.getData(userDataAdapter);
        System.out.println(user.toString());
    }
}
