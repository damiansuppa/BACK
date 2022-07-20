package com.Portfolio.damian.Controller;

import com.Portfolio.damian.Entity.Persona;
import com.Portfolio.damian.Service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/persona")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    @GetMapping("/id/{id}")

    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id){
        Persona persona=personaService.buscarPersonaPorId(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona){
        Persona updatePersona=personaService.editarPersona(persona);
        return new ResponseEntity<>(updatePersona,HttpStatus.OK);
    }

}
