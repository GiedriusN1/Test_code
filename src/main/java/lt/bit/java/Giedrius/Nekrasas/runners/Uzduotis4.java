package lt.bit.java.Giedrius.Nekrasas.runners;


import lt.bit.java.Giedrius.Nekrasas.entities.Darbuotojas;
import lt.bit.java.Giedrius.Nekrasas.repositories.DarbuotojasRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Užduotis 4
 * Suprogramuokite kolekcijos išvedimą taip, kad visi darbuotojai kolekcijoje būtų išdėlioti ir išvedami didėjimo tvarka:
 * pagal skyrių, jei skyrius yra vienodas,
 * tuomet pagal pareigas,
 * jei pareigos yra vienodos tuomet pagal vardus.
 *
 */



@Component
@Order(3)
public class Uzduotis4 implements CommandLineRunner {

    @Resource
    private DarbuotojasRepository darbuotojasRepository;

    @Override
    public void run(String... args) throws Exception {


        String u1 = " Uzduotis 4. darbuotojai išdėlioti ir išvedami didėjimo tvarka pagal skyriu, pareigas, varda \n";
        String separator = "************************************************************************************";
        System.out.print("\u001b[30;1m"); // + separator);
        System.out.println((u1));
        System.out.println("\u001b[0m");

        Sort skyriusSort = Sort.by("skyrius");
        Sort pareigosSort = Sort.by("pareigos");
        Sort vardasSort = Sort.by("vardas");
        Sort bendrasSort = skyriusSort.and(pareigosSort.and(vardasSort));
        List<Darbuotojas> darbuotojai = darbuotojasRepository.findAll(bendrasSort);

        System.out.print("\u001b[30;1m");
        System.out.println("Rasta iš viso darbuotojų " + darbuotojai.size());
        darbuotojai.forEach(drb -> System.out.println(drb.getId() + " " + drb.getSkyrius() + " "+ drb.getPavarde() + " " + drb.getVardas() + " " + drb.getPareigos()));

        System.out.println(separator + "\u001b[0m");
    }

}
