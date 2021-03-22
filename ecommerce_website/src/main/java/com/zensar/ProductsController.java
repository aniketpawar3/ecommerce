package com.zensar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zensar.Products;
import com.zensar.ProductsService;

@Controller
public class ProductsController {
	@Autowired
	ProductsService service;
	@Autowired
	Products product;

	@RequestMapping("/")
	public ModelAndView openHomePage() {
		List<Products> listofproduct = service.getProducts();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("checkout.jsp");
		mv.addObject("listofproduct", listofproduct);

		return mv;
	}

}