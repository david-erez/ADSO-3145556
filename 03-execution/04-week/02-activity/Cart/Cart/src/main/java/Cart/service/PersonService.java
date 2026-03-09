package Cart.service;




import Cart.entity.Person;
import Cart.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private IPersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person save(Person person){
        return personRepository.save(person);
    }
}
