package com.reto3.repository.crud;

import com.reto3.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Santiago Garcia
 */
public interface ReservationCrudRepository extends CrudRepository <Reservation, Integer> {
}