package lt.bit.java.Giedrius.Nekrasas.services;

import lt.bit.java.Giedrius.Nekrasas.entities.Darbuotojas;
import lt.bit.java.Giedrius.Nekrasas.repositories.DarbuotojasRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;


@Service
public class DarbuotojasService {

    @Resource
    private DarbuotojasRepository darbuotojasRepository;


    public DarbuotojasRepository getdarbuotojasRepository() {
        return darbuotojasRepository;
    }

    public void setDarbuotojasRepository(DarbuotojasRepository darbuotojasRepository) {
        this.darbuotojasRepository = darbuotojasRepository;
    }

    public List<Darbuotojas> uzkrautiDuomenis() {
        return darbuotojasRepository.findAll();
    }

//    public int darbuotojuSkyriuje(String skyrius) {
//            return 0;
//        }


 }

