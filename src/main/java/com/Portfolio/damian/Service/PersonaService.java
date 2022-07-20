package com.Portfolio.damian.Service;

import com.Portfolio.damian.Entity.Persona;
import com.Portfolio.damian.Repository.PersonaRepo;
import com.Portfolio.damian.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class PersonaService {
    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo) {

        this.personaRepo = personaRepo;
    }

    public Persona addPersona(Persona persona){
        return personaRepo.save(persona);
    }
    public List<Persona> buscarPersona(){
        return personaRepo.findAll();
    }
    public Persona editarPersona(Persona persona){
        return personaRepo.save(persona);
    }
    public void borrarPersona(Long id){
        personaRepo.deleteById(id);
    }
    public Persona buscarPersonaPorId(Long id){
            return personaRepo.findById(id).orElseThrow(()->new UserNotFoundException("persona no encotrada"));
}
}
