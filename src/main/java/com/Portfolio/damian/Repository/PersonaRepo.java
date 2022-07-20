package com.Portfolio.damian.Repository;

import com.Portfolio.damian.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona, Long>{
}
