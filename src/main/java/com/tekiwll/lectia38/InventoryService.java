package com.tekiwll.lectia38;

import java.util.List;

public interface InventoryService {
    void addProduct(String name);

    List<String> getProducts();
}
