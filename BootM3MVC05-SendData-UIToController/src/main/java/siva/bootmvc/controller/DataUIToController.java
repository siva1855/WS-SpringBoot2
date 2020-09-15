package siva.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import siva.bootmvc.model.Product;

@Controller
public class DataUIToController {

	/**
	 * This method is used to show ProductRegister.jsp at browser when they enter
	 * URL /reg
	 */

	// 1. Show 'ProductReg.jsp'-/reg(GET)
	@RequestMapping("/reg")
	public String showReg() {

		return "ProductRegister";
	}

	/**
	 * On click Form Submit, container creates object, same object reading in
	 * Controller using @ModelAttribute, this data sending to UI using Model so that
	 * form data is displayed at ProductData.jsp page
	 */

	// 2. Read Form Data-/save(POST)
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String readForm(@ModelAttribute Product product, Model model) {

		model.addAttribute("productUI", product);

		return "ProductData";
	}
}
