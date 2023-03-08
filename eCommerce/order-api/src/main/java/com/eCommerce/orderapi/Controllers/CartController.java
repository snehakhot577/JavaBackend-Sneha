package com.eCommerce.orderapi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.orderapi.Model.Item;
import com.eCommerce.orderapi.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	
	@Autowired
	private CartService cartServices;
	
	@PostMapping("/addToCart")
	public Item saveItem(@RequestBody Item item) {
		return cartServices.save(item);
		
	}

}
