package Cart.controller;

import Cart.entity.Person;
import Cart.entity.Product;
import Cart.service.ProductService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProdutController {
    private final ProductService service;

    public ProdutController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        Product savedProduct = service.save(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
       @GetMapping
    public ResponseEntity<List<Product>> all() {
        List<Product> product = service.findAll();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
