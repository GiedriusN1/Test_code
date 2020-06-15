package lt.bit.java.Giedrius.Nekrasas.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Uzduotis1 implements CommandLineRunner {

    /**
     * 1. Sukurkite klasę Darbuotojas kuri turėtų šiuos laukus: id, vardas, pavarde, gimimo_metai, pareigos, skyrius.
     */
    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */

    @Override
    public void run(String... args) throws Exception {
        String u1 = "  Uzduotis 1: Sukuriau klase Darbuotojas kuri turi nurodytus  laukus (package entities)";
        String separator = "**********************************************************************************************************";
        System.out.println("\u001b[30;1m" + separator);
        System.out.println((u1));
        System.out.println(separator + "\u001b[0m");
    }
}
