package lt.bit.java.Giedrius.Nekrasas.runners;

import lt.bit.java.Giedrius.Nekrasas.entities.Darbuotojas;
import lt.bit.java.Giedrius.Nekrasas.repositories.DarbuotojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Užduotis 5.
 * Vykdymo klasėje sukurkite statinį metodą int darbuotojuSkyriuje(String skyrius)
 * kuris suskaičiuoja ir gražina kiek tam tikrame skyriuje dirba darbuotojų
 *
 */

@Component
@Order(4)
public class Uzduotis5 implements CommandLineRunner {

    @Autowired
    private DarbuotojasRepository darbuotojasRepository;

    @Override
    public void run(String... args) throws Exception {


        String u1 = "\n Uzduotis 5. Darbuotojų kiekis skyriuose ";
        String separator = "************************************************************************************";
        System.out.print("\u001b[30;1m"); // + separator);
        System.out.println((u1));
        System.out.println("\u001b[0m");


        // int darbuotojuSkyriuje(String skyrius)
        List<Darbuotojas> darbuotojai = darbuotojasRepository.findAll();



        darbuotojai.stream().collect(Collectors.groupingBy(Darbuotojas::getSkyrius)).forEach((skyrius, darb) -> {
            int count = darb.size();
            System.out.print("\u001b[30;1m");
            System.out.println(skyrius + "        " + count);
        });


        System.out.println("Iš viso darbuotojų  " + darbuotojai.size());
        System.out.println(separator + "\u001b[0m");
    }

}