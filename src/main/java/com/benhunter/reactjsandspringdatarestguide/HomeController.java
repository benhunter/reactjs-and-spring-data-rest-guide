package com.benhunter.reactjsandspringdatarestguide;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
        // index is the name of the template that will map to:
        //  src/main/resources/templates/index.html
    }

}
