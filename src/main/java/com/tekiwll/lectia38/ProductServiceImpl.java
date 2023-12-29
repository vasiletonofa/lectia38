package com.tekiwll.lectia38;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    List<String> products = new ArrayList<>();

    @Override
    public List<String> getProducts() {
        return products;
    }
}
