package com.microservice.productservice.controller;

import com.microservice.productservice.model.ProductDetailsResDTO;
import com.microservice.productservice.model.ProductReqDTO;
import com.microservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductReqDTO productReqDTO) {
      long id =  productService.addProduct(productReqDTO);
      return new ResponseEntity<>(id, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDetailsResDTO> getProductById(@PathVariable("id") long productId) {
        ProductDetailsResDTO productDetailsResDTO = productService.getProductById(productId);
        return ResponseEntity.ok(productDetailsResDTO);
    }
}
