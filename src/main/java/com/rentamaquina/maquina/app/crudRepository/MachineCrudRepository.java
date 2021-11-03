package com.rentamaquina.maquina.app.crudRepository;

import com.rentamaquina.maquina.app.entities.Machine;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author  ----------
 */
public interface MachineCrudRepository  extends CrudRepository<Machine,Integer> {
    
}
