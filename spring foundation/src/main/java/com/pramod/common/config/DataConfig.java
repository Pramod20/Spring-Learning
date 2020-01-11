/**
 * 
 */
package com.pramod.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pramod.common.data.repository.CustomerRepository;
import com.pramod.common.data.repository.InventoryItemRepository;
import com.pramod.common.data.repository.SalesOrderRepository;

/**
 * @author kkpramod
 *
 */
@Configuration
public class DataConfig {
	
	@Bean
	public InventoryItemRepository inventoryItemRepository() {
		return new InventoryItemRepository();
	}
	
	@Bean CustomerRepository customerRepository()
	{
		return new CustomerRepository();
	}
	
	@Bean SalesOrderRepository salesOrderRepository()
	{
		return new SalesOrderRepository();
	}
	
}
