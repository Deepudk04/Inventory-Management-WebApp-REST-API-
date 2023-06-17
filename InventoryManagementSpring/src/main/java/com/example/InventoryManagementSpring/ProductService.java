package com.example.InventoryManagementSpring;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	@Autowired
	ProductDB db;


	public void addProduct(Product p) throws SQLException
	{
		db.save(p);
	}

	public List<Product> getAllProd() throws SQLException {
		
		return db.findAll();
	}

	public Product getProd(String name) {
		
		return db.findByName(name);
	}

	public void delProd(int id) {
		
		db.deleteById(id);
	}

	public void updateProduct(Product p) {
		
		db.save(p);
		
	}

	public Product getProdbyID(int id) {
		
		return db.findByPid(id);
	}
	
	
	
}
