package com.eCommerce.orderapi.DAO;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.orderapi.Model.Item;

@Repository
public interface CartDAO extends CrudRepository<Item,  Integer>{
	
	

}
