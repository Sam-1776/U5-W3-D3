package samuelesimeone.eserciziou5w3d3.esercizio2;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import samuelesimeone.eserciziou5w3d3.esercizio2.classi.Autore;
import samuelesimeone.eserciziou5w3d3.esercizio2.classi.Libro;
import samuelesimeone.eserciziou5w3d3.esercizio2.classi.Pagine;
import samuelesimeone.eserciziou5w3d3.esercizio2.classi.Sezione;

import java.util.Arrays;
import java.util.Locale;

@Component
public class RunnerEsercizio2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------------------------------------ Esercizio 2 -----------------------------------------------------------");

        Faker faker = new Faker(Locale.ITALY);

        Pagine pagine1 = new Pagine();
        Pagine pagine2 = new Pagine();
        Pagine pagine3 = new Pagine();
        Pagine pagine4 = new Pagine();
        Pagine pagine5 = new Pagine();
        Pagine pagine6 = new Pagine();

        Sezione sezione1 = new Sezione();
        sezione1.SetList(pagine1);
        sezione1.SetList(pagine2);
        sezione1.SetList(pagine6);
        Sezione sezione2 = new Sezione();
        sezione2.SetList(pagine3);
        sezione2.SetList(pagine4);

        Autore autore1 = new Autore(faker.name().firstName(), faker.name().lastName());

        Libro libro = new Libro(Arrays.asList(sezione1,sezione2, pagine5), Arrays.asList(autore1), 12.00);
        System.out.println("Numero di Pagine totali del libro: " + libro.pagineTotali());
    }
}
