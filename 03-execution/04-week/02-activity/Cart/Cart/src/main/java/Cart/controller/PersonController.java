
package Cart.controller;

import Cart.entity.Person;
import Cart.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")//este sirve para aclarar la ruta de adceso a nuestro endPoint, se pueden alcarar mas rutas  asi : ({"/hello","/perro"})
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

/*este sirve     para crear una persona*/

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person) {
        Person savedPerson = service.save(person);
        return new ResponseEntity<>(savedPerson, HttpStatus.CREATED);
    }
    //algunas anotaciones requieren stributos en algunos puede ser o no necesarios
    //GetMapping si necesita de atributos, el cual va a ser la url o un sufijo con el cual se va a acceder a este endPoint
    //un endPoint es lo siguiente es un punto de adceso en una aplicacion web o resftfull,
    //este va a mapiar y listar personas
    @GetMapping
    public ResponseEntity<List<Person>> all() {
        List<Person> people = service.findAll();
        return new ResponseEntity<>(people, HttpStatus.OK);
    }
}

