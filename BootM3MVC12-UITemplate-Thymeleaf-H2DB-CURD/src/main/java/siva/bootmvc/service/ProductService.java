package siva.bootmvc.service;

import java.util.List;
import java.util.Optional;

import siva.bootmvc.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public void deleteProduct(Integer id);

	public Optional<Product> getOneProduct(Integer id);

	public Integer saveProduct(Product product);

}
