package siva.bootmvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import siva.bootmvc.model.Product;
import siva.bootmvc.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
//1
	@RequestMapping("/all")
	public String fetchAllProducts(Model model) {
		List<Product> list = productService.getAllProducts();
		model.addAttribute("listAllDataMessage", list);
		return "ProductsData";
	}
//2
	@RequestMapping("/delete/{id}")
	public String deleteProductObj(@PathVariable("id") Integer id, Model model) {
		// deleting row based on Primary Key
		productService.deleteProduct(id);

		// fetching new Data
		List<Product> list = productService.getAllProducts();
		model.addAttribute("listAllDataMessage", list);

		model.addAttribute("deleteMassage", id + " - is deleted");

		// return "redirect:../all";
		return "ProductsData";
	}
//3
	@RequestMapping("/view/{id}")
	public String getOneProductObj(@PathVariable("id") Integer id, Model model) {

		Optional<Product> optional = productService.getOneProduct(id);
		if (optional.isPresent()) {
			model.addAttribute("oneProductData", optional.get());

		} else {
			model.addAttribute("ElseOneProductMessage", "No Data Found");
		}
		return "ProductOne";
	}
//4
	@RequestMapping("/register")
	public String showRegisterPage(Model model) {
		model.addAttribute("product", new Product());
		return "ProductRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute Product product, Model model) {
		Integer id = productService.saveProduct(product);
		String message = "Product saved with :" + id;
		model.addAttribute("saveMessage", message);
		// clear form
		model.addAttribute("product", new Product());
		return "ProductRegister";
	}
	//5
	@RequestMapping("/edit/{id}")
	public String showEditPage(@PathVariable("id")Integer id,Model model ) {
		Optional<Product> optional = productService.getOneProduct(id);
		if (optional.isPresent()) {
			model.addAttribute("product", optional.get());

		} else {
			model.addAttribute("product", new Product());
		}
		return "ProductEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute Product product,Model model) {
		Integer id = productService.saveProduct(product);
		model.addAttribute("updateMessage","Product Updated :"+id);
		//fetch new data
		List<Product> list = productService.getAllProducts();
		model.addAttribute("listAllDataMessage", list);
		return "ProductsData";
	}
}
