package com.myapp.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
	 jdbcTemplate.update("insert into pyproducts(productId,productName,price,description) values (?,?,?,?)",product.getProductId(),product.getProductName(),product.getPrice(),product.getDescription());
	 return product;
	}
	
	 

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update pyproducts set price=? where productId=? ",product.getPrice(),product.getProductId());
		 return product;
	}
	//@Override
	
//	private PreparedStatementSetter productId() {
//		// TODO Auto-generated method stub
//		return null;
//	}



	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from pyproducts", new BeanPropertyRowMapper<>(Product.class));
		
	}

	@Override
	public void delete(Integer productid) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from pyproducts where productId=?" ,productid);

	}



	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from pyproducts where productId=?",new BeanPropertyRowMapper<>(Product.class),id);
	}

}
