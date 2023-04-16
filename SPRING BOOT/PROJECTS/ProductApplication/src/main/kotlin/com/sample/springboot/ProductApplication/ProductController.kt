package com.sample.springboot.ProductApplication
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.math.BigInteger


@RestController
@RequestMapping("/api")
class ProductController(var productService: ProductService) {
    @GetMapping("/hello") //@RequestMapping(value="/",method=RequestMethod.GET)
    fun hello(): ResponseEntity<String> {
        return ResponseEntity("Hello World",HttpStatus.OK)
    }

    @PostMapping
    fun addProduct(@RequestBody product: Product) : ResponseEntity<Product> {
        return ResponseEntity.ok(productService.addProduct(product))
    }

    @GetMapping
    fun getProduct(@RequestParam id:BigInteger) : ResponseEntity<Product> {
        var product: Product? = productService.getProduct(id);
        if (product != null) {
            return ResponseEntity(product, HttpStatus.OK)
        } else {
            return ResponseEntity(HttpStatus.BAD_REQUEST)
        }
    }
}