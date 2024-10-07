package ie.atu.week_3b;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseService {
    private final List<Product> warehouseList = new ArrayList<>();

    public String addProduct(Product product) {
        warehouseList.add(product);
        return "Product added successfully to warehouse";
    }
}
