/**
 * 
 */
package com.pramod.restaurant.data.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pramod.restaurant.data.entity.Reservation;

/**
 * @author kkpramod
 *
 */
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
	List<Reservation> findByDate(Date date);
}
