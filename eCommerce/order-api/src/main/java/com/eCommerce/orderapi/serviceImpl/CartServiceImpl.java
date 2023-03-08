package com.eCommerce.orderapi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.orderapi.DAO.CartDAO;
import com.eCommerce.orderapi.Model.Item;
import com.eCommerce.orderapi.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartDAO cartRepo;

	@Override
	public Item save(Item item) {
		
		return cartRepo.save(item);
	}
	
	
	


}
