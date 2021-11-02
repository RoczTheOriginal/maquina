package com.rentamaquina.maquinaria.app.crudRepository;

import com.rentamaquina.maquinaria.app.entities.Machine;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author  ----------
 */
public interface MachineCrudRepository  extends CrudRepository<Machine,Integer> {
    
}
