package mx.udg.mti.titustv.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hola controller
 */
@RestController
@RequestMapping("/api/hola")
public class HolaResource {

    private final Logger log = LoggerFactory.getLogger(HolaResource.class);

    /**
    * GET saludo
    */
    @GetMapping("/saludo")
    public String saludo() {
        return "saludo";
    }

}
