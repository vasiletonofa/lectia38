package com.tekiwll.lectia38;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class InventoryServiceV2Impl implements InventoryService {

    @Autowired
    ProductService productService;

    @Override
    public void addProduct(String name) {
        productService.getProducts().add(name + " -v2");
    }

    @Override
    public List<String> getProducts() {
        return productService.getProducts();
    }
}
