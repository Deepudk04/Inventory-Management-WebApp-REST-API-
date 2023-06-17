package com.example.InventoryManagementSpring;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() throws SQLException 
	{
		//List<Product> ans=ps.getAllProd();
		return ps.getAllProd();
	}
	
	@GetMapping("/product/{name}")
	public Product getProduct(@PathVariable String name) 
	{
		//List<Product> ans=ps.getAllProd();
			
		
		return ps.getProd(name);
	}
	
	
	
	@PostMapping("/product")
	public String addProduct(@RequestBody Product p) throws SQLException
	{
		ps.addProduct(p);
		
		return "Product Added Successfully";
	}
	
	@PutMapping("/product")
	public String updateProduct(@RequestBody Product p) throws SQLException
	{
		ps.updateProduct(p);
		return "Updated Successfully!";
	}
	
	
	@DeleteMapping("/product/{id}")
	public String delProduct(@PathVariable int id) 
	{
			
		ps.delProd(id);
		return "Deleted Successfully!";
	}

}
