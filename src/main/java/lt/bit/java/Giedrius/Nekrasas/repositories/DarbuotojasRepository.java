package lt.bit.java.Giedrius.Nekrasas.repositories;

import lt.bit.java.Giedrius.Nekrasas.entities.Darbuotojas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Author: Giedrius Nekrašas
 *
 * Spring repositiry skirtas darbui su duomenų baze, lentele darbuotojai
 *
 *
 */




public interface DarbuotojasRepository extends JpaRepository<Darbuotojas, Integer> {

 //    int darbuotojuSkyriuje(String skyrius);

    Darbuotojas findDarbuotojasById(int id);

}
