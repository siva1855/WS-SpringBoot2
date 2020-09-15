package siva.bootmvc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siva.bootmvc.model.Product;
import siva.bootmvc.repository.ProductRepository;
import siva.bootmvc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = productRepository.findAll();
		return list;
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

	@Override
	public Optional<Product> getOneProduct(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public Integer saveProduct(Product product) {
		
		Double gst=product.getProductCost()*8/100.0;
		Double discount=product.getProductCost()*12/100.0;
		product.setProductGst(gst);
		product.setProductDiscount(discount);
		Integer id=productRepository.save(product).getProductId();
		
		return id;
	}
}
