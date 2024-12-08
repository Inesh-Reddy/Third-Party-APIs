package com.exampl.thirdpartyapis.Controllers;

import com.exampl.thirdpartyapis.Models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    //CRUD operations
    @RequestMapping(value = "/Products", method = RequestMethod.GET)
    public String test() {
        return "Welcome to FakeStore";
    }
    @PostMapping(value = "/Products1")
    public void createProduct(@RequestBody Product product) {

    }

    @GetMapping(value = "/Products2")
    public List getAllProducts() {
        return null;
    }

    @PutMapping(value = "/Products3")
    public void updateProduct(@RequestBody Product product) {

    }

    @DeleteMapping(value = "/Products4")
    public void deleteProduct(@RequestBody Product product) {}
}
