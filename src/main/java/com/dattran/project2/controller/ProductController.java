package com.dattran.project2.controller;

import com.dattran.project2.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public String allProduct(ModelMap modelMap) {
        modelMap.addAttribute("productList", productService.findAll());
        return "allProduct";
    }
}
