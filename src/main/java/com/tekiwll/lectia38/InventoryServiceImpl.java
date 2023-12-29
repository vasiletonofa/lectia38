package com.tekiwll.lectia38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public class InventoryServiceImpl implements InventoryService {


    @Autowired
    ProductService productService;


    public void addProduct(String name) {
        productService.getProducts().add(name);
    }

    public List<String> getProducts() {
        return productService.getProducts();
    }

}
