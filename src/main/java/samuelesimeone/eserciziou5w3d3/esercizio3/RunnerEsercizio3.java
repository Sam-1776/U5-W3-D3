package samuelesimeone.eserciziou5w3d3.esercizio3;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import samuelesimeone.eserciziou5w3d3.esercizio3.ChainOfResponsibility.ControlloStipendio;
import samuelesimeone.eserciziou5w3d3.esercizio3.classi.*;

import java.util.Locale;

@Component
public class RunnerEsercizio3 implements CommandLineRunner {

    private Faker faker = new Faker(Locale.ITALY);
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------------------------ Esercizio 3 -----------------------------------------------------------");


        Generale generale = new Generale(faker.name().firstName(), faker.name().lastName(), 5000, "Furiere");
        Colonnello colonnello = new Colonnello(faker.name().firstName(), faker.name().lastName(), 4000, "Magazziniere");
        Maggiore maggiore = new Maggiore(faker.name().firstName(), faker.name().lastName(), 3000, "Cuoco");
        maggiore.setResponsabile(colonnello.getCognome());
        Capitano capitano = new Capitano(faker.name().firstName(), faker.name().lastName(), 2000, "Furiere");
        capitano.setResponsabile(generale.getCognome());
        Tenente tenente = new Tenente(faker.name().firstName(), faker.name().lastName(), 1000, "Furiere");

        Gerarchia gerarchia = new Gerarchia();
        gerarchia.setPersone(tenente);
        gerarchia.setPersone(capitano);
        gerarchia.setPersone(maggiore);
        gerarchia.setPersone(colonnello);
        gerarchia.setPersone(generale);

        ControlloStipendio controlloStipendio = new ControlloStipendio(6000);

        controlloStipendio.check(gerarchia);



    }
}
