package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.Product;








@Controller
public class ProductController {

    List<Product> productos = addProducts();

    private List<Product> addProducts(){
        List<Product> productos = new ArrayList<Product>();
        productos.add(new Product(1L, "Mesa circular Razor", 200L));
        productos.add(new Product(2L, "Módulo televisor Candy", 850L));
        productos.add(new Product(3L, "Silla metálica Candy", 180L));
        productos.add(new Product(4L, "Sillón chaiselonge Roma", 1200L));
        return productos;
    }
    
    @GetMapping("/products")
    public String listadoProductos(Model model){
        model.addAttribute("productos", productos);
        return "products";
    }

    @GetMapping("/formNewProduct")
    public String formNewProduct(Model model) {
        model.addAttribute("product", new Product(null, null, null));
        return "formNewProduct";
    }
    
    @PostMapping("/formPostNewProduct")
    public void postProducto(@ModelAttribute Product product) {
        productos.add(product);
    }
    

}
