/**
 * 
 */
package com.pramod.restaurant.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pramod.restaurant.data.entity.Room;

/**
 * @author kkpramod
 *
 */
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	Room findByNumber(String number);	
}