package com.sample.springboot.ProductApplication

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface ProductRepository : MongoRepository<Product, BigInteger> {

}
