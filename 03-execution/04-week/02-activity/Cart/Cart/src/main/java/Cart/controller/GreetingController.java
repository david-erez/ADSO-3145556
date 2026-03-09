package Cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    //aca se modifica para recibir un parametro desde la url este endpoint recive la solicitud get
    @GetMapping("/saludo/{name}")
    //aca se especifica que el parametro viene desde la url

    public String greeting(@PathVariable String name){
        return "hola"+ name;
    }
}
