package com.sample.springboot.ProductApplication

import org.springframework.stereotype.Service
import org.springframework.data.repository.findByIdOrNull
import java.math.BigInteger

@Service
class ProductService(var productRepository: ProductRepository) {

    fun addProduct(product: Product): Product {
        return productRepository.save(product);
    }

    fun getProduct(id: BigInteger): Product? {
        return productRepository.findByIdOrNull(id)
    }

}