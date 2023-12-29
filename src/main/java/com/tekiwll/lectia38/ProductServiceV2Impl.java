package com.tekiwll.lectia38;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ProductServiceV2Impl implements ProductService {

    List<String> products = new ArrayList<>();



    @Override
    public List<String> getProducts() {
        if (products.size() == 0) {
            products.add("Smart Watch");
            products.add("Ipad");
        }
        return products;
    }
}
