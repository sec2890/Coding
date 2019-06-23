package com.codingdojo.productsandcategories.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository <Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}