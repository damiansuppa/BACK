package com.Portfolio.damian.Security.Repository;

import com.Portfolio.damian.Security.Entity.Rol;
import com.Portfolio.damian.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iRolRepository extends JpaRepository <Rol, Integer>{
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
