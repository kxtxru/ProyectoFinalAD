package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Model.ProductType;

@Controller
public class ProductTypeController {
 
    List<ProductType> tiposProductos = addTypeProducts();

    private List<ProductType> addTypeProducts(){
        List<ProductType> tiposProductos = new ArrayList<>();
        tiposProductos.add(new ProductType(1L, "Mesa", "Diferentes tipos de mesa para comedores."));
        tiposProductos.add(new ProductType(2L, "Televisor", "Diferentes tipos de televisores para habitaciones."));
        tiposProductos.add(new ProductType(3L, "Silla", "Diferentes tipos de sillas para cocinas."));
        tiposProductos.add(new ProductType(4L, "Sofa", "Diferentes tipos de sofás para salone."));

        return tiposProductos;
    }


    @GetMapping("/typeProducts")
    public String listadoProductos(Model model){
        model.addAttribute("typeproducts", tiposProductos);
        return "typeProducts";
    }
}
