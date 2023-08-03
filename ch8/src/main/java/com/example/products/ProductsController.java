package com.example.products;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {

  private final ProductService productService;

//  We use DI through the controller’s constructor parameters to get the
//  service bean from the Spring context.
  public ProductsController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/products")
  public String viewProducts(Model model) {
    var products = productService.findAll();
    model.addAttribute("products", products);

    return "products.html";
  }

  @PostMapping("/products")
  public String addProduct(
//      @RequestParam String name,
//      @RequestParam double price,
          Product p,
      Model model
  ) {

//    Product p = new Product();
//    p.setName(name);
//    p.setPrice(price);
    productService.addProduct(p);

    var products = productService.findAll();
    model.addAttribute("products", products);

    return "products.html";
  }
}
