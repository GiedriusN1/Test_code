package lt.bit.java.Giedrius.Nekrasas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class TestController {


    @RequestMapping("/test")
    public String index() {
        return "Spring Boot Web veikia!";
    }

}
