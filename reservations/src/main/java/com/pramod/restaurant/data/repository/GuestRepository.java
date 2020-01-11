/**
 * 
 */
package com.pramod.restaurant.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pramod.restaurant.data.entity.Guest;

/**
 * @author kkpramod
 *
 */
@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}
