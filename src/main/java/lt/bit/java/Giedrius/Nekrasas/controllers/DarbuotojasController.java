package lt.bit.java.Giedrius.Nekrasas.controllers;

import lt.bit.java.Giedrius.Nekrasas.entities.Darbuotojas;
import lt.bit.java.Giedrius.Nekrasas.repositories.DarbuotojasRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;


/**
 * Author: Giedrius Nekrašas
 *
 *
 * controller dirba su web užklausomis naudonantis MVC
 */

    @Controller
    @RequestMapping("/darbuotojas")
    public class DarbuotojasController {

        @Resource
        DarbuotojasRepository darbuotojasRepository;

        //    @GetMapping(value = "/darbuotojas")
        @GetMapping
        String index (Model model,
                      @RequestParam(defaultValue = "10", required = false) int pageSize,
                      @RequestParam(defaultValue = "0", required = false) int pageNumber)
        {

            Page<Darbuotojas> darbuotojas = darbuotojasRepository.findAll(PageRequest.of(pageNumber, pageSize));

            model.addAttribute("page", darbuotojas);
            return "darbuotojas/index";
        }


        // darbuotojo puslapis pasiekiamas nuoroda   /darbuotojas/{id}
        @GetMapping(path = "{id}")
        String darbuotojas(@PathVariable int id, Model model) {
            Darbuotojas darbuotojas = darbuotojasRepository.findDarbuotojasById(id);

            model.addAttribute("id", id);
            if (darbuotojas == null) return "darbuotojas/notFound";

            model.addAttribute("drb", darbuotojas);
            return "darbuotojas/get";
        }


        @GetMapping("/taisyti-form")
        String taisytiForm(@RequestParam int id, ModelMap modelMap) {
            Darbuotojas darbuotojas = darbuotojasRepository.getOne(id);
            modelMap.addAttribute("drb", darbuotojas);
            return "darbuotojas/taisyti-form";
        }

//    @GetMapping(path = "taisyti-form/{id}")
//    public String taisyti(@RequestParam(name = "id", required = false) Integer id) {
//        ModelAndView mav = new ModelAndView("taisyti-form");
//        if (id != null) {
//            Darbuotojas value = darbuotojasRepository.getOne(id);
//            mav.addObject("value", value);
//        }
//        return "darbuotojas/taisyti-form/{id}";
//    }id

    }
