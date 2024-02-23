package com.microservice.productservice.service;

import com.microservice.productservice.model.ProductDetailsResDTO;
import com.microservice.productservice.model.ProductReqDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductService {
    long addProduct(ProductReqDTO productReqDTO);

    ProductDetailsResDTO getProductById(long productId);
}
