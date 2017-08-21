package  com.inrhythm.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inrhythm.model.Product;
import com.inrhythm.service.MockDataService;

@CrossOrigin(origins = "*", maxAge = 3600)
@Validated
@RestController
public class ProductsController {
    
    @RequestMapping("/products")
    public @ResponseBody List<Product> getAllProducts() {
        return MockDataService.getProductList();
    }
    
    @RequestMapping("/products/{sku}")
    public @ResponseBody Product getProduct(@PathVariable Long sku) {
        return MockDataService.getProduct(sku);
    }
}
