package com.onetomanyunidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entitys.Dimensions;
import com.entitys.Product;
import com.repositories.ProductRepository;

@Component
public class EmbeddedMapping {

	@Autowired
	ProductRepository productrepo;
	
	public void example() {
		Product prod = new Product();
		prod.setName("cooler");
		
		Dimensions dimensions = new Dimensions();
		dimensions.setHeight(2);
		dimensions.setLength(1);
		dimensions.setWidth(1);
		
		prod.setDimensions(dimensions);
//		productrepo.save(prod);
		
		System.out.println(productrepo.findById(1).orElse(null));
	}
}
