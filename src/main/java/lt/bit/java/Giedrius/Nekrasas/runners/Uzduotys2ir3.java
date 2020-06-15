package lt.bit.java.Giedrius.Nekrasas.runners;

import lt.bit.java.Giedrius.Nekrasas.entities.Darbuotojas;
import lt.bit.java.Giedrius.Nekrasas.services.DarbuotojasService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
@Order(2)
public class Uzduotys2ir3 implements CommandLineRunner {

    /**
     * Užduotis 2. Vykdymo klasėje (main metode) sukurkite Darbuotojas klasės objektus talpinančią
     * kolekciją (LinkedList, ArrayList ar kitą).
     */

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */

    @Resource // galime be sios anotacijos bet tada reikia kurti konstruktoriu
    private DarbuotojasService darbuotojasService;

    @Override
    public void run(String... args) throws Exception {

        List<Darbuotojas> darbuotojai = new ArrayList<>();
        List darb = darbuotojasService.uzkrautiDuomenis();
        String u1 = "  Uzduotis 2 ir 3: Darbuotojas klases objektu kolekcija sukuriau DarbuotojasService, uzkroviau duomenis";
        String separator = "**********************************************************************************************************";
        System.out.print("\u001b[30;1m"); // + separator);
        //   System.out.println(" \u001b[44m " + separator); // u001b[30;1m
        System.out.println((u1));
        System.out.println(darb);
        System.out.println(separator + "\u001b[0m");

    }


}
